package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference
  extends StObject
     with Association {
  
  var referenceType: ReferenceType
}
object Reference {
  
  inline def apply(identifier: String, referenceType: ReferenceType): Reference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    inline def setReferenceType(value: ReferenceType): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
  }
}
