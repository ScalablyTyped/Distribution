package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billable extends StObject {
  
  var billable: UBUNTU
}
object Billable {
  
  inline def apply(billable: UBUNTU): Billable = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Billable] (val x: Self) extends AnyVal {
    
    inline def setBillable(value: UBUNTU): Self = StObject.set(x, "billable", value.asInstanceOf[js.Any])
  }
}
