package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearSpringOptions extends SpringOptions {
  
  var restLength: js.UndefOr[Double] = js.native
}
object LinearSpringOptions {
  
  @scala.inline
  def apply(): LinearSpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearSpringOptions]
  }
  
  @scala.inline
  implicit class LinearSpringOptionsMutableBuilder[Self <: LinearSpringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestLength(value: Double): Self = StObject.set(x, "restLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestLengthUndefined: Self = StObject.set(x, "restLength", js.undefined)
  }
}
