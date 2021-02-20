package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Silent
  extends /* key */ StringDictionary[js.Any] {
  
  var deferred: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object Silent {
  
  @scala.inline
  def apply(): Silent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Silent]
  }
  
  @scala.inline
  implicit class SilentMutableBuilder[Self <: Silent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
