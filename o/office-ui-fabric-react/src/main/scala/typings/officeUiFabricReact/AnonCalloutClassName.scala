package typings.officeUiFabricReact

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalloutClassName extends js.Object {
  /**
    * Optional custom className for the callout that displays in larger viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var calloutClassName: js.UndefOr[String] = js.undefined
  /**
    * Prop to notify on what edge the dropdown callout was positioned respective to the title.
    */
  var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.undefined
  /**
    * Whether the dropdown is in an error state.
    */
  var hasError: Boolean
  /**
    * Specifies if the dropdown has label content.
    */
  var hasLabel: Boolean
  /**
    * Whether the dropdown is in an opened state.
    */
  var isOpen: Boolean
  /**
    * Whether the dropdown is presently rendering a placeholder.
    */
  var isRenderingPlaceholder: Boolean
  /**
    * Optional custom className for the panel that displays in small viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var panelClassName: js.UndefOr[String] = js.undefined
}

object AnonCalloutClassName {
  @scala.inline
  def apply(
    hasError: Boolean,
    hasLabel: Boolean,
    isOpen: Boolean,
    isRenderingPlaceholder: Boolean,
    calloutClassName: String = null,
    calloutRenderEdge: RectangleEdge = null,
    panelClassName: String = null
  ): AnonCalloutClassName = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], hasLabel = hasLabel.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isRenderingPlaceholder = isRenderingPlaceholder.asInstanceOf[js.Any])
    if (calloutClassName != null) __obj.updateDynamic("calloutClassName")(calloutClassName.asInstanceOf[js.Any])
    if (calloutRenderEdge != null) __obj.updateDynamic("calloutRenderEdge")(calloutRenderEdge.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalloutClassName]
  }
}

