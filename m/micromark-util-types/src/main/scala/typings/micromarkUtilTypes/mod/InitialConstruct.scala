package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialConstruct
  extends StObject
     with Construct {
  
  def tokenize(effects: Effects): State
  @JSName("tokenize")
  var tokenize_Original_InitialConstruct: Initializer
}
object InitialConstruct {
  
  inline def apply(tokenize: Initializer): InitialConstruct = {
    val __obj = js.Dynamic.literal(tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialConstruct]
  }
  
  extension [Self <: InitialConstruct](x: Self) {
    
    inline def setTokenize(value: Initializer): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
  }
}
