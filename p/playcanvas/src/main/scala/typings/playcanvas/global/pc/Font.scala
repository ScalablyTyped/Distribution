package typings.playcanvas.global.pc

import typings.playcanvas.mod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../platform/graphics/texture.js').Texture} Texture */
/**
  * Represents the resource of a font asset.
  */
@JSGlobal("pc.Font")
@js.native
open class Font protected ()
  extends typings.playcanvas.mod.Font {
  /**
    * Create a new Font instance.
    *
    * @param {Texture[]} textures - The font textures.
    * @param {object} data - The font data.
    */
  def this(textures: js.Array[Texture], data: js.Object) = this()
}
