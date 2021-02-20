package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatedArgs extends StObject {
  
  var forced: Boolean = js.native
}
object UpdatedArgs {
  
  @scala.inline
  def apply(forced: Boolean): UpdatedArgs = {
    val __obj = js.Dynamic.literal(forced = forced.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedArgs]
  }
  
  @scala.inline
  implicit class UpdatedArgsMutableBuilder[Self <: UpdatedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
  }
}
