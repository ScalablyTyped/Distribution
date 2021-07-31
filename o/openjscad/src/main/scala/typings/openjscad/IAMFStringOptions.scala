package typings.openjscad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAMFStringOptions extends StObject {
  
  var unit: String
}
object IAMFStringOptions {
  
  @scala.inline
  def apply(unit: String): IAMFStringOptions = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMFStringOptions]
  }
  
  @scala.inline
  implicit class IAMFStringOptionsMutableBuilder[Self <: IAMFStringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
