package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.contains
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.ends_with
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.regex
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.starts_with
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Negate extends StObject {
  
  /** @description How this rule will appear to users. */
  var name: js.UndefOr[String] = js.undefined
  
  /** @description If true, the rule will fail if the pattern matches. */
  var negate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The operator to use for matching.
    * @enum {string}
    */
  var operator: starts_with | ends_with | contains | regex
  
  /** @description The pattern to match with. */
  var pattern: String
}
object Negate {
  
  inline def apply(operator: starts_with | ends_with | contains | regex, pattern: String): Negate = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Negate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Negate] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
    
    inline def setOperator(value: starts_with | ends_with | contains | regex): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
