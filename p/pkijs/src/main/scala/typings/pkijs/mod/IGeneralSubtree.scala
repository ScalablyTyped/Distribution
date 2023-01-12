package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeneralSubtree extends StObject {
  
  var base: GeneralName
  
  var maximum: js.UndefOr[Double | Integer] = js.undefined
  
  var minimum: Double | Integer
}
object IGeneralSubtree {
  
  inline def apply(base: GeneralName, minimum: Double | Integer): IGeneralSubtree = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeneralSubtree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeneralSubtree] (val x: Self) extends AnyVal {
    
    inline def setBase(value: GeneralName): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setMaximum(value: Double | Integer): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double | Integer): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
