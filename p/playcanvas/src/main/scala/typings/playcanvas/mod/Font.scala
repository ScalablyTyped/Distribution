package typings.playcanvas.mod

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
@JSImport("playcanvas", "Font")
@js.native
class Font protected ()
  extends StObject
     with typings.playcanvas.pc.Font {
  def this(textures: js.Array[typings.playcanvas.pc.Texture], data: js.Any) = this()
  
  /**
    * The font intensity.
    */
  /* CompleteClass */
  var intensity: Double = js.native
  
  /**
    * The font textures.
    */
  /* CompleteClass */
  var textures: js.Array[typings.playcanvas.pc.Texture] = js.native
}
