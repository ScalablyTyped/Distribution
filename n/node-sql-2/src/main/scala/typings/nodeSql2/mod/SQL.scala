package typings.nodeSql2.mod

import typings.nodeSql2.anon.LOWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQL extends StObject {
  
  var functions: LOWER = js.native
}
object SQL {
  
  @scala.inline
  def apply(functions: LOWER): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQL]
  }
  
  @scala.inline
  implicit class SQLMutableBuilder[Self <: SQL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctions(value: LOWER): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
  }
}
