package typings.nodeForge.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotAfter extends StObject {
  
  var notAfter: Date = js.native
  
  var notBefore: Date = js.native
}
object NotAfter {
  
  @scala.inline
  def apply(notAfter: Date, notBefore: Date): NotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAfter]
  }
  
  @scala.inline
  implicit class NotAfterMutableBuilder[Self <: NotAfter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotAfter(value: Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBefore(value: Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
  }
}
