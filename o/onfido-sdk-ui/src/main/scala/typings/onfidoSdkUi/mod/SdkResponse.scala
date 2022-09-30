package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkResponse extends StObject {
  
  var active_video: js.UndefOr[ActiveVideoResponse] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var document_back: js.UndefOr[DocumentResponse] = js.undefined
  
  var document_front: js.UndefOr[DocumentResponse] = js.undefined
  
  var document_video: js.UndefOr[DocumentVideoResponse] = js.undefined
  
  var face: js.UndefOr[FaceResponse] = js.undefined
  
  var poa: js.UndefOr[DocumentResponse] = js.undefined
}
object SdkResponse {
  
  inline def apply(): SdkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkResponse]
  }
  
  extension [Self <: SdkResponse](x: Self) {
    
    inline def setActive_video(value: ActiveVideoResponse): Self = StObject.set(x, "active_video", value.asInstanceOf[js.Any])
    
    inline def setActive_videoUndefined: Self = StObject.set(x, "active_video", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDocument_back(value: DocumentResponse): Self = StObject.set(x, "document_back", value.asInstanceOf[js.Any])
    
    inline def setDocument_backUndefined: Self = StObject.set(x, "document_back", js.undefined)
    
    inline def setDocument_front(value: DocumentResponse): Self = StObject.set(x, "document_front", value.asInstanceOf[js.Any])
    
    inline def setDocument_frontUndefined: Self = StObject.set(x, "document_front", js.undefined)
    
    inline def setDocument_video(value: DocumentVideoResponse): Self = StObject.set(x, "document_video", value.asInstanceOf[js.Any])
    
    inline def setDocument_videoUndefined: Self = StObject.set(x, "document_video", js.undefined)
    
    inline def setFace(value: FaceResponse): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    inline def setPoa(value: DocumentResponse): Self = StObject.set(x, "poa", value.asInstanceOf[js.Any])
    
    inline def setPoaUndefined: Self = StObject.set(x, "poa", js.undefined)
  }
}
