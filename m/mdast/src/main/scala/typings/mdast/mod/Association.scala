package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Association extends StObject {
  
  var identifier: String
  
  var label: js.UndefOr[String] = js.undefined
}
object Association {
  
  @scala.inline
  def apply(identifier: String): Association = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Association]
  }
  
  @scala.inline
  implicit class AssociationMutableBuilder[Self <: Association] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
