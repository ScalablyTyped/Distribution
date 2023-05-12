package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.BinaryOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyRule extends StObject {
  
  /**
    * Specifies the operations to be performed during evaluation of a single propertyRule, where property and a string from
    * the values collection are the respective operands. Possible values are: null, equals, notEquals, contains, notContains,
    * lessThan, greaterThan, startsWith. Required.
    */
  var operation: js.UndefOr[RuleOperation] = js.undefined
  
  // The property from the externalItem schema. Required.
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * A collection with one or many strings. The specified string(s) will be matched with the specified property using the
    * specified operation. Required.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The join operator for evaluating multiple propertyRules. For example, if and is specified, then all propertyRules must
    * be true for the propertyRule to be true. Possible values are: or, and. Required.
    */
  var valuesJoinedBy: js.UndefOr[BinaryOperator] = js.undefined
}
object PropertyRule {
  
  inline def apply(): PropertyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyRule] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: RuleOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesJoinedBy(value: BinaryOperator): Self = StObject.set(x, "valuesJoinedBy", value.asInstanceOf[js.Any])
    
    inline def setValuesJoinedByUndefined: Self = StObject.set(x, "valuesJoinedBy", js.undefined)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
