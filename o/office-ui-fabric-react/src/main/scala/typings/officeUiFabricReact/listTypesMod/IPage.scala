package typings.officeUiFabricReact.listTypesMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPage[T] extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var height: Double = js.native
  var isSpacer: js.UndefOr[Boolean] = js.native
  var isVisible: js.UndefOr[Boolean] = js.native
  var itemCount: Double = js.native
  var items: js.UndefOr[js.Array[T]] = js.native
  var key: String = js.native
  var startIndex: Double = js.native
  var style: CSSProperties = js.native
  var top: Double = js.native
}

object IPage {
  @scala.inline
  def apply[T](
    height: Double,
    itemCount: Double,
    key: String,
    startIndex: Double,
    style: CSSProperties,
    top: Double
  ): IPage[T] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPage[T]]
  }
  @scala.inline
  implicit class IPageOps[Self <: IPage[_], T] (val x: Self with IPage[T]) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIsSpacer(value: Boolean): Self = this.set("isSpacer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSpacer: Self = this.set("isSpacer", js.undefined)
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

