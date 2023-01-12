package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmployeeOrgData extends StObject {
  
  // The cost center associated with the user. Returned only on $select. Supports $filter.
  var costCenter: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the division in which the user works. Returned only on $select. Supports $filter.
  var division: js.UndefOr[NullableOption[String]] = js.undefined
}
object EmployeeOrgData {
  
  inline def apply(): EmployeeOrgData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmployeeOrgData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmployeeOrgData] (val x: Self) extends AnyVal {
    
    inline def setCostCenter(value: NullableOption[String]): Self = StObject.set(x, "costCenter", value.asInstanceOf[js.Any])
    
    inline def setCostCenterNull: Self = StObject.set(x, "costCenter", null)
    
    inline def setCostCenterUndefined: Self = StObject.set(x, "costCenter", js.undefined)
    
    inline def setDivision(value: NullableOption[String]): Self = StObject.set(x, "division", value.asInstanceOf[js.Any])
    
    inline def setDivisionNull: Self = StObject.set(x, "division", null)
    
    inline def setDivisionUndefined: Self = StObject.set(x, "division", js.undefined)
  }
}
