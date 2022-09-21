package typings.pify

import typings.pify.pifyBooleans.`false`
import typings.pify.pifyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ErrorFirst extends StObject {
    
    var errorFirst: `true`
  }
  object ErrorFirst {
    
    inline def apply(): ErrorFirst = {
      val __obj = js.Dynamic.literal(errorFirst = true)
      __obj.asInstanceOf[ErrorFirst]
    }
    
    extension [Self <: ErrorFirst](x: Self) {
      
      inline def setErrorFirst(value: `true`): Self = StObject.set(x, "errorFirst", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiArgs extends StObject {
    
    var multiArgs: `false`
  }
  object MultiArgs {
    
    inline def apply(): MultiArgs = {
      val __obj = js.Dynamic.literal(multiArgs = false)
      __obj.asInstanceOf[MultiArgs]
    }
    
    extension [Self <: MultiArgs](x: Self) {
      
      inline def setMultiArgs(value: `false`): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
}
