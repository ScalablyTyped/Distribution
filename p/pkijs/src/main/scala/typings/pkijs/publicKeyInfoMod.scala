package typings.pkijs

import typings.asn1js.mod.BitString
import typings.std.CryptoKey
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicKeyInfoMod {
  
  @JSImport("pkijs/src/PublicKeyInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PublicKeyInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var algorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    /* CompleteClass */
    override def fromJSON(json: JsonWebKey): Unit = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def importKey(publicKey: CryptoKey): js.Thenable[Unit] = js.native
    
    /* CompleteClass */
    var subjectPublicKey: BitString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PublicKeyInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PublicKeyInfo extends StObject {
    
    var algorithm: typings.pkijs.algorithmIdentifierMod.default
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit
    
    def fromSchema(schema: js.Any): Unit
    
    def importKey(publicKey: CryptoKey): js.Thenable[Unit]
    
    var parsedKey: js.UndefOr[typings.pkijs.ecpublickeyMod.default | typings.pkijs.rsapublickeyMod.default] = js.undefined
    
    var subjectPublicKey: BitString
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PublicKeyInfo {
    
    @scala.inline
    def apply(
      algorithm: typings.pkijs.algorithmIdentifierMod.default,
      fromJSON: JsonWebKey => Unit,
      fromSchema: js.Any => Unit,
      importKey: CryptoKey => js.Thenable[Unit],
      subjectPublicKey: BitString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PublicKeyInfo = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), importKey = js.Any.fromFunction1(importKey), subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PublicKeyInfo]
    }
    
    @scala.inline
    implicit class PublicKeyInfoMutableBuilder[Self <: PublicKeyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImportKey(value: CryptoKey => js.Thenable[Unit]): Self = StObject.set(x, "importKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParsedKey(value: typings.pkijs.ecpublickeyMod.default | typings.pkijs.rsapublickeyMod.default): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
      
      @scala.inline
      def setSubjectPublicKey(value: BitString): Self = StObject.set(x, "subjectPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
