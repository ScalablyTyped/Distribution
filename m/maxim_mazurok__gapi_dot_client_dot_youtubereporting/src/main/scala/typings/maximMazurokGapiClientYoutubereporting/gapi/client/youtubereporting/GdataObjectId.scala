package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataObjectId extends StObject {
  
  /** gdata */
  var bucketName: js.UndefOr[String] = js.native
  
  /** gdata */
  var generation: js.UndefOr[String] = js.native
  
  /** gdata */
  var objectName: js.UndefOr[String] = js.native
}
object GdataObjectId {
  
  @scala.inline
  def apply(): GdataObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataObjectId]
  }
  
  @scala.inline
  implicit class GdataObjectIdMutableBuilder[Self <: GdataObjectId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
  }
}
