package typings.officeUiFabricReact.listTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageSpecification extends js.Object {
  /**
    * Data to pass through to the page when rendering.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The estimated pixel height of the page.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The number of items to allocate to the page.
    */
  var itemCount: js.UndefOr[Double] = js.native
  /**
    * The key to use when creating the page.
    */
  var key: js.UndefOr[String] = js.native
}

object IPageSpecification {
  @scala.inline
  def apply(): IPageSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageSpecification]
  }
  @scala.inline
  implicit class IPageSpecificationOps[Self <: IPageSpecification] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

