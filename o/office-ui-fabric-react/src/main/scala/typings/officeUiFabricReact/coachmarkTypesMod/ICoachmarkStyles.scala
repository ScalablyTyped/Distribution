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
    ariaContainer: IStyle = null,
    childrenContainer: IStyle = null,
    collapsed: IStyle = null,
    entityHost: IStyle = null,
    entityInnerHost: IStyle = null,
    pulsingBeacon: IStyle = null,
    root: IStyle = null,
    rotateAnimationLayer: IStyle = null,
    scaleAnimationLayer: IStyle = null,
    translateAnimationContainer: IStyle = null
  ): ICoachmarkStyles = {
    val __obj = js.Dynamic.literal()
    if (ariaContainer != null) __obj.updateDynamic("ariaContainer")(ariaContainer.asInstanceOf[js.Any])
    if (childrenContainer != null) __obj.updateDynamic("childrenContainer")(childrenContainer.asInstanceOf[js.Any])
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (entityHost != null) __obj.updateDynamic("entityHost")(entityHost.asInstanceOf[js.Any])
    if (entityInnerHost != null) __obj.updateDynamic("entityInnerHost")(entityInnerHost.asInstanceOf[js.Any])
    if (pulsingBeacon != null) __obj.updateDynamic("pulsingBeacon")(pulsingBeacon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rotateAnimationLayer != null) __obj.updateDynamic("rotateAnimationLayer")(rotateAnimationLayer.asInstanceOf[js.Any])
    if (scaleAnimationLayer != null) __obj.updateDynamic("scaleAnimationLayer")(scaleAnimationLayer.asInstanceOf[js.Any])
    if (translateAnimationContainer != null) __obj.updateDynamic("translateAnimationContainer")(translateAnimationContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkStyles]
  }
}

