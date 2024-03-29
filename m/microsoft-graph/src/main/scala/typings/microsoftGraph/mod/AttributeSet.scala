package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeSet
  extends StObject
     with Entity {
  
  /**
    * Description of the attribute set. Can be up to 128 characters long and include Unicode characters. Can be changed
    * later.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Maximum number of custom security attributes that can be defined in this attribute set. Default value is null. If not
    * specified, the administrator can add up to the maximum of 500 active attributes per tenant. Can be changed later.
    */
  var maxAttributesPerSet: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AttributeSet {
  
  inline def apply(): AttributeSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeSet] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMaxAttributesPerSet(value: NullableOption[Double]): Self = StObject.set(x, "maxAttributesPerSet", value.asInstanceOf[js.Any])
    
    inline def setMaxAttributesPerSetNull: Self = StObject.set(x, "maxAttributesPerSet", null)
    
    inline def setMaxAttributesPerSetUndefined: Self = StObject.set(x, "maxAttributesPerSet", js.undefined)
  }
}
