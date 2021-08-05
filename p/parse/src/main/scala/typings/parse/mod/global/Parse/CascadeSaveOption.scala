package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CascadeSaveOption extends StObject {
  
  /** If `false`, nested objects will not be saved (default is `true`). */
  var cascadeSave: js.UndefOr[Boolean] = js.undefined
}
object CascadeSaveOption {
  
  inline def apply(): CascadeSaveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadeSaveOption]
  }
  
  extension [Self <: CascadeSaveOption](x: Self) {
    
    inline def setCascadeSave(value: Boolean): Self = StObject.set(x, "cascadeSave", value.asInstanceOf[js.Any])
    
    inline def setCascadeSaveUndefined: Self = StObject.set(x, "cascadeSave", js.undefined)
  }
}
