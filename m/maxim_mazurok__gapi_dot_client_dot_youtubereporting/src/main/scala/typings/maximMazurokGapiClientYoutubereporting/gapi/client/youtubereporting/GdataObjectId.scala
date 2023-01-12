package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataObjectId extends StObject {
  
  /** gdata */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var generation: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var objectName: js.UndefOr[String] = js.undefined
}
object GdataObjectId {
  
  inline def apply(): GdataObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataObjectId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GdataObjectId] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
  }
}
