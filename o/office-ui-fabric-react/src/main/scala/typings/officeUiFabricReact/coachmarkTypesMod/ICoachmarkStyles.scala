package typings.officeUiFabricReact.coachmarkTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoachmarkStyles extends js.Object {
  /**
    * The styles applied to the ARIA attribute container
    */
  var ariaContainer: js.UndefOr[IStyle] = js.undefined
  /**
    * The layer that directly contains the TeachingBubbleContent
    */
  var childrenContainer: IStyle
  /**
    * The styles applied when the Coachmark has collapsed.
    */
  var collapsed: js.UndefOr[IStyle] = js.undefined
  /**
    * The layer that content/components/elements will be hosted in.
    */
  var entityHost: js.UndefOr[IStyle] = js.undefined
  /**
    * The inner layer that components will be hosted in
    * and primary purpose is scaling the layer down while the
    * Coachmark collapsed.
    */
  var entityInnerHost: IStyle
  /**
    * The pulsing beacon that animates when the Coachmark is collapsed.
    */
  var pulsingBeacon: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * The layer the Rotate animation will be applied to.
    */
  var rotateAnimationLayer: js.UndefOr[IStyle] = js.undefined
  /**
    * The layer the Scale animation will be applied to.
    */
  var scaleAnimationLayer: js.UndefOr[IStyle] = js.undefined
  /**
    * The layer, or div, that the translate animation will be applied to.
    */
  var translateAnimationContainer: js.UndefOr[IStyle] = js.undefined
}

object ICoachmarkStyles {
  @scala.inline
  def apply(
    ariaContainer: js.UndefOr[Null | IStyle] = js.undefined,
    childrenContainer: js.UndefOr[Null | IStyle] = js.undefined,
    collapsed: js.UndefOr[Null | IStyle] = js.undefined,
    entityHost: js.UndefOr[Null | IStyle] = js.undefined,
    entityInnerHost: js.UndefOr[Null | IStyle] = js.undefined,
    pulsingBeacon: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    rotateAnimationLayer: js.UndefOr[Null | IStyle] = js.undefined,
    scaleAnimationLayer: js.UndefOr[Null | IStyle] = js.undefined,
    translateAnimationContainer: js.UndefOr[Null | IStyle] = js.undefined
  ): ICoachmarkStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ariaContainer)) __obj.updateDynamic("ariaContainer")(ariaContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(childrenContainer)) __obj.updateDynamic("childrenContainer")(childrenContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(entityHost)) __obj.updateDynamic("entityHost")(entityHost.asInstanceOf[js.Any])
    if (!js.isUndefined(entityInnerHost)) __obj.updateDynamic("entityInnerHost")(entityInnerHost.asInstanceOf[js.Any])
    if (!js.isUndefined(pulsingBeacon)) __obj.updateDynamic("pulsingBeacon")(pulsingBeacon.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateAnimationLayer)) __obj.updateDynamic("rotateAnimationLayer")(rotateAnimationLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleAnimationLayer)) __obj.updateDynamic("scaleAnimationLayer")(scaleAnimationLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(translateAnimationContainer)) __obj.updateDynamic("translateAnimationContainer")(translateAnimationContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkStyles]
  }
}

