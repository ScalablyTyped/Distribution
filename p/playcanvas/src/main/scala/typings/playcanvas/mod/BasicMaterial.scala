package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../platform/graphics/texture.js').Texture} Texture */
/**
  * A BasicMaterial is for rendering unlit geometry, either using a constant color or a color map
  * modulated with a color.
  *
  * @augments Material
  */
@JSImport("playcanvas", "BasicMaterial")
@js.native
open class BasicMaterial () extends Material {
  
  /**
    * The flat color of the material (RGBA, where each component is 0 to 1).
    *
    * @type {Color}
    */
  var color: Color = js.native
  
  /**
    * The color map of the material (default is null). If specified, the color map is
    * modulated by the color property.
    *
    * @type {Texture|null}
    */
  var colorMap: Texture | Null = js.native
  
  var colorUniform: js.typedarray.Float32Array = js.native
  
  /**
    * Copy a `BasicMaterial`.
    *
    * @param {BasicMaterial} source - The material to copy from.
    * @returns {BasicMaterial} The destination material.
    */
  def copy(source: BasicMaterial): BasicMaterial = js.native
  
  var vertexColors: Boolean = js.native
}
