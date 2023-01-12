package typings.mdx

import typings.mdx.typesMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Wrapper extends StObject {
    
    /**
      * If a wrapper component is defined, the MDX content will be wrapped inside of it.
      */
    var wrapper: js.UndefOr[Component[Any]] = js.undefined
  }
  object Wrapper {
    
    inline def apply(): Wrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Wrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Wrapper] (val x: Self) extends AnyVal {
      
      inline def setWrapper(value: Component[Any]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperFunction1(
        value: Any => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ Any) | Null
      ): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
