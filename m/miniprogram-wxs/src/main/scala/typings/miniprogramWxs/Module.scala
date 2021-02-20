package typings.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module extends StObject {
  
  /**
    * 导出内容
    */
  var exports: js.Any = js.native
}
object Module {
  
  @scala.inline
  def apply(exports: js.Any): Module = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
  }
}
