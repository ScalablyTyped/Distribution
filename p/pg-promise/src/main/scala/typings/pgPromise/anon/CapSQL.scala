package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapSQL extends StObject {
  
  var capSQL: js.UndefOr[Boolean] = js.undefined
}
object CapSQL {
  
  @scala.inline
  def apply(): CapSQL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapSQL]
  }
  
  @scala.inline
  implicit class CapSQLMutableBuilder[Self <: CapSQL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapSQL(value: Boolean): Self = StObject.set(x, "capSQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapSQLUndefined: Self = StObject.set(x, "capSQL", js.undefined)
  }
}
