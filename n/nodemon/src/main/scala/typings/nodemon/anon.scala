package typings.nodemon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Re extends StObject {
    
    var re: String
  }
  object Re {
    
    inline def apply(re: String): Re = {
      val __obj = js.Dynamic.literal(re = re.asInstanceOf[js.Any])
      __obj.asInstanceOf[Re]
    }
    
    extension [Self <: Re](x: Self) {
      
      inline def setRe(value: String): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    }
  }
}
