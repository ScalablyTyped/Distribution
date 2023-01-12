package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CompleteColumnsNames extends StObject {
    
    var completeColumnsNames: js.Array[Any]
    
    var simpleColumnsNames: js.Array[Any]
  }
  object CompleteColumnsNames {
    
    inline def apply(completeColumnsNames: js.Array[Any], simpleColumnsNames: js.Array[Any]): CompleteColumnsNames = {
      val __obj = js.Dynamic.literal(completeColumnsNames = completeColumnsNames.asInstanceOf[js.Any], simpleColumnsNames = simpleColumnsNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteColumnsNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompleteColumnsNames] (val x: Self) extends AnyVal {
      
      inline def setCompleteColumnsNames(value: js.Array[Any]): Self = StObject.set(x, "completeColumnsNames", value.asInstanceOf[js.Any])
      
      inline def setCompleteColumnsNamesVarargs(value: Any*): Self = StObject.set(x, "completeColumnsNames", js.Array(value*))
      
      inline def setSimpleColumnsNames(value: js.Array[Any]): Self = StObject.set(x, "simpleColumnsNames", value.asInstanceOf[js.Any])
      
      inline def setSimpleColumnsNamesVarargs(value: Any*): Self = StObject.set(x, "simpleColumnsNames", js.Array(value*))
    }
  }
  
  trait DisableGetChildren extends StObject {
    
    var disableGetChildren: Boolean
    
    var field: Any
    
    var operator: String
    
    var value: Any
  }
  object DisableGetChildren {
    
    inline def apply(disableGetChildren: Boolean, field: Any, operator: String, value: Any): DisableGetChildren = {
      val __obj = js.Dynamic.literal(disableGetChildren = disableGetChildren.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableGetChildren]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisableGetChildren] (val x: Self) extends AnyVal {
      
      inline def setDisableGetChildren(value: Boolean): Self = StObject.set(x, "disableGetChildren", value.asInstanceOf[js.Any])
      
      inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var disableGetChildren: Boolean
    
    var field: Any
    
    var operator: String
    
    var value: js.Array[Any]
  }
  object Field {
    
    inline def apply(disableGetChildren: Boolean, field: Any, operator: String, value: js.Array[Any]): Field = {
      val __obj = js.Dynamic.literal(disableGetChildren = disableGetChildren.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      inline def setDisableGetChildren(value: Boolean): Self = StObject.set(x, "disableGetChildren", value.asInstanceOf[js.Any])
      
      inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
