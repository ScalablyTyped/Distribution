package typings.pouchdbUpsert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PouchDB {
  /* Rewritten from type alias, can be one of: 
    - typings.pouchdbUpsert.pouchdbUpsertStrings._empty
    - typings.pouchdbUpsert.pouchdbUpsertNumbers.`0`
    - typings.pouchdbUpsert.pouchdbUpsertBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type CancelUpsert = js.UndefOr[typings.pouchdbUpsert.PouchDB._CancelUpsert | scala.Null]
  // `Partial<Core.Document<Content>>` seems more useful than
  // `{} | Core.Document<Content>` since there isn't an easy way to narrow
  // `{} | Core.Document<Content>` to `Core.Document<Content>`.
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[
    /* doc */ typings.std.Partial[typings.pouchdbCore.PouchDB.Core.Document[Content]], 
    (Content with typings.pouchdbUpsert.anon.PartialIdMeta) | typings.pouchdbUpsert.PouchDB.CancelUpsert
  ]
}
