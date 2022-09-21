package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A skin instance is responsible for generating the matrix palette that is used to skin vertices
  * from object space to world space.
  */
@JSImport("playcanvas", "SkinInstance")
@js.native
open class SkinInstance protected () extends StObject {
  /**
    * Create a new SkinInstance instance.
    *
    * @param {Skin} skin - The skin that will provide the inverse bind pose matrices to generate
    * the final matrix palette.
    */
  def this(skin: Skin) = this()
  
  var _dirty: Boolean = js.native
  
  var _rootBone: Any = js.native
  
  var _skinUpdateIndex: Double = js.native
  
  var _updateBeforeCull: Boolean = js.native
  
  def _updateMatrices(rootNode: Any, skinUpdateIndex: Any): Unit = js.native
  
  var boneTexture: Texture = js.native
  
  /**
    * An array of nodes representing each bone in this skin instance.
    *
    * @type {GraphNode[]}
    */
  var bones: js.Array[GraphNode] = js.native
  
  def destroy(): Unit = js.native
  
  def init(device: Any, numBones: Any): Unit = js.native
  
  def initSkin(skin: Any): Unit = js.native
  
  var matrices: js.Array[Any] = js.native
  
  var matrixPalette: js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Float32Array = js.native
  
  def resolve(rootBone: Any, entity: Any): Unit = js.native
  
  def rootBone: Any = js.native
  def rootBone_=(arg: Any): Unit = js.native
  
  var skin: Any = js.native
  
  def updateMatrices(rootNode: Any, skinUpdateIndex: Any): Unit = js.native
  
  def updateMatrixPalette(rootNode: Any, skinUpdateIndex: Any): Unit = js.native
  
  def uploadBones(device: Any): Unit = js.native
}
