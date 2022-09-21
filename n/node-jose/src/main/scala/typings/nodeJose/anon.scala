package typings.nodeJose

import typings.nodeJose.mod.JWK.KeyUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithms extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
    
    var handlers: js.UndefOr[Any] = js.undefined
  }
  object Algorithms {
    
    inline def apply(): Algorithms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Algorithms]
    }
    
    extension [Self <: Algorithms](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setAllowEmbeddedKey(value: Boolean): Self = StObject.set(x, "allowEmbeddedKey", value.asInstanceOf[js.Any])
      
      inline def setAllowEmbeddedKeyUndefined: Self = StObject.set(x, "allowEmbeddedKey", js.undefined)
      
      inline def setHandlers(value: Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    }
  }
  
  trait AllowEmbeddedKey extends StObject {
    
    var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
  }
  object AllowEmbeddedKey {
    
    inline def apply(): AllowEmbeddedKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowEmbeddedKey]
    }
    
    extension [Self <: AllowEmbeddedKey](x: Self) {
      
      inline def setAllowEmbeddedKey(value: Boolean): Self = StObject.set(x, "allowEmbeddedKey", value.asInstanceOf[js.Any])
      
      inline def setAllowEmbeddedKeyUndefined: Self = StObject.set(x, "allowEmbeddedKey", js.undefined)
    }
  }
  
  trait Exp extends StObject {
    
    var exp: Boolean | typings.nodeJose.mod.JWS.Exp
  }
  object Exp {
    
    inline def apply(exp: Boolean | typings.nodeJose.mod.JWS.Exp): Exp = {
      val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exp]
    }
    
    extension [Self <: Exp](x: Self) {
      
      inline def setExp(value: Boolean | typings.nodeJose.mod.JWS.Exp): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<node-jose.node-jose.JWK.KeyStoreGetOptions> */
  trait PartialKeyStoreGetOptions extends StObject {
    
    var alg: js.UndefOr[String] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var kty: js.UndefOr[String] = js.undefined
    
    var use: js.UndefOr[KeyUse] = js.undefined
  }
  object PartialKeyStoreGetOptions {
    
    inline def apply(): PartialKeyStoreGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialKeyStoreGetOptions]
    }
    
    extension [Self <: PartialKeyStoreGetOptions](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
      
      inline def setUse(value: KeyUse): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
}
