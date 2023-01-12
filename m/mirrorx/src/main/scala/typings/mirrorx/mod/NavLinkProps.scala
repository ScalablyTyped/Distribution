package typings.mirrorx.mod

import typings.history.mod.Location
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavLinkProps
  extends StObject
     with LinkProps {
  
  var activeClassName: js.UndefOr[String] = js.undefined
  
  var activeStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var isActive: js.UndefOr[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<any> */ /* match */ Any, 
      /* location */ Location, 
      Boolean
    ]
  ] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object NavLinkProps {
  
  inline def apply(
    to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
  ): NavLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavLinkProps] (val x: Self) extends AnyVal {
    
    inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
    
    inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
    
    inline def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setIsActive(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<any> */ /* match */ Any, /* location */ Location) => Boolean
    ): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
