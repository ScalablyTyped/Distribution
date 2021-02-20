package typings.next.anon

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePathDestination
  extends typings.next.mod.Redirect {
  
  var basePath: js.UndefOr[`false`] = js.native
  
  var destination: String = js.native
  
  var permanent: Boolean = js.native
}
object BasePathDestination {
  
  @scala.inline
  def apply(destination: String, permanent: Boolean): BasePathDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathDestination]
  }
  
  @scala.inline
  implicit class BasePathDestinationMutableBuilder[Self <: BasePathDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
  }
}
