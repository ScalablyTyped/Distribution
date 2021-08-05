package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of a font asset.
  * @property intensity - The font intensity.
  * @property textures - The font textures.
  * @param textures - The font textures.
  * @param data - The font data.
  */
trait Font extends StObject {
  
  /**
    * The font intensity.
    */
  var intensity: Double
  
  /**
    * The font textures.
    */
  var textures: js.Array[Texture]
}
object Font {
  
  inline def apply(intensity: Double, textures: js.Array[Texture]): Font = {
    val __obj = js.Dynamic.literal(intensity = intensity.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setTextures(value: js.Array[Texture]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesVarargs(value: Texture*): Self = StObject.set(x, "textures", js.Array(value :_*))
  }
}
