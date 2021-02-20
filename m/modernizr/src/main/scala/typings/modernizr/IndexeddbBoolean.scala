package typings.modernizr

import typings.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexeddbBoolean extends Boolean {
  
  var deletedatabase: scala.Boolean = js.native
}
object IndexeddbBoolean {
  
  @scala.inline
  def apply(deletedatabase: scala.Boolean): IndexeddbBoolean = {
    val __obj = js.Dynamic.literal(deletedatabase = deletedatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexeddbBoolean]
  }
  
  @scala.inline
  implicit class IndexeddbBooleanMutableBuilder[Self <: IndexeddbBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedatabase(value: scala.Boolean): Self = StObject.set(x, "deletedatabase", value.asInstanceOf[js.Any])
  }
}
