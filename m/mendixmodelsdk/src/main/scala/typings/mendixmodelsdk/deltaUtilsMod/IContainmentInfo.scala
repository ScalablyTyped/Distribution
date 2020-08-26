package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.elementsMod.AbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainmentInfo extends js.Object {
  var element: AbstractElement = js.native
  var index: js.UndefOr[Double] = js.native
  var parentId: String = js.native
  var parentPropertyName: String = js.native
}

object IContainmentInfo {
  @scala.inline
  def apply(element: AbstractElement, parentId: String, parentPropertyName: String): IContainmentInfo = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContainmentInfo]
  }
  @scala.inline
  implicit class IContainmentInfoOps[Self <: IContainmentInfo] (val x: Self) extends AnyVal {
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
    def setElement(value: AbstractElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentPropertyName(value: String): Self = this.set("parentPropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

