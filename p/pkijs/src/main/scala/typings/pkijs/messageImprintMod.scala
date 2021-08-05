package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageImprintMod {
  
  @JSImport("pkijs/src/MessageImprint", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with MessageImprint {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    var hashedMessage: OctetString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/MessageImprint", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    inline def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait MessageImprint extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    var hashedMessage: OctetString
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object MessageImprint {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      hashedMessage: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): MessageImprint = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], hashedMessage = hashedMessage.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[MessageImprint]
    }
    
    extension [Self <: MessageImprint](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashedMessage(value: OctetString): Self = StObject.set(x, "hashedMessage", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
