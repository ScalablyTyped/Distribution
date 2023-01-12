package typings.officeJsPreview.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InUse extends StObject {
  
  var inUse: Boolean
  
  var shortcut: String
}
object InUse {
  
  inline def apply(inUse: Boolean, shortcut: String): InUse = {
    val __obj = js.Dynamic.literal(inUse = inUse.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InUse] (val x: Self) extends AnyVal {
    
    inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
    
    inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
  }
}
