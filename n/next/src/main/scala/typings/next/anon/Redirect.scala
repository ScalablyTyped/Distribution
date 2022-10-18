package typings.next.anon

import typings.next.typesMod.GetServerSidePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redirect
  extends StObject
     with GetServerSidePropsResult[Any] {
  
  var redirect: typings.next.typesMod.Redirect
}
object Redirect {
  
  inline def apply(redirect: typings.next.typesMod.Redirect): Redirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  
  extension [Self <: Redirect](x: Self) {
    
    inline def setRedirect(value: typings.next.typesMod.Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
  }
}
