package typings.pixiSpine.PIXI.spine.core

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonBinary extends StObject {
  
  var attachmentLoader: AttachmentLoader
  
  /* private */ var linkedMeshes: js.Any
  
  /* private */ var readAnimation: js.Any
  
  /* private */ var readAttachment: js.Any
  
  /* private */ var readCurve: js.Any
  
  /* private */ var readFloatArray: js.Any
  
  /* private */ var readShortArray: js.Any
  
  def readSkeletonData(binary: Uint8Array): SkeletonData
  
  /* private */ var readSkin: js.Any
  
  /* private */ var readVertices: js.Any
  
  var scale: Double
  
  def setCurve(timeline: CurveTimeline, frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit
}
object SkeletonBinary {
  
  inline def apply(
    attachmentLoader: AttachmentLoader,
    linkedMeshes: js.Any,
    readAnimation: js.Any,
    readAttachment: js.Any,
    readCurve: js.Any,
    readFloatArray: js.Any,
    readShortArray: js.Any,
    readSkeletonData: Uint8Array => SkeletonData,
    readSkin: js.Any,
    readVertices: js.Any,
    scale: Double,
    setCurve: (CurveTimeline, Double, Double, Double, Double, Double) => Unit
  ): SkeletonBinary = {
    val __obj = js.Dynamic.literal(attachmentLoader = attachmentLoader.asInstanceOf[js.Any], linkedMeshes = linkedMeshes.asInstanceOf[js.Any], readAnimation = readAnimation.asInstanceOf[js.Any], readAttachment = readAttachment.asInstanceOf[js.Any], readCurve = readCurve.asInstanceOf[js.Any], readFloatArray = readFloatArray.asInstanceOf[js.Any], readShortArray = readShortArray.asInstanceOf[js.Any], readSkeletonData = js.Any.fromFunction1(readSkeletonData), readSkin = readSkin.asInstanceOf[js.Any], readVertices = readVertices.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setCurve = js.Any.fromFunction6(setCurve))
    __obj.asInstanceOf[SkeletonBinary]
  }
  
  extension [Self <: SkeletonBinary](x: Self) {
    
    inline def setAttachmentLoader(value: AttachmentLoader): Self = StObject.set(x, "attachmentLoader", value.asInstanceOf[js.Any])
    
    inline def setLinkedMeshes(value: js.Any): Self = StObject.set(x, "linkedMeshes", value.asInstanceOf[js.Any])
    
    inline def setReadAnimation(value: js.Any): Self = StObject.set(x, "readAnimation", value.asInstanceOf[js.Any])
    
    inline def setReadAttachment(value: js.Any): Self = StObject.set(x, "readAttachment", value.asInstanceOf[js.Any])
    
    inline def setReadCurve(value: js.Any): Self = StObject.set(x, "readCurve", value.asInstanceOf[js.Any])
    
    inline def setReadFloatArray(value: js.Any): Self = StObject.set(x, "readFloatArray", value.asInstanceOf[js.Any])
    
    inline def setReadShortArray(value: js.Any): Self = StObject.set(x, "readShortArray", value.asInstanceOf[js.Any])
    
    inline def setReadSkeletonData(value: Uint8Array => SkeletonData): Self = StObject.set(x, "readSkeletonData", js.Any.fromFunction1(value))
    
    inline def setReadSkin(value: js.Any): Self = StObject.set(x, "readSkin", value.asInstanceOf[js.Any])
    
    inline def setReadVertices(value: js.Any): Self = StObject.set(x, "readVertices", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSetCurve(value: (CurveTimeline, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setCurve", js.Any.fromFunction6(value))
  }
}
