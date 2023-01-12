package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniversalAdId extends StObject {
  
  /** The unique creative identifier. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The registry provides unique creative identifiers. */
  var registry: js.UndefOr[String] = js.undefined
}
object UniversalAdId {
  
  inline def apply(): UniversalAdId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniversalAdId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniversalAdId] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
  }
}
