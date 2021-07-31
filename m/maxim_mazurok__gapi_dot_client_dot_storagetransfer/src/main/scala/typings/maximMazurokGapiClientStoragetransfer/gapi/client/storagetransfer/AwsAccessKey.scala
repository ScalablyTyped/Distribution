package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAccessKey extends StObject {
  
  /** Required. AWS access key ID. */
  var accessKeyId: js.UndefOr[String] = js.undefined
  
  /** Required. AWS secret access key. This field is not returned in RPC responses. */
  var secretAccessKey: js.UndefOr[String] = js.undefined
}
object AwsAccessKey {
  
  @scala.inline
  def apply(): AwsAccessKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAccessKey]
  }
  
  @scala.inline
  implicit class AwsAccessKeyMutableBuilder[Self <: AwsAccessKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
  }
}
