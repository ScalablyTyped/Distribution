package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.MeshAttachment")
@js.native
class MeshAttachment protected ()
  extends StObject
     with typings.phaser.spine.MeshAttachment {
  def this(name: String) = this()
  
  /* CompleteClass */
  var bones: js.Array[Double] = js.native
  
  /* CompleteClass */
  var color: typings.phaser.spine.Color = js.native
  
  /* CompleteClass */
  override def computeWorldVertices(
    slot: typings.phaser.spine.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def copy(): typings.phaser.spine.Attachment = js.native
  
  /* CompleteClass */
  override def copyTo(attachment: typings.phaser.spine.VertexAttachment): Unit = js.native
  
  /* CompleteClass */
  var deformAttachment: typings.phaser.spine.VertexAttachment = js.native
  
  /* CompleteClass */
  var edges: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getParentMesh(): typings.phaser.spine.MeshAttachment = js.native
  
  /* CompleteClass */
  var height: Double = js.native
  
  /* CompleteClass */
  var hullLength: Double = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def newLinkedMesh(): typings.phaser.spine.MeshAttachment = js.native
  
  /* CompleteClass */
  var parentMesh: js.Any = js.native
  
  /* CompleteClass */
  var path: String = js.native
  
  /* CompleteClass */
  var region: typings.phaser.spine.TextureRegion = js.native
  
  /* CompleteClass */
  var regionUVs: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def setParentMesh(parentMesh: typings.phaser.spine.MeshAttachment): Unit = js.native
  
  /* CompleteClass */
  var tempColor: typings.phaser.spine.Color = js.native
  
  /* CompleteClass */
  var triangles: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def updateUVs(): Unit = js.native
  
  /* CompleteClass */
  var uvs: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  var vertices: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  var width: Double = js.native
  
  /* CompleteClass */
  var worldVerticesLength: Double = js.native
}
