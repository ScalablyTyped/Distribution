package typings.playcanvas.mod

import typings.playcanvas.anon.Aabb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Morph Target (also known as Blend Shape) contains deformation data to apply to existing mesh.
  * Multiple morph targets can be blended together on a mesh. This is useful for effects that are
  * hard to achieve with conventional animation and skinning.
  */
@JSImport("playcanvas", "MorphTarget")
@js.native
open class MorphTarget protected () extends StObject {
  /**
    * Create a new MorphTarget instance.
    *
    * @param {object} options - Object for passing optional arguments.
    * @param {ArrayBuffer} options.deltaPositions - An array of 3-dimensional vertex position
    * offsets.
    * @param {number} options.deltaPositionsType - A format to store position offsets inside
    * {@link VertexBuffer}. Defaults to {@link TYPE_FLOAT32} if not provided.
    * @param {ArrayBuffer} [options.deltaNormals] - An array of 3-dimensional vertex normal
    * offsets.
    * @param {number} options.deltaNormalsType - A format to store normal offsets inside
    * {@link VertexBuffer}. Defaults to {@link TYPE_FLOAT32} if not provided.
    * @param {string} [options.name] - Name.
    * @param {BoundingBox} [options.aabb] - Bounding box. Will be automatically generated, if
    * undefined.
    * @param {number} [options.defaultWeight] - Default blend weight to use for this morph target.
    * @param {boolean} [options.preserveData] - When true, the morph target keeps its data passed using the options,
    * allowing the clone operation.
    */
  def this(options: Aabb, args: Any*) = this()
  
  def _createVertexBuffer(device: Any, data: Any): VertexBuffer = js.native
  def _createVertexBuffer(device: Any, data: Any, dataType: Double): VertexBuffer = js.native
  
  var _defaultWeight: Double = js.native
  
  def _initVertexBuffers(graphicsDevice: Any): Unit = js.native
  
  var _name: String = js.native
  
  def _postInit(): Unit = js.native
  
  def _setTexture(name: Any, texture: Any): Unit = js.native
  
  var _vertexBufferNormals: VertexBuffer = js.native
  
  var _vertexBufferPositions: VertexBuffer = js.native
  
  var aabb: BoundingBox = js.native
  
  /**
    * The default weight of the morph target.
    *
    * @type {number}
    */
  def defaultWeight: Double = js.native
  
  var deltaPositions: js.typedarray.ArrayBuffer = js.native
  
  def destroy(): Unit = js.native
  
  def morphNormals: Boolean = js.native
  
  def morphPositions: Boolean = js.native
  
  /**
    * The name of the morph target.
    *
    * @type {string}
    */
  def name: String = js.native
  
  var options: Aabb = js.native
  
  var textureNormals: Any = js.native
  
  var texturePositions: Any = js.native
  
  /**
    * A used flag. A morph target can be used / owned by the Morph class only one time.
    */
  var used: Boolean = js.native
}
