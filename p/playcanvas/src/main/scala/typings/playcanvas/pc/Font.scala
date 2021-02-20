package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of a font asset.
  * @property intensity - The font intensity.
  * @property textures - The font textures.
  * @param textures - The font textures.
  * @param data - The font data.
  */
@js.native
trait Font extends StObject {
  
  /**
    * The font intensity.
    */
  var intensity: Double = js.native
  
  /**
    * The font textures.
    */
  var textures: js.Array[Texture] = js.native
}
object Font {
  
  @scala.inline
  def apply(intensity: Double, textures: js.Array[Texture]): Font = {
    val __obj = js.Dynamic.literal(intensity = intensity.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextures(value: js.Array[Texture]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexturesVarargs(value: Texture*): Self = StObject.set(x, "textures", js.Array(value :_*))
  }
}
