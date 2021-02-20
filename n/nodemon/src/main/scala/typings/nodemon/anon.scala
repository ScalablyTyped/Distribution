package typings.nodemon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Re extends StObject {
    
    var re: String = js.native
  }
  object Re {
    
    @scala.inline
    def apply(re: String): Re = {
      val __obj = js.Dynamic.literal(re = re.asInstanceOf[js.Any])
      __obj.asInstanceOf[Re]
    }
    
    @scala.inline
    implicit class ReMutableBuilder[Self <: Re] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRe(value: String): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    }
  }
}
