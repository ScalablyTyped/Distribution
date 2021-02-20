package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsObject extends StObject {
  
  /** Required. Bucket of the Cloud Storage object. */
  var bucket: js.UndefOr[String] = js.native
  
  /** Required. Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change. */
  var generationNumber: js.UndefOr[String] = js.native
  
  /** Required. Name of the Cloud Storage object. */
  var `object`: js.UndefOr[String] = js.native
}
object GcsObject {
  
  @scala.inline
  def apply(): GcsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsObject]
  }
  
  @scala.inline
  implicit class GcsObjectMutableBuilder[Self <: GcsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setGenerationNumber(value: String): Self = StObject.set(x, "generationNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationNumberUndefined: Self = StObject.set(x, "generationNumber", js.undefined)
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
