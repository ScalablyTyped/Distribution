package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptedContentInfoMod {
  
  @JSImport("pkijs/src/EncryptedContentInfo", JSImport.Default)
  @js.native
  class default () extends EncryptedContentInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/EncryptedContentInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/EncryptedContentInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/EncryptedContentInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/EncryptedContentInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait EncryptedContentInfo extends StObject {
    
    var contentEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    var eContentType: String = js.native
    
    var encryptedContent: OctetString = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
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
