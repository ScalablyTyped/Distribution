package typings.officeUiFabricReact.stackTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackTokens extends js.Object {
  /**
    * Defines the spacing between Stack children.
    * The property is specified as a value for 'row gap', followed optionally by a value for 'column gap'.
    * If 'column gap' is omitted, it's set to the same value as 'row gap'.
    */
  var childrenGap: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines a maximum height for the Stack.
    */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines a maximum width for the Stack.
    */
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * Defines the padding to be applied to the Stack contents relative to its border.
    */
  var padding: js.UndefOr[Double | String] = js.undefined
}

object IStackTokens {
  @scala.inline
  def apply(
    childrenGap: Double | String = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    padding: Double | String = null
  ): IStackTokens = {
    val __obj = js.Dynamic.literal()
    if (childrenGap != null) __obj.updateDynamic("childrenGap")(childrenGap.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackTokens]
  }
}

