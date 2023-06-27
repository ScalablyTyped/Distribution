package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseProperty extends StObject {
  
  /**
    * Defines the collapse group to trim results. The properties in this collection must be sortable/refinable properties.
    * Required.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  // Defines a maximum limit count for this field. This numeric value must be a positive integer. Required.
  var limit: js.UndefOr[Double] = js.undefined
}
object CollapseProperty {
  
  inline def apply(): CollapseProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapseProperty] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
