package typings.money

import typings.money.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: Currency
    
    var to: Currency
  }
  object From {
    
    inline def apply(from: Currency, to: Currency): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Currency): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Currency): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
