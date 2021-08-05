package typings.modernizr

import typings.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexeddbBoolean
  extends StObject
     with Boolean {
  
  var deletedatabase: scala.Boolean
}
object IndexeddbBoolean {
  
  inline def apply(deletedatabase: scala.Boolean): IndexeddbBoolean = {
    val __obj = js.Dynamic.literal(deletedatabase = deletedatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexeddbBoolean]
  }
  
  extension [Self <: IndexeddbBoolean](x: Self) {
    
    inline def setDeletedatabase(value: scala.Boolean): Self = StObject.set(x, "deletedatabase", value.asInstanceOf[js.Any])
  }
}
