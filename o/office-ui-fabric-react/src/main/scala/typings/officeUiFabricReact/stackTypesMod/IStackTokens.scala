package typings.officeUiFabricReact.stackTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackTokens extends js.Object {
  /**
    * Defines the spacing between Stack children.
    * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
    * If 'column gap' is omitted, it's set to the same value as 'row gap'.
    */
  var childrenGap: js.UndefOr[Double | String] = js.native
  /**
    * Defines a maximum height for the Stack.
    */
  var maxHeight: js.UndefOr[Double | String] = js.native
  /**
    * Defines a maximum width for the Stack.
    */
  var maxWidth: js.UndefOr[Double | String] = js.native
  /**
    * Defines the padding to be applied to the Stack contents relative to its border.
    */
  var padding: js.UndefOr[Double | String] = js.native
}

object IStackTokens {
  @scala.inline
  def apply(): IStackTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackTokens]
  }
  @scala.inline
  implicit class IStackTokensOps[Self <: IStackTokens] (val x: Self) extends AnyVal {
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
    def setChildrenGap(value: Double | String): Self = this.set("childrenGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenGap: Self = this.set("childrenGap", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setPadding(value: Double | String): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

