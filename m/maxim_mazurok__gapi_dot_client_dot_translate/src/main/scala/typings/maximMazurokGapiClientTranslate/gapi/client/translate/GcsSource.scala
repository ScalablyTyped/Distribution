package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsSource extends StObject {
  
  /** Required. Source data URI. For example, `gs://my_bucket/my_object`. */
  var inputUri: js.UndefOr[String] = js.native
}
object GcsSource {
  
  @scala.inline
  def apply(): GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsSource]
  }
  
  @scala.inline
  implicit class GcsSourceMutableBuilder[Self <: GcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
  }
}
