package typings.next.anon

import typings.next.mod.GetStaticPropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redirect
  extends StObject
     with GetStaticPropsResult[js.Any] {
  
  var redirect: typings.next.mod.Redirect
  
  var revalidate: js.UndefOr[Double | Boolean] = js.undefined
}
object Redirect {
  
  inline def apply(redirect: typings.next.mod.Redirect): Redirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  
  extension [Self <: Redirect](x: Self) {
    
    inline def setRedirect(value: typings.next.mod.Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRevalidate(value: Double | Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
