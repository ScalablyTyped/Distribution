package typings.playcanvas.mod

import typings.playcanvas.anon.PreferHighPrecision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a list of {@link MorphTarget}, a combined delta AABB and some associated data.
  */
@JSImport("playcanvas", "Morph")
@js.native
open class Morph protected ()
  extends StObject
     with RefCountedObject {
  /**
    * Create a new Morph instance.
    *
    * @param {import('./morph-target.js').MorphTarget[]} targets - A list of morph targets.
    * @param {import('../platform/graphics/graphics-device.js').GraphicsDevice} graphicsDevice -
    * The graphics device used to manage this morph target.
    * @param {object} options - Object for passing optional arguments.
    * @param {boolean} options.preferHighPrecision - True if high precision storage should be
    * prefered. This is faster to create and allows higher precision, but takes more memory and
    * might be slower to render. Defaults to false.
    */
  def this(targets: js.Array[MorphTarget], graphicsDevice: GraphicsDevice) = this()
  def this(targets: js.Array[MorphTarget], graphicsDevice: GraphicsDevice, options: PreferHighPrecision) = this()
  
  /** @type {BoundingBox} */
  var _aabb: BoundingBox = js.native
  
  def _createTexture(name: Any, format: Any): Texture = js.native
  
  def _findSparseSet(deltaArrays: Any, ids: Any, usedDataIndices: Any, floatRounding: Any): Double = js.native
  
  def _init(): Unit = js.native
  
  def _initTextureBased(): Boolean = js.native
  
  var _morphNormals: Boolean = js.native
  
  var _morphPositions: Boolean = js.native
  
  var _renderTextureFormat: Double = js.native
  
  var _targets: js.Array[MorphTarget] = js.native
  
  var _textureFormat: Double = js.native
  
  def _updateMorphFlags(): Unit = js.native
  
  var _useTextureMorph: Boolean = js.native
  
  def aabb: BoundingBox = js.native
  
  /**
    * Frees video memory allocated by this object.
    */
  def destroy(): Unit = js.native
  
  var device: Any = js.native
  
  def maxActiveTargets: Double = js.native
  
  def morphNormals: Boolean = js.native
  
  def morphPositions: Boolean = js.native
  
  var morphTextureHeight: Double = js.native
  
  var morphTextureWidth: Double = js.native
  
  /** @type {boolean} */
  var preferHighPrecision: Boolean = js.native
  
  /**
    * The array of morph targets.
    *
    * @type {import('./morph-target.js').MorphTarget[]}
    */
  def targets: js.Array[MorphTarget] = js.native
  
  def useTextureMorph: Boolean = js.native
  
  var vertexBufferIds: VertexBuffer = js.native
}
