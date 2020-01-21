package typings.officeUiFabricReact.stackItemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackItemTokens extends js.Object {
  /**
    * Defines the margin to be applied to the StackItem relative to its container.
    */
  var margin: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines the padding to be applied to the StackItem contents relative to its border.
    */
  var padding: js.UndefOr[Double | String] = js.undefined
}

object IStackItemTokens {
  @scala.inline
  def apply(margin: Double | String = null, padding: Double | String = null): IStackItemTokens = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackItemTokens]
  }
}

