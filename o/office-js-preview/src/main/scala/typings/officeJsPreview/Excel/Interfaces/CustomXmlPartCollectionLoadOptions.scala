package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of custom XML parts.
  *
  * [Api set: ExcelApi 1.5]
  */
@js.native
trait CustomXmlPartCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The custom XML part's ID.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The custom XML part's namespace URI.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[Boolean] = js.native
}

object CustomXmlPartCollectionLoadOptions {
  @scala.inline
  def apply(): CustomXmlPartCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartCollectionLoadOptions]
  }
  @scala.inline
  implicit class CustomXmlPartCollectionLoadOptionsOps[Self <: CustomXmlPartCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNamespaceUri(value: Boolean): Self = this.set("namespaceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceUri: Self = this.set("namespaceUri", js.undefined)
  }
  
}

