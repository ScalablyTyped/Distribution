package typings.npmProfile

import org.scalablytyped.runtime.StringDictionary
import typings.npmProfile.mod._TFAStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any]
       with _TFAStatus {
    
    var pending: Boolean = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(pending: Boolean): Dictkey = {
      val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    }
  }
}
