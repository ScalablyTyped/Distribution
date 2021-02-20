package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestOptions extends RequestOptions {
  
  var jar: js.UndefOr[Boolean] = js.native
}
object ClientRequestOptions {
  
  @scala.inline
  def apply(): ClientRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientRequestOptions]
  }
  
  @scala.inline
  implicit class ClientRequestOptionsMutableBuilder[Self <: ClientRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJar(value: Boolean): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
  }
}
