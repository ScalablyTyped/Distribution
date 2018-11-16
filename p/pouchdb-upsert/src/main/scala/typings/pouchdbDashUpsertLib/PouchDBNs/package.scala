package typings
package pouchdbDashUpsertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PouchDBNs {
  type CancelUpsert = js.UndefOr[
    pouchdbDashUpsertLib.pouchdbDashUpsertLibStrings.Empty | pouchdbDashUpsertLib.pouchdbDashUpsertLibNumbers.`0` | pouchdbDashUpsertLib.pouchdbDashUpsertLibNumbers.`false` | scala.Null
  ]
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[
    /* doc */ pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content] | js.Object, 
    Content with (stdLib.Partial[pouchdbDashCoreLib.PouchDBNs.CoreNs.IdMeta] | CancelUpsert)
  ]
}
