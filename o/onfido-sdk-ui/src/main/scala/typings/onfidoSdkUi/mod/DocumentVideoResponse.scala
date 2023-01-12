package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.onfidoSdkUiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentVideoResponse extends StObject {
  
  var id: String
  
  var media_uuids: js.Array[String]
  
  var variant: video
}
object DocumentVideoResponse {
  
  inline def apply(id: String, media_uuids: js.Array[String]): DocumentVideoResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], media_uuids = media_uuids.asInstanceOf[js.Any], variant = "video")
    __obj.asInstanceOf[DocumentVideoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentVideoResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMedia_uuids(value: js.Array[String]): Self = StObject.set(x, "media_uuids", value.asInstanceOf[js.Any])
    
    inline def setMedia_uuidsVarargs(value: String*): Self = StObject.set(x, "media_uuids", js.Array(value*))
    
    inline def setVariant(value: video): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
