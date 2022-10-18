package typings.next.anon

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePathDestination
  extends StObject
     with typings.next.typesMod.Redirect {
  
  var basePath: js.UndefOr[`false`] = js.undefined
  
  var destination: String
  
  var permanent: Boolean
}
object BasePathDestination {
  
  inline def apply(destination: String, permanent: Boolean): BasePathDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathDestination]
  }
  
  extension [Self <: BasePathDestination](x: Self) {
    
    inline def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
  }
}
