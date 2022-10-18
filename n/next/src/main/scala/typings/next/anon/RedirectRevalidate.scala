package typings.next.anon

import typings.next.typesMod.GetStaticPropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectRevalidate
  extends StObject
     with GetStaticPropsResult[Any] {
  
  var redirect: typings.next.typesMod.Redirect
  
  var revalidate: js.UndefOr[Double | Boolean] = js.undefined
}
object RedirectRevalidate {
  
  inline def apply(redirect: typings.next.typesMod.Redirect): RedirectRevalidate = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRevalidate]
  }
  
  extension [Self <: RedirectRevalidate](x: Self) {
    
    inline def setRedirect(value: typings.next.typesMod.Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRevalidate(value: Double | Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
