package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of a font asset.
  */
@JSImport("playcanvas", "Font")
@js.native
open class Font protected () extends StObject {
  /**
    * Create a new Font instance.
    *
    * @param {import('../../platform/graphics/texture.js').Texture[]} textures - The font
    * textures.
    * @param {object} data - The font data.
    */
  def this(textures: js.Array[Texture], data: js.Object) = this()
  
  var _data: Any = js.native
  
  def data: Any = js.native
  def data_=(arg: Any): Unit = js.native
  
  var em: Double = js.native
  
  /**
    * The font intensity.
    *
    * @type {number}
    */
  var intensity: Double = js.native
  
  /**
    * The font textures.
    *
    * @type {import('../../platform/graphics/texture.js').Texture[]}
    */
  var textures: js.Array[Texture] = js.native
  
  var `type`: Any = js.native
}
