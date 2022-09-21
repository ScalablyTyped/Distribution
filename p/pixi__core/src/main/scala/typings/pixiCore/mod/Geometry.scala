package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.pixiConstants.mod.TYPES
import typings.pixiRunner.mod.Runner
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Geometry")
@js.native
/**
  * @param buffers - An array of buffers. optional.
  * @param attributes - Of the geometry, optional structure of the attributes layout
  */
open class Geometry () extends StObject {
  def this(buffers: js.Array[Buffer2]) = this()
  def this(buffers: js.Array[Buffer2], attributes: StringDictionary[Attribute]) = this()
  def this(buffers: Unit, attributes: StringDictionary[Attribute]) = this()
  
  /**
    *
    * Adds an attribute to the geometry
    * Note: `stride` and `start` should be `undefined` if you dont know them, not 0!
    * @param id - the name of the attribute (matching up to a shader)
    * @param {PIXI.Buffer|number[]} buffer - the buffer that holds the data of the attribute . You can also provide an Array and a buffer will be created from it.
    * @param size - the size of the attribute. If you have 2 floats per vertex (eg position x and y) this would be 2
    * @param normalized - should the data be normalized.
    * @param [type=PIXI.TYPES.FLOAT] - what type of number is the attribute. Check {PIXI.TYPES} to see the ones available
    * @param [stride=0] - How far apart, in bytes, the start of each value is. (used for interleaving data)
    * @param [start=0] - How far into the array to start reading values (used for interleaving data)
    * @param instance - Instancing flag
    * @returns - Returns self, useful for chaining.
    */
  def addAttribute(
    id: String,
    buffer: Buffer2 | js.typedarray.Float32Array | js.typedarray.Uint32Array | js.Array[Double],
    size: js.UndefOr[Double],
    normalized: js.UndefOr[Boolean],
    `type`: js.UndefOr[TYPES],
    stride: js.UndefOr[Double],
    start: js.UndefOr[Double],
    instance: js.UndefOr[Boolean]
  ): this.type = js.native
  
  /**
    *
    * Adds an index buffer to the geometry
    * The index buffer contains integers, three for each triangle in the geometry, which reference the various attribute buffers (position, colour, UV coordinates, other UV coordinates, normal, …). There is only ONE index buffer.
    * @param {PIXI.Buffer|number[]} [buffer] - The buffer that holds the data of the index buffer. You can also provide an Array and a buffer will be created from it.
    * @returns - Returns self, useful for chaining.
    */
  def addIndex(): Geometry = js.native
  def addIndex(buffer: js.Array[Double]): Geometry = js.native
  def addIndex(buffer: js.typedarray.ArrayBuffer): Geometry = js.native
  def addIndex(buffer: Buffer2): Geometry = js.native
  
  var attributes: StringDictionary[Attribute] = js.native
  
  var buffers: js.Array[Buffer2] = js.native
  
  /** Destroys the geometry. */
  def destroy(): Unit = js.native
  
  /** Disposes WebGL resources that are connected to this geometry. */
  def dispose(): Unit = js.native
  
  var disposeRunner: Runner = js.native
  
  /**
    * Returns the requested attribute.
    * @param id - The name of the attribute required
    * @returns - The attribute requested.
    */
  def getAttribute(id: String): Attribute = js.native
  
  /**
    * Returns the requested buffer.
    * @param id - The name of the buffer required.
    * @returns - The buffer requested.
    */
  def getBuffer(id: String): Buffer2 = js.native
  
  /**
    * Returns the index buffer
    * @returns - The index buffer.
    */
  def getIndex(): Buffer2 = js.native
  
  /** Get the size of the geometries, in vertices. */
  def getSize(): Double = js.native
  
  /**
    * A map of renderer IDs to webgl VAOs
    * @type {object}
    */
  var glVertexArrayObjects: NumberDictionary[StringDictionary[WebGLVertexArrayObject]] = js.native
  
  var id: Double = js.native
  
  var indexBuffer: Buffer2 = js.native
  
  /**
    * Number of instances in this geometry, pass it to `GeometrySystem.draw()`.
    * @default 1
    */
  var instanceCount: Double = js.native
  
  /** Whether the geometry is instanced. */
  var instanced: Boolean = js.native
  
  /**
    * This function modifies the structure so that all current attributes become interleaved into a single buffer
    * This can be useful if your model remains static as it offers a little performance boost
    * @returns - Returns self, useful for chaining.
    */
  def interleave(): Geometry = js.native
  
  /** Count of existing (not destroyed) meshes that reference this geometry. */
  var refCount: Double = js.native
}
/* static members */
object Geometry {
  
  @JSImport("@pixi/core", "Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Merges an array of geometries into a new single one.
    *
    * Geometry attribute styles must match for this operation to work.
    * @param geometries - array of geometries to merge
    * @returns - Shiny new geometry!
    */
  inline def merge(geometries: js.Array[Geometry]): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometries.asInstanceOf[js.Any]).asInstanceOf[Geometry]
}
