package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSegment extends StObject {
  
  /** If specified, use the key to retrieve the value in a Struct. */
  var key: js.UndefOr[String] = js.undefined
}
object PathSegment {
  
  inline def apply(): PathSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSegment] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
