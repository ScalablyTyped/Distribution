package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `customXmlPart.toJSON()`. */
@js.native
trait CustomXmlPartData extends js.Object {
  /**
    *
    * The custom XML part's ID.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * The custom XML part's namespace URI.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[String] = js.native
}

object CustomXmlPartData {
  @scala.inline
  def apply(): CustomXmlPartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartData]
  }
  @scala.inline
  implicit class CustomXmlPartDataOps[Self <: CustomXmlPartData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNamespaceUri(value: String): Self = this.set("namespaceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceUri: Self = this.set("namespaceUri", js.undefined)
  }
  
}

