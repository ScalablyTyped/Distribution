package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProblemArguments extends StObject {
  
  var keys: js.Array[String]
  
  var values: js.Array[String]
}
object IProblemArguments {
  
  @scala.inline
  def apply(keys: js.Array[String], values: js.Array[String]): IProblemArguments = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProblemArguments]
  }
  
  @scala.inline
  implicit class IProblemArgumentsMutableBuilder[Self <: IProblemArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
