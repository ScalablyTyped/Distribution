package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMatcher extends StObject {
  
  /** If specified, at least one of the values in the list must match the value specified. */
  var oneOf: js.UndefOr[ValueMatcher] = js.undefined
}
object ListMatcher {
  
  inline def apply(): ListMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMatcher]
  }
  
  extension [Self <: ListMatcher](x: Self) {
    
    inline def setOneOf(value: ValueMatcher): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
  }
}
