package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addressable extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object Addressable {
  
  @scala.inline
  def apply(): Addressable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addressable]
  }
  
  @scala.inline
  implicit class AddressableMutableBuilder[Self <: Addressable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
