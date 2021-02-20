package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputConfig extends StObject {
  
  /** Google Cloud Storage location where input content is located. */
  var gcsSource: js.UndefOr[GcsSource] = js.native
}
object InputConfig {
  
  @scala.inline
  def apply(): InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfig]
  }
  
  @scala.inline
  implicit class InputConfigMutableBuilder[Self <: InputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsSource(value: GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
