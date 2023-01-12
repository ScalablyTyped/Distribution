package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlInspectionResource extends StObject {
  
  var index: IndexResource
}
object UrlInspectionResource {
  
  inline def apply(index: IndexResource): UrlInspectionResource = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlInspectionResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlInspectionResource] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: IndexResource): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
