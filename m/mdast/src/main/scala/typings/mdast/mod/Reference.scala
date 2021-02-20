package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference extends Association {
  
  var referenceType: ReferenceType = js.native
}
object Reference {
  
  @scala.inline
  def apply(identifier: String, referenceType: ReferenceType): Reference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceType(value: ReferenceType): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
  }
}
