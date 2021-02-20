package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteConfig extends StObject {
  
  var portal: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[String] = js.native
}
object ExecuteConfig {
  
  @scala.inline
  def apply(): ExecuteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteConfig]
  }
  
  @scala.inline
  implicit class ExecuteConfigMutableBuilder[Self <: ExecuteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    @scala.inline
    def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
