package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameOnly extends StObject {
  
  var nameOnly: js.UndefOr[Boolean] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
}
object NameOnly {
  
  @scala.inline
  def apply(): NameOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameOnly]
  }
  
  @scala.inline
  implicit class NameOnlyMutableBuilder[Self <: NameOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameOnly(value: Boolean): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnlyUndefined: Self = StObject.set(x, "nameOnly", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
