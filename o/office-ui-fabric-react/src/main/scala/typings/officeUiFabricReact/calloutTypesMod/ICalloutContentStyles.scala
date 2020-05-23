package typings.officeUiFabricReact.calloutTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    beak: js.UndefOr[Null | IStyle] = js.undefined,
    beakCurtain: js.UndefOr[Null | IStyle] = js.undefined,
    calloutMain: js.UndefOr[Null | IStyle] = js.undefined,
    container: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): ICalloutContentStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beak)) __obj.updateDynamic("beak")(beak.asInstanceOf[js.Any])
    if (!js.isUndefined(beakCurtain)) __obj.updateDynamic("beakCurtain")(beakCurtain.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutMain)) __obj.updateDynamic("calloutMain")(calloutMain.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutContentStyles]
  }
}

