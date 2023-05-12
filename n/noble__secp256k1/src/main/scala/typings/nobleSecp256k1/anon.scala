package typings.nobleSecp256k1

import typings.nobleSecp256k1.mod.Hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ExtraEntropy extends StObject {
    
    var extraEntropy: js.UndefOr[Boolean | Hex] = js.undefined
    
    var lowS: js.UndefOr[Boolean] = js.undefined
  }
  object ExtraEntropy {
    
    inline def apply(): ExtraEntropy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraEntropy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraEntropy] (val x: Self) extends AnyVal {
      
      inline def setExtraEntropy(value: Boolean | Hex): Self = StObject.set(x, "extraEntropy", value.asInstanceOf[js.Any])
      
      inline def setExtraEntropyUndefined: Self = StObject.set(x, "extraEntropy", js.undefined)
      
      inline def setLowS(value: Boolean): Self = StObject.set(x, "lowS", value.asInstanceOf[js.Any])
      
      inline def setLowSUndefined: Self = StObject.set(x, "lowS", js.undefined)
    }
  }
  
  trait LowS extends StObject {
    
    var lowS: js.UndefOr[Boolean] = js.undefined
  }
  object LowS {
    
    inline def apply(): LowS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LowS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LowS] (val x: Self) extends AnyVal {
      
      inline def setLowS(value: Boolean): Self = StObject.set(x, "lowS", value.asInstanceOf[js.Any])
      
      inline def setLowSUndefined: Self = StObject.set(x, "lowS", js.undefined)
    }
  }
}
