package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamedValueNamespace extends StObject {
  
  def Clone(): INamedValueNamespace
  
  var NamedValues: INamedValues
  
  var NamespaceName: String
}
object INamedValueNamespace {
  
  @scala.inline
  def apply(Clone: () => INamedValueNamespace, NamedValues: INamedValues, NamespaceName: String): INamedValueNamespace = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), NamedValues = NamedValues.asInstanceOf[js.Any], NamespaceName = NamespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedValueNamespace]
  }
  
  @scala.inline
  implicit class INamedValueNamespaceMutableBuilder[Self <: INamedValueNamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => INamedValueNamespace): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNamedValues(value: INamedValues): Self = StObject.set(x, "NamedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceName(value: String): Self = StObject.set(x, "NamespaceName", value.asInstanceOf[js.Any])
  }
}
