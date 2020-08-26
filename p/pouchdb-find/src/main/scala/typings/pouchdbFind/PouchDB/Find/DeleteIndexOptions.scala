package typings.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIndexOptions extends js.Object {
  /** Design document name */
  var ddoc: String = js.native
  /** Name of the index */
  var name: String = js.native
  /** Default 'json' */
  var `type`: js.UndefOr[String] = js.native
}

object DeleteIndexOptions {
  @scala.inline
  def apply(ddoc: String, name: String): DeleteIndexOptions = {
    val __obj = js.Dynamic.literal(ddoc = ddoc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexOptions]
  }
  @scala.inline
  implicit class DeleteIndexOptionsOps[Self <: DeleteIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDdoc(value: String): Self = this.set("ddoc", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

