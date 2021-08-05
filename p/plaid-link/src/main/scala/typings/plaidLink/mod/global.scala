package typings.plaidLink.mod

import typings.plaidLink.anon.Create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait Window extends StObject {
    
    var Plaid: Create
  }
  object Window {
    
    inline def apply(Plaid: Create): Window = {
      val __obj = js.Dynamic.literal(Plaid = Plaid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setPlaid(value: Create): Self = StObject.set(x, "Plaid", value.asInstanceOf[js.Any])
    }
  }
}
