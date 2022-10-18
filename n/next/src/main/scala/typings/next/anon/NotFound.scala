package typings.next.anon

import typings.next.nextBooleans.`true`
import typings.next.typesMod.GetServerSidePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotFound
  extends StObject
     with GetServerSidePropsResult[Any] {
  
  var notFound: `true`
}
object NotFound {
  
  inline def apply(): NotFound = {
    val __obj = js.Dynamic.literal(notFound = true)
    __obj.asInstanceOf[NotFound]
  }
  
  extension [Self <: NotFound](x: Self) {
    
    inline def setNotFound(value: `true`): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
  }
}
