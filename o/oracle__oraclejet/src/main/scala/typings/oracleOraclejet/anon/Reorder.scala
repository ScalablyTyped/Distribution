package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reorder extends StObject {
  
  var reorder: Row
}
object Reorder {
  
  inline def apply(reorder: Row): Reorder = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reorder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reorder] (val x: Self) extends AnyVal {
    
    inline def setReorder(value: Row): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
  }
}
