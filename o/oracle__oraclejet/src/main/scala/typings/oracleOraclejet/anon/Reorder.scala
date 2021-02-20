package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reorder extends StObject {
  
  var reorder: Row = js.native
}
object Reorder {
  
  @scala.inline
  def apply(reorder: Row): Reorder = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reorder]
  }
  
  @scala.inline
  implicit class ReorderMutableBuilder[Self <: Reorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReorder(value: Row): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
  }
}
