package typings.officeUiFabricReact.coachmarkTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoachmarkStyles extends js.Object {
  
  /**
    * The styles applied to the ARIA attribute container
    */
  var ariaContainer: js.UndefOr[IStyle] = js.native
  
  /**
    * The layer that directly contains the TeachingBubbleContent
    */
  var childrenContainer: IStyle = js.native
  
  /**
    * The styles applied when the Coachmark has collapsed.
    */
  var collapsed: js.UndefOr[IStyle] = js.native
  
  /**
    * The layer that content/components/elements will be hosted in.
    */
  var entityHost: js.UndefOr[IStyle] = js.native
  
  /**
    * The inner layer that components will be hosted in
    * and primary purpose is scaling the layer down while the
    * Coachmark collapsed.
    */
  var entityInnerHost: IStyle = js.native
  
  /**
    * The pulsing beacon that animates when the Coachmark is collapsed.
    */
  var pulsingBeacon: js.UndefOr[IStyle] = js.native
  
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.native
  
  /**
    * The layer the Rotate animation will be applied to.
    */
  var rotateAnimationLayer: js.UndefOr[IStyle] = js.native
  
  /**
    * The layer the Scale animation will be applied to.
    */
  var scaleAnimationLayer: js.UndefOr[IStyle] = js.native
  
  /**
    * The layer, or div, that the translate animation will be applied to.
    */
  var translateAnimationContainer: js.UndefOr[IStyle] = js.native
}
object ICoachmarkStyles {
  
  @scala.inline
  def apply(): ICoachmarkStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICoachmarkStyles]
  }
  
  @scala.inline
  implicit class ICoachmarkStylesOps[Self <: ICoachmarkStyles] (val x: Self) extends AnyVal {
    
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
    def setAriaContainer(value: IStyle): Self = this.set("ariaContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaContainer: Self = this.set("ariaContainer", js.undefined)
    
    @scala.inline
    def setAriaContainerNull: Self = this.set("ariaContainer", null)
    
    @scala.inline
    def setChildrenContainer(value: IStyle): Self = this.set("childrenContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenContainer: Self = this.set("childrenContainer", js.undefined)
    
    @scala.inline
    def setChildrenContainerNull: Self = this.set("childrenContainer", null)
    
    @scala.inline
    def setCollapsed(value: IStyle): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsedNull: Self = this.set("collapsed", null)
    
    @scala.inline
    def setEntityHost(value: IStyle): Self = this.set("entityHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityHost: Self = this.set("entityHost", js.undefined)
    
    @scala.inline
    def setEntityHostNull: Self = this.set("entityHost", null)
    
    @scala.inline
    def setEntityInnerHost(value: IStyle): Self = this.set("entityInnerHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityInnerHost: Self = this.set("entityInnerHost", js.undefined)
    
    @scala.inline
    def setEntityInnerHostNull: Self = this.set("entityInnerHost", null)
    
    @scala.inline
    def setPulsingBeacon(value: IStyle): Self = this.set("pulsingBeacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulsingBeacon: Self = this.set("pulsingBeacon", js.undefined)
    
    @scala.inline
    def setPulsingBeaconNull: Self = this.set("pulsingBeacon", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setRotateAnimationLayer(value: IStyle): Self = this.set("rotateAnimationLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateAnimationLayer: Self = this.set("rotateAnimationLayer", js.undefined)
    
    @scala.inline
    def setRotateAnimationLayerNull: Self = this.set("rotateAnimationLayer", null)
    
    @scala.inline
    def setScaleAnimationLayer(value: IStyle): Self = this.set("scaleAnimationLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleAnimationLayer: Self = this.set("scaleAnimationLayer", js.undefined)
    
    @scala.inline
    def setScaleAnimationLayerNull: Self = this.set("scaleAnimationLayer", null)
    
    @scala.inline
    def setTranslateAnimationContainer(value: IStyle): Self = this.set("translateAnimationContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateAnimationContainer: Self = this.set("translateAnimationContainer", js.undefined)
    
    @scala.inline
    def setTranslateAnimationContainerNull: Self = this.set("translateAnimationContainer", null)
  }
}
