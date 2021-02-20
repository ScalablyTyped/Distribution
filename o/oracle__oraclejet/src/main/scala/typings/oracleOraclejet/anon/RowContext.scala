package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowContext
  extends /* key */ StringDictionary[js.Any] {
  
  var rowContext: js.Object = js.native
}
object RowContext {
  
  @scala.inline
  def apply(rowContext: js.Object): RowContext = {
    val __obj = js.Dynamic.literal(rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContext]
  }
  
  @scala.inline
  implicit class RowContextMutableBuilder[Self <: RowContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowContext(value: js.Object): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
  }
}
