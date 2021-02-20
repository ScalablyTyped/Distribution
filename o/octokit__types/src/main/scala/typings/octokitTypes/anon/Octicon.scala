package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Octicon extends StObject {
  
  var message: String = js.native
  
  var octicon: String = js.native
}
object Octicon {
  
  @scala.inline
  def apply(message: String, octicon: String): Octicon = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], octicon = octicon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Octicon]
  }
  
  @scala.inline
  implicit class OcticonMutableBuilder[Self <: Octicon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcticon(value: String): Self = StObject.set(x, "octicon", value.asInstanceOf[js.Any])
  }
}
