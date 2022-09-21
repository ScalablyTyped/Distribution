package typings.playcanvas.anon

import typings.playcanvas.mod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyAmbient extends StObject {
  
  var legacyAmbient: js.UndefOr[Boolean] = js.undefined
  
  var numSamples: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[Texture] = js.undefined
}
object LegacyAmbient {
  
  inline def apply(): LegacyAmbient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyAmbient]
  }
  
  extension [Self <: LegacyAmbient](x: Self) {
    
    inline def setLegacyAmbient(value: Boolean): Self = StObject.set(x, "legacyAmbient", value.asInstanceOf[js.Any])
    
    inline def setLegacyAmbientUndefined: Self = StObject.set(x, "legacyAmbient", js.undefined)
    
    inline def setNumSamples(value: Double): Self = StObject.set(x, "numSamples", value.asInstanceOf[js.Any])
    
    inline def setNumSamplesUndefined: Self = StObject.set(x, "numSamples", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTarget(value: Texture): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
