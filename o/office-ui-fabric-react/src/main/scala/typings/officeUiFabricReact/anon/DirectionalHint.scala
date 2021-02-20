package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalHint extends StObject {
  
  var beakWidth: Double = js.native
  
  var directionalHint: `12` = js.native
  
  var doNotLayer: Boolean = js.native
  
  var gapSpace: Double = js.native
  
  var setInitialFocus: Boolean = js.native
}
object DirectionalHint {
  
  @scala.inline
  def apply(
    beakWidth: Double,
    directionalHint: `12`,
    doNotLayer: Boolean,
    gapSpace: Double,
    setInitialFocus: Boolean
  ): DirectionalHint = {
    val __obj = js.Dynamic.literal(beakWidth = beakWidth.asInstanceOf[js.Any], directionalHint = directionalHint.asInstanceOf[js.Any], doNotLayer = doNotLayer.asInstanceOf[js.Any], gapSpace = gapSpace.asInstanceOf[js.Any], setInitialFocus = setInitialFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalHint]
  }
  
  @scala.inline
  implicit class DirectionalHintMutableBuilder[Self <: DirectionalHint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalHint(value: `12`): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotLayer(value: Boolean): Self = StObject.set(x, "doNotLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInitialFocus(value: Boolean): Self = StObject.set(x, "setInitialFocus", value.asInstanceOf[js.Any])
  }
}
