package typings.pouchdbFind.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ddoc extends js.Object {
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: js.UndefOr[String] = js.native
  /** List of fields to index */
  var fields: js.Array[String] = js.native
  /** Name of the index, auto-generated if you don't include it */
  var name: js.UndefOr[String] = js.native
  /** Only supports 'json', and it's also the default */
  var `type`: js.UndefOr[String] = js.native
}

object Ddoc {
  @scala.inline
  def apply(fields: js.Array[String]): Ddoc = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ddoc]
  }
  @scala.inline
  implicit class DdocOps[Self <: Ddoc] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setDdoc(value: String): Self = this.set("ddoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDdoc: Self = this.set("ddoc", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

