package typings.plaidLink.mod

import typings.plaidLink.anon.Create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @js.native
  trait Window extends StObject {
    
    var Plaid: Create = js.native
  }
  object Window {
    
    @scala.inline
    def apply(Plaid: Create): Window = {
      val __obj = js.Dynamic.literal(Plaid = Plaid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaid(value: Create): Self = StObject.set(x, "Plaid", value.asInstanceOf[js.Any])
    }
  }
}
