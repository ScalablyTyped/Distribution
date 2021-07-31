package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptedContentInfoMod {
  
  @JSImport("pkijs/src/EncryptedContentInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with EncryptedContentInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var contentEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    var eContentType: String = js.native
    
    /* CompleteClass */
    var encryptedContent: OctetString = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/EncryptedContentInfo", JSImport.Default)
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
  
  trait EncryptedContentInfo extends StObject {
    
    var contentEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    var eContentType: String
    
    var encryptedContent: OctetString
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object EncryptedContentInfo {
    
    @scala.inline
    def apply(
      contentEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      eContentType: String,
      encryptedContent: OctetString,
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): EncryptedContentInfo = {
      val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], eContentType = eContentType.asInstanceOf[js.Any], encryptedContent = encryptedContent.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[EncryptedContentInfo]
    }
    
    @scala.inline
    implicit class EncryptedContentInfoMutableBuilder[Self <: EncryptedContentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEContentType(value: String): Self = StObject.set(x, "eContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedContent(value: OctetString): Self = StObject.set(x, "encryptedContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
