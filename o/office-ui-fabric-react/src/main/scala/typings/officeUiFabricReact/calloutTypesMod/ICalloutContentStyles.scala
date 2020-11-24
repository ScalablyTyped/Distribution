package typings.officeUiFabricReact.calloutTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalloutContentStyles extends js.Object {
  
  /**
    * Style for callout beak.
    */
  var beak: IStyle = js.native
  
  /**
    * Style for callout beak curtain.
    */
  var beakCurtain: IStyle = js.native
  
  /**
    * Style for content component of the callout.
    */
  var calloutMain: IStyle = js.native
  
  /**
    * Style for wrapper of Callout component.
    */
  var container: IStyle = js.native
  
  /**
    * Style for callout container root element.
    */
  var root: IStyle = js.native
}
object ICalloutContentStyles {
  
  @scala.inline
  def apply(): ICalloutContentStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutContentStyles]
  }
  
  @scala.inline
  implicit class ICalloutContentStylesOps[Self <: ICalloutContentStyles] (val x: Self) extends AnyVal {
    
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
    def setBeak(value: IStyle): Self = this.set("beak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeak: Self = this.set("beak", js.undefined)
    
    @scala.inline
    def setBeakNull: Self = this.set("beak", null)
    
    @scala.inline
    def setBeakCurtain(value: IStyle): Self = this.set("beakCurtain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakCurtain: Self = this.set("beakCurtain", js.undefined)
    
    @scala.inline
    def setBeakCurtainNull: Self = this.set("beakCurtain", null)
    
    @scala.inline
    def setCalloutMain(value: IStyle): Self = this.set("calloutMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutMain: Self = this.set("calloutMain", js.undefined)
    
    @scala.inline
    def setCalloutMainNull: Self = this.set("calloutMain", null)
    
    @scala.inline
    def setContainer(value: IStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
