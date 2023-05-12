package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayTemplate extends StObject {
  
  /**
    * The text identifier for the display template; for example, contosoTickets. Maximum 16 characters. Only alphanumeric
    * characters allowed.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The definition of the content's appearance, represented by an Adaptive Card, which is a JSON-serialized card object
    * model.
    */
  var layout: js.UndefOr[Any] = js.undefined
  
  /**
    * Defines the priority of a display template. A display template with priority 1 is evaluated before a template with
    * priority 4. Gaps in priority values are supported. Must be positive value.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  // Specifies additional rules for selecting this display template based on the item schema. Optional.
  var rules: js.UndefOr[NullableOption[js.Array[PropertyRule]]] = js.undefined
}
object DisplayTemplate {
  
  inline def apply(): DisplayTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayTemplate] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRules(value: NullableOption[js.Array[PropertyRule]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesNull: Self = StObject.set(x, "rules", null)
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: PropertyRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
