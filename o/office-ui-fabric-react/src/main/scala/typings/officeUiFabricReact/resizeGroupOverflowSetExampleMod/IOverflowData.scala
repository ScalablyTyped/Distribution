package typings.officeUiFabricReact.resizeGroupOverflowSetExampleMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowData extends js.Object {
  var cacheKey: js.UndefOr[String] = js.native
  var overflow: js.Array[IContextualMenuItem] = js.native
  var primary: js.Array[IContextualMenuItem] = js.native
}

object IOverflowData {
  @scala.inline
  def apply(overflow: js.Array[IContextualMenuItem], primary: js.Array[IContextualMenuItem]): IOverflowData = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowData]
  }
  @scala.inline
  implicit class IOverflowDataOps[Self <: IOverflowData] (val x: Self) extends AnyVal {
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
    def setOverflowVarargs(value: IContextualMenuItem*): Self = this.set("overflow", js.Array(value :_*))
    @scala.inline
    def setOverflow(value: js.Array[IContextualMenuItem]): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryVarargs(value: IContextualMenuItem*): Self = this.set("primary", js.Array(value :_*))
    @scala.inline
    def setPrimary(value: js.Array[IContextualMenuItem]): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
  }
  
}

