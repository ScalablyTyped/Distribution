package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowContext
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var rowContext: js.Object
}
object RowContext {
  
  inline def apply(rowContext: js.Object): RowContext = {
    val __obj = js.Dynamic.literal(rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowContext] (val x: Self) extends AnyVal {
    
    inline def setRowContext(value: js.Object): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
  }
}
