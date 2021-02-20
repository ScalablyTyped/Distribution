package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsData extends StObject {
  
  /** Required. Cloud Storage bucket name (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/naming#requirements)). */
  var bucketName: js.UndefOr[String] = js.native
}
object GcsData {
  
  @scala.inline
  def apply(): GcsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsData]
  }
  
  @scala.inline
  implicit class GcsDataMutableBuilder[Self <: GcsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
  }
}
