package typings.mdxJsReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Components extends StObject {
    
    var components: js.UndefOr[typings.mdxJsReact.libMod.Components | Null] = js.undefined
  }
  object Components {
    
    inline def apply(): Components = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Components]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: typings.mdxJsReact.libMod.Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsNull: Self = StObject.set(x, "components", null)
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
}
