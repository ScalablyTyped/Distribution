package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#post--db
// http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
trait DocumentInsertParams extends js.Object {
  // Stores document in batch mode.
  var batch: js.UndefOr[nanoLib.nanoLibStrings.ok] = js.undefined
  // Prevents insertion of a conflicting document. Possible values: true (default) and false. If false, a
  // well-formed _rev must be included in the document. new_edits=false is used by the replicator to insert
  // documents into the target database even if that leads to the creation of conflicts.
  var new_edits: js.UndefOr[scala.Boolean] = js.undefined
  // Document’s revision if updating an existing document. Alternative to If-Match header or document key.
  var rev: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentInsertParams {
  @scala.inline
  def apply(
    batch: nanoLib.nanoLibStrings.ok = null,
    new_edits: js.UndefOr[scala.Boolean] = js.undefined,
    rev: java.lang.String = null
  ): DocumentInsertParams = {
    val __obj = js.Dynamic.literal()
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (!js.isUndefined(new_edits)) __obj.updateDynamic("new_edits")(new_edits)
    if (rev != null) __obj.updateDynamic("rev")(rev)
    __obj.asInstanceOf[DocumentInsertParams]
  }
}

