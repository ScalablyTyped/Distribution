package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseConnectionOptions extends StObject {
  
  /**
    * If drop is false, then the connection is returned to the pool for reuse.
    *
    * If drop is true, the connection will be completely dropped from the connection pool
    *
    * @default false
    */
  var drop: Boolean
}
object CloseConnectionOptions {
  
  @scala.inline
  def apply(drop: Boolean): CloseConnectionOptions = {
    val __obj = js.Dynamic.literal(drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseConnectionOptions]
  }
  
  @scala.inline
  implicit class CloseConnectionOptionsMutableBuilder[Self <: CloseConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
  }
}
