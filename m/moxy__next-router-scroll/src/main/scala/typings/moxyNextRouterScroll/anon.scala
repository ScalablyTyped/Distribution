package typings.moxyNextRouterScroll

import typings.moxyNextRouterScroll.scrollBehaviorMod.NextScrollBehaviorContext
import typings.react.mod.ReactNode
import typings.scrollBehavior.mod.ScrollTarget
import typings.scrollBehavior.mod.ShouldUpdateScroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsPath extends StObject {
    
    var asPath: String
    
    var pathname: String
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  }
  object AsPath {
    
    inline def apply(
      asPath: String,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): AsPath = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsPath] (val x: Self) extends AnyVal {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disableNextLinkScroll: js.UndefOr[Boolean] = js.undefined
    
    var shouldUpdateScroll: js.UndefOr[ShouldUpdateScroll[NextScrollBehaviorContext]] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableNextLinkScroll(value: Boolean): Self = StObject.set(x, "disableNextLinkScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableNextLinkScrollUndefined: Self = StObject.set(x, "disableNextLinkScroll", js.undefined)
      
      inline def setShouldUpdateScroll(
        value: (/* prevContext */ NextScrollBehaviorContext | Null, NextScrollBehaviorContext) => ScrollTarget
      ): Self = StObject.set(x, "shouldUpdateScroll", js.Any.fromFunction2(value))
      
      inline def setShouldUpdateScrollUndefined: Self = StObject.set(x, "shouldUpdateScroll", js.undefined)
    }
  }
}
