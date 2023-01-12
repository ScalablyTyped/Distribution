package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mixin extends StObject {
  
  /** The fully qualified name of the interface which is included. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If non-empty specifies a path under which inherited HTTP paths are rooted. */
  var root: js.UndefOr[String] = js.undefined
}
object Mixin {
  
  inline def apply(): Mixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mixin] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
