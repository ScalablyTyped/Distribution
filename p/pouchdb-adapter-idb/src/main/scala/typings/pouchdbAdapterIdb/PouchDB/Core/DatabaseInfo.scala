package typings.pouchdbAdapterIdb.PouchDB.Core

import typings.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.base64
import typings.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInfo extends js.Object {
  var idb_attachment_format: js.UndefOr[base64 | binary] = js.undefined
}

object DatabaseInfo {
  @scala.inline
  def apply(idb_attachment_format: base64 | binary = null): DatabaseInfo = {
    val __obj = js.Dynamic.literal()
    if (idb_attachment_format != null) __obj.updateDynamic("idb_attachment_format")(idb_attachment_format.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInfo]
  }
}

