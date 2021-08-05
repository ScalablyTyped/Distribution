package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Geometry represents a model. It consists of two components:
  * - GeometryStyle - The structure of the model such as the attributes layout
  * - GeometryData - the data of the model - this consists of buffers.
  * This can include anything from positions, uvs, normals, colors etc.
  *
  * Geometry can be defined without passing in a style or data if required (thats how I prefer!)
  *
  * ```js
  * let geometry = new PIXI.Geometry();
  *
  * geometry.addAttribute('positions', [0, 0, 100, 0, 100, 100, 0, 100], 2);
  * geometry.addAttribute('uvs', [0,0,1,0,1,1,0,1],2)
  * geometry.addIndex([0,1,2,1,3,2])
  *
  * ```
  * @class
  * @memberof PIXI
  */
@js.native
trait Geometry extends StObject {
  
  /**
    *
    * Adds an attribute to the geometry
    * Note: `stride` and `start` should be `undefined` if you dont know them, not 0!
    *
    * @param {String} id - the name of the attribute (matching up to a shader)
    * @param {PIXI.Buffer|number[]} [buffer] - the buffer that holds the data of the attribute . You can also provide an Array and a buffer will be created from it.
    * @param {Number} [size=0] - the size of the attribute. If you have 2 floats per vertex (eg position x and y) this would be 2
    * @param {Boolean} [normalized=false] - should the data be normalized.
    * @param {Number} [type=PIXI.TYPES.FLOAT] - what type of number is the attribute. Check {PIXI.TYPES} to see the ones available
    * @param {Number} [stride] - How far apart (in floats) the start of each value is. (used for interleaving data)
    * @param {Number} [start] - How far into the array to start reading values (used for interleaving data)
    * @param {boolean} [instance=false] - Instancing flag
    *
    * @return {PIXI.Geometry} returns self, useful for chaining.
    */
  def addAttribute(
    id: String,
    buffer: js.UndefOr[Buffer | js.Array[Double]],
    size: js.UndefOr[Double],
    normalized: js.UndefOr[Boolean],
    `type`: js.UndefOr[Double],
    stride: js.UndefOr[Double],
    start: js.UndefOr[Double],
    instance: js.UndefOr[Boolean]
  ): Geometry = js.native
  
  /**
    *
    * Adds an index buffer to the geometry
    * The index buffer contains integers, three for each triangle in the geometry, which reference the various attribute buffers (position, colour, UV coordinates, other UV coordinates, normal, …). There is only ONE index buffer.
    *
    * @param {PIXI.Buffer|number[]} [buffer] - the buffer that holds the data of the index buffer. You can also provide an Array and a buffer will be created from it.
    * @return {PIXI.Geometry} returns self, useful for chaining.
    */
  def addIndex(): Geometry = js.native
  def addIndex(buffer: js.Array[Double]): Geometry = js.native
  def addIndex(buffer: Buffer): Geometry = js.native
  
  /**
    * Destroys the geometry.
    */
  def destroy(): Unit = js.native
  
  /**
    * disposes WebGL resources that are connected to this geometry
    */
  def dispose(): Unit = js.native
  
  /**
    * returns the requested attribute
    *
    * @param {String} id - the name of the attribute required
    * @return {PIXI.Attribute} the attribute requested.
    */
  def getAttribute(id: String): Attribute = js.native
  
  /**
    * returns the requested buffer
    *
    * @param {String} id - the name of the buffer required
    * @return {PIXI.Buffer} the buffer requested.
    */
  def getBuffer(id: String): Buffer = js.native
  
  /**
    * returns the index buffer
    *
    * @return {PIXI.Buffer} the index buffer.
    */
  def getIndex(): Buffer = js.native
  
  /**
    * A map of renderer IDs to webgl VAOs
    *
    * @protected
    * @type {object}
    */
  /* protected */ var glVertexArrayObjects: js.Any = js.native
  
  /**
    * Number of instances in this geometry, pass it to `GeometrySystem.draw()`
    * @member {number} PIXI.Geometry#instanceCount
    * @default 1
    */
  var instanceCount: Double = js.native
  
  /**
    * this function modifies the structure so that all current attributes become interleaved into a single buffer
    * This can be useful if your model remains static as it offers a little performance boost
    *
    * @return {PIXI.Geometry} returns self, useful for chaining.
    */
  def interleave(): Geometry = js.native
  
  /**
    * Count of existing (not destroyed) meshes that reference this geometry
    * @member {number} PIXI.Geometry#refCount
    */
  var refCount: Double = js.native
}
