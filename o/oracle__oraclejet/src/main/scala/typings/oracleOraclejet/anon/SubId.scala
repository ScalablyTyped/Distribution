package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-datagrid-cell`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubId extends StObject {
  
  var subId: `oj-datagrid-cell`
}
object SubId {
  
  inline def apply(): SubId = {
    val __obj = js.Dynamic.literal(subId = "oj-datagrid-cell")
    __obj.asInstanceOf[SubId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubId] (val x: Self) extends AnyVal {
    
    inline def setSubId(value: `oj-datagrid-cell`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
