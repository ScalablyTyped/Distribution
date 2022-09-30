package typings.meteor

import typings.meteor.anon.Accept
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  trait Module extends StObject {
    
    val hot: js.UndefOr[Accept] = js.undefined
  }
  object Module {
    
    inline def apply(): Module = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setHot(value: Accept): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
    }
  }
}
