package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaesoaepparamsMod {
  
  @JSImport("pkijs/src/RSAESOAEPParams", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RSAESOAEPParams {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    var pSourceAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RSAESOAEPParams", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait RSAESOAEPParams extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    var pSourceAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object RSAESOAEPParams {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      pSourceAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RSAESOAEPParams = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], pSourceAlgorithm = pSourceAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RSAESOAEPParams]
    }
    
    @scala.inline
    implicit class RSAESOAEPParamsMutableBuilder[Self <: RSAESOAEPParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskGenAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPSourceAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "pSourceAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
