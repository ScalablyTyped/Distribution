package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillableWINDOWS extends StObject {
  
  var billable: WINDOWS
}
object BillableWINDOWS {
  
  inline def apply(billable: WINDOWS): BillableWINDOWS = {
    val __obj = js.Dynamic.literal(billable = billable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillableWINDOWS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillableWINDOWS] (val x: Self) extends AnyVal {
    
    inline def setBillable(value: WINDOWS): Self = StObject.set(x, "billable", value.asInstanceOf[js.Any])
  }
}
