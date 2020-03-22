package typings.pixiJs.PIXI

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to create a quad with uvs like in v4
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.Geometry
  */
@JSGlobal("PIXI.QuadUv")
@js.native
class QuadUv () extends Geometry {
  /**
    * The Uvs of the quad
    *
    * @member {Float32Array} PIXI.QuadUv#uvs
    */
  var uvs: Float32Array = js.native
  /**
    * An array of vertices
    *
    * @member {Float32Array} PIXI.QuadUv#vertices
    */
  var vertices: Float32Array = js.native
  /**
    * legacy upload method, just marks buffers dirty
    * @returns {PIXI.QuadUv} Returns itself.
    */
  def invalidate(): QuadUv = js.native
  /**
    * Maps two Rectangle to the quad.
    *
    * @param {PIXI.Rectangle} targetTextureFrame - the first rectangle
    * @param {PIXI.Rectangle} destinationFrame - the second rectangle
    * @return {PIXI.Quad} Returns itself.
    */
  def map(targetTextureFrame: Rectangle, destinationFrame: Rectangle): Quad = js.native
}

