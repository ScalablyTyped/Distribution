package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a list of {@link MorphTarget}, a combined delta AABB and some associated data.
  */
@js.native
trait Morph
  extends StObject
     with RefCountedObject {
  
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
