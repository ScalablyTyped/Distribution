package typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutContentStyles extends js.Object {
  /**
    * Style for callout beak.
    */
  var beak: IStyle
  /**
    * Style for callout beak curtain.
    */
  var beakCurtain: IStyle
  /**
    * Style for content component of the callout.
    */
  var calloutMain: IStyle
  /**
    * Style for wrapper of Callout component.
    */
  var container: IStyle
  /**
    * Style for callout container root element.
    */
  var root: IStyle
}

object ICalloutContentStyles {
  @scala.inline
  def apply(
    beak: IStyle = null,
    beakCurtain: IStyle = null,
    calloutMain: IStyle = null,
    container: IStyle = null,
    root: IStyle = null
  ): ICalloutContentStyles = {
    val __obj = js.Dynamic.literal()
    if (beak != null) __obj.updateDynamic("beak")(beak.asInstanceOf[js.Any])
    if (beakCurtain != null) __obj.updateDynamic("beakCurtain")(beakCurtain.asInstanceOf[js.Any])
    if (calloutMain != null) __obj.updateDynamic("calloutMain")(calloutMain.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutContentStyles]
  }
}

