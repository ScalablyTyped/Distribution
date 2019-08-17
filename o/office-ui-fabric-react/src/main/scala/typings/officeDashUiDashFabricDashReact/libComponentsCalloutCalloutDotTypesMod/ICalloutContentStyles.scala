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
  def apply(beak: IStyle, beakCurtain: IStyle, calloutMain: IStyle, container: IStyle, root: IStyle): ICalloutContentStyles = {
    val __obj = js.Dynamic.literal(beak = beak.asInstanceOf[js.Any], beakCurtain = beakCurtain.asInstanceOf[js.Any], calloutMain = calloutMain.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICalloutContentStyles]
  }
}

