package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-datagrid-cell`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubId extends StObject {
  
  var subId: `oj-datagrid-cell` = js.native
}
object SubId {
  
  @scala.inline
  def apply(subId: `oj-datagrid-cell`): SubId = {
    val __obj = js.Dynamic.literal(subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubId]
  }
  
  @scala.inline
  implicit class SubIdMutableBuilder[Self <: SubId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubId(value: `oj-datagrid-cell`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
