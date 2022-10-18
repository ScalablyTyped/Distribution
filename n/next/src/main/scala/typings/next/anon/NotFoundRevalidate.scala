package typings.next.anon

import typings.next.nextBooleans.`true`
import typings.next.typesMod.GetStaticPropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotFoundRevalidate
  extends StObject
     with GetStaticPropsResult[Any] {
  
  var notFound: `true`
  
  var revalidate: js.UndefOr[Double | Boolean] = js.undefined
}
object NotFoundRevalidate {
  
  inline def apply(): NotFoundRevalidate = {
    val __obj = js.Dynamic.literal(notFound = true)
    __obj.asInstanceOf[NotFoundRevalidate]
  }
  
  extension [Self <: NotFoundRevalidate](x: Self) {
    
    inline def setNotFound(value: `true`): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setRevalidate(value: Double | Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
