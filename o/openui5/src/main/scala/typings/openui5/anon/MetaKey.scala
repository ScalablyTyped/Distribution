package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaKey extends StObject {
  
  /**
    * Indicates whether the CTRL key was pressed when the link was selected.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the "meta" key was pressed when the link was selected.
    *
    * On Macintosh keyboards, this is the command key (⌘). On Windows keyboards, this is the windows key (⊞).
    */
  var metaKey: js.UndefOr[Boolean] = js.undefined
}
object MetaKey {
  
  inline def apply(): MetaKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaKey] (val x: Self) extends AnyVal {
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
  }
}
