package typings.playcanvas.mod

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
    * @param {MorphTarget[]} targets - A list of morph targets.
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this morph
    * target. If it is not provided, a device is obtained from the {@link Application}.
    */
  def this(targets: js.Array[MorphTarget], graphicsDevice: GraphicsDevice) = this()
  
  def _calculateAabb(): Unit = js.native
  
  def _createTexture(name: Any, format: Any, pixelData: Any): Texture = js.native
  
  def _init(): Unit = js.native
  
  def _initTextureBased(): Boolean = js.native
  
  var _morphNormals: Boolean = js.native
  
  var _morphPositions: Boolean = js.native
  
  var _renderTextureFormat: Double = js.native
  
  var _targets: js.Array[MorphTarget] = js.native
  
  var _textureFormat: Double = js.native
  
  def _updateMorphFlags(): Unit = js.native
  
  var _useTextureMorph: Boolean = js.native
  
  var aabb: BoundingBox = js.native
  
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
  
  /**
    * The array of morph targets.
    *
    * @type {MorphTarget[]}
    */
  def targets: js.Array[MorphTarget] = js.native
  
  def useTextureMorph: Boolean = js.native
  
  var vertexBufferIds: VertexBuffer = js.native
}
object Morph {
  
  @JSImport("playcanvas", "Morph")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("playcanvas", "Morph.FORMAT_FLOAT")
  @js.native
  def FORMAT_FLOAT: Double = js.native
  inline def FORMAT_FLOAT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_FLOAT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("playcanvas", "Morph.FORMAT_HALF_FLOAT")
  @js.native
  def FORMAT_HALF_FLOAT: Double = js.native
  inline def FORMAT_HALF_FLOAT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_HALF_FLOAT")(x.asInstanceOf[js.Any])
}
