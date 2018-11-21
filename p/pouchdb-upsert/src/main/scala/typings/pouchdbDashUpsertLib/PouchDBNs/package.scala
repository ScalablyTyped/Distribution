package typings
package pouchdbDashUpsertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PouchDBNs {
  type CancelUpsert = js.UndefOr[
    pouchdbDashUpsertLib.pouchdbDashUpsertLibStrings.Empty | pouchdbDashUpsertLib.pouchdbDashUpsertLibNumbers.`0` | pouchdbDashUpsertLib.pouchdbDashUpsertLibNumbers.`false` | scala.Null
  ]
  // `Partial<Core.Document<Content>>` seems more useful than
  // `{} | Core.Document<Content>` since there isn't an easy way to narrow
  // `{} | Core.Document<Content>` to `Core.Document<Content>`.
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[
    /* doc */ stdLib.Partial[pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content]], 
    Content with (stdLib.Partial[pouchdbDashCoreLib.PouchDBNs.CoreNs.IdMeta] | CancelUpsert)
  ]
}
