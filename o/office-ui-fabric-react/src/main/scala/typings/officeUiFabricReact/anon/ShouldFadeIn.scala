package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShouldFadeIn extends StObject {
  
  var shouldFadeIn: Boolean = js.native
}
object ShouldFadeIn {
  
  @scala.inline
  def apply(shouldFadeIn: Boolean): ShouldFadeIn = {
    val __obj = js.Dynamic.literal(shouldFadeIn = shouldFadeIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldFadeIn]
  }
  
  @scala.inline
  implicit class ShouldFadeInMutableBuilder[Self <: ShouldFadeIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShouldFadeIn(value: Boolean): Self = StObject.set(x, "shouldFadeIn", value.asInstanceOf[js.Any])
  }
}
