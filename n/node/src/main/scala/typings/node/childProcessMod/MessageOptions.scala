package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOptions extends StObject {
  
  var keepOpen: js.UndefOr[Boolean] = js.undefined
}
object MessageOptions {
  
  inline def apply(): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
    
    inline def setKeepOpen(value: Boolean): Self = StObject.set(x, "keepOpen", value.asInstanceOf[js.Any])
    
    inline def setKeepOpenUndefined: Self = StObject.set(x, "keepOpen", js.undefined)
  }
}
