package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderDescription extends StObject {
  
  var headerDescription: String
  
  var headerLabel: String
}
object HeaderDescription {
  
  inline def apply(headerDescription: String, headerLabel: String): HeaderDescription = {
    val __obj = js.Dynamic.literal(headerDescription = headerDescription.asInstanceOf[js.Any], headerLabel = headerLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderDescription] (val x: Self) extends AnyVal {
    
    inline def setHeaderDescription(value: String): Self = StObject.set(x, "headerDescription", value.asInstanceOf[js.Any])
    
    inline def setHeaderLabel(value: String): Self = StObject.set(x, "headerLabel", value.asInstanceOf[js.Any])
  }
}
