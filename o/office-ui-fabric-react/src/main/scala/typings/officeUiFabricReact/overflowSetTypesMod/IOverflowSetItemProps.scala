package typings.officeUiFabricReact.overflowSetTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowSetItemProps
  extends /**
  * (Optional) Any additional properties to apply to the rendered links.
  */
/* propertyName */ StringDictionary[js.Any] {
  /**
    * Unique id to identify the item.
    */
  var key: String = js.native
  /**
    * Optional keytip for the overflowSetItem.
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
}

object IOverflowSetItemProps {
  @scala.inline
  def apply(key: String): IOverflowSetItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowSetItemProps]
  }
  @scala.inline
  implicit class IOverflowSetItemPropsOps[Self <: IOverflowSetItemProps] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
  }
  
}

