package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkeletonJson extends StObject {
  
  var attachmentLoader: AttachmentLoader = js.native
  
  def getValue(map: Any, prop: String, defaultValue: Any): Any = js.native
  
  /* private */ var linkedMeshes: Any = js.native
  
  def readAnimation(map: Any, name: String, skeletonData: SkeletonData): Unit = js.native
  
  def readAttachment(map: Any, skin: Skin, slotIndex: Double, name: String, skeletonData: SkeletonData): Attachment = js.native
  
  def readCurve(map: Any, timeline: CurveTimeline, frameIndex: Double): Unit = js.native
  
  def readSkeletonData(json: String): SkeletonData = js.native
  def readSkeletonData(json: Any): SkeletonData = js.native
  
  def readVertices(map: Any, attachment: VertexAttachment, verticesLength: Double): Unit = js.native
  
  var scale: Double = js.native
}
