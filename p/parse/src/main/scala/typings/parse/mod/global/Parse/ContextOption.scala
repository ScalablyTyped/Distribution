package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextOption extends StObject {
  
  var context: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ContextOption {
  
  inline def apply(): ContextOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextOption] (val x: Self) extends AnyVal {
    
    inline def setContext(value: StringDictionary[Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
