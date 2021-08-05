package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapSQL extends StObject {
  
  var capSQL: js.UndefOr[Boolean] = js.undefined
}
object CapSQL {
  
  inline def apply(): CapSQL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapSQL]
  }
  
  extension [Self <: CapSQL](x: Self) {
    
    inline def setCapSQL(value: Boolean): Self = StObject.set(x, "capSQL", value.asInstanceOf[js.Any])
    
    inline def setCapSQLUndefined: Self = StObject.set(x, "capSQL", js.undefined)
  }
}
