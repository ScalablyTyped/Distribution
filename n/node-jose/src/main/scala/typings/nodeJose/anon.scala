package typings.nodeJose

import typings.nodeJose.mod.JWK.KeyUse
import typings.nodeJose.nodeJoseStrings.DEF
import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.flattened
import typings.nodeJose.nodeJoseStrings.general
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alg extends StObject {
    
    var alg: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var fields: js.UndefOr[js.Object] = js.undefined
    
    var format: js.UndefOr[compact | flattened] = js.undefined
  }
  object Alg {
    
    @scala.inline
    def apply(): Alg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alg]
    }
    
    @scala.inline
    implicit class AlgMutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFormat(value: compact | flattened): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait Algorithms extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
    
    var handlers: js.UndefOr[js.Any] = js.undefined
  }
  object Algorithms {
    
    @scala.inline
    def apply(): Algorithms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Algorithms]
    }
    
    @scala.inline
    implicit class AlgorithmsMutableBuilder[Self <: Algorithms] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAllowEmbeddedKey(value: Boolean): Self = StObject.set(x, "allowEmbeddedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmbeddedKeyUndefined: Self = StObject.set(x, "allowEmbeddedKey", js.undefined)
      
      @scala.inline
      def setHandlers(value: js.Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    }
  }
  
  trait AllowEmbeddedKey extends StObject {
    
    var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
  }
  object AllowEmbeddedKey {
    
    @scala.inline
    def apply(): AllowEmbeddedKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowEmbeddedKey]
    }
    
    @scala.inline
    implicit class AllowEmbeddedKeyMutableBuilder[Self <: AllowEmbeddedKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmbeddedKey(value: Boolean): Self = StObject.set(x, "allowEmbeddedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmbeddedKeyUndefined: Self = StObject.set(x, "allowEmbeddedKey", js.undefined)
    }
  }
  
  trait ContentAlg extends StObject {
    
    var contentAlg: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[js.Object] = js.undefined
    
    var format: js.UndefOr[general | compact | flattened] = js.undefined
    
    var protect: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var zip: js.UndefOr[Boolean | DEF] = js.undefined
  }
  object ContentAlg {
    
    @scala.inline
    def apply(): ContentAlg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentAlg]
    }
    
    @scala.inline
    implicit class ContentAlgMutableBuilder[Self <: ContentAlg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentAlg(value: String): Self = StObject.set(x, "contentAlg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAlgUndefined: Self = StObject.set(x, "contentAlg", js.undefined)
      
      @scala.inline
      def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFormat(value: general | compact | flattened): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setProtect(value: String | js.Array[String]): Self = StObject.set(x, "protect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectUndefined: Self = StObject.set(x, "protect", js.undefined)
      
      @scala.inline
      def setProtectVarargs(value: String*): Self = StObject.set(x, "protect", js.Array(value :_*))
      
      @scala.inline
      def setZip(value: Boolean | DEF): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  trait Exp extends StObject {
    
    var exp: Boolean | typings.nodeJose.mod.JWS.Exp
  }
  object Exp {
    
    @scala.inline
    def apply(exp: Boolean | typings.nodeJose.mod.JWS.Exp): Exp = {
      val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exp]
    }
    
    @scala.inline
    implicit class ExpMutableBuilder[Self <: Exp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExp(value: Boolean | typings.nodeJose.mod.JWS.Exp): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): PartialKeyStoreGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialKeyStoreGetOptions]
    }
    
    @scala.inline
    implicit class PartialKeyStoreGetOptionsMutableBuilder[Self <: PartialKeyStoreGetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
      
      @scala.inline
      def setUse(value: KeyUse): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
}
