package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addressable extends StObject {
  
  var url: js.UndefOr[String] = js.undefined
}
object Addressable {
  
  inline def apply(): Addressable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addressable]
  }
  
  extension [Self <: Addressable](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
