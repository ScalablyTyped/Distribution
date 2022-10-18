package typings.micromarkExtensionMdxjsEsm

import org.scalablytyped.runtime.NumberDictionary
import typings.micromarkUtilTypes.mod.Effects
import typings.micromarkUtilTypes.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Concrete extends StObject {
    
    var concrete: Boolean
    
    def tokenize(effects: Effects, ok: State, nok: State): State
  }
  object Concrete {
    
    inline def apply(concrete: Boolean, tokenize: (Effects, State, State) => State): Concrete = {
      val __obj = js.Dynamic.literal(concrete = concrete.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
      __obj.asInstanceOf[Concrete]
    }
    
    extension [Self <: Concrete](x: Self) {
      
      inline def setConcrete(value: Boolean): Self = StObject.set(x, "concrete", value.asInstanceOf[js.Any])
      
      inline def setTokenize(value: (Effects, State, State) => State): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
    }
  }
  
  trait Flow extends StObject {
    
    var flow: NumberDictionary[Concrete]
  }
  object Flow {
    
    inline def apply(flow: NumberDictionary[Concrete]): Flow = {
      val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flow]
    }
    
    extension [Self <: Flow](x: Self) {
      
      inline def setFlow(value: NumberDictionary[Concrete]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    }
  }
}
