package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CascadeSaveOption extends StObject {
  
  /** If `false`, nested objects will not be saved (default is `true`). */
  var cascadeSave: js.UndefOr[Boolean] = js.native
}
object CascadeSaveOption {
  
  @scala.inline
  def apply(): CascadeSaveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadeSaveOption]
  }
  
  @scala.inline
  implicit class CascadeSaveOptionMutableBuilder[Self <: CascadeSaveOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascadeSave(value: Boolean): Self = StObject.set(x, "cascadeSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeSaveUndefined: Self = StObject.set(x, "cascadeSave", js.undefined)
  }
}
