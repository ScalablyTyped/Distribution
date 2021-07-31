package typings.pkijs

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originatorPublicKeyMod {
  
  @JSImport("pkijs/src/OriginatorPublicKey", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with OriginatorPublicKey {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var algorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var publicKey: BitString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OriginatorPublicKey", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait OriginatorPublicKey extends StObject {
    
    var algorithm: typings.pkijs.algorithmIdentifierMod.default
    
    def fromSchema(schema: js.Any): Unit
    
    var publicKey: BitString
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object OriginatorPublicKey {
    
    @scala.inline
    def apply(
      algorithm: typings.pkijs.algorithmIdentifierMod.default,
      fromSchema: js.Any => Unit,
      publicKey: BitString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OriginatorPublicKey = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OriginatorPublicKey]
    }
    
    @scala.inline
    implicit class OriginatorPublicKeyMutableBuilder[Self <: OriginatorPublicKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPublicKey(value: BitString): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
