package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encapsulatedContentInfoMod {
  
  @JSImport("pkijs/src/EncapsulatedContentInfo", JSImport.Default)
  @js.native
  class default () extends EncapsulatedContentInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/EncapsulatedContentInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/EncapsulatedContentInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/EncapsulatedContentInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/EncapsulatedContentInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait EncapsulatedContentInfo extends StObject {
    
    var eContent: OctetString = js.native
    
    var eContentType: String = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object EncapsulatedContentInfo {
    
    @scala.inline
    def apply(
      eContent: OctetString,
      eContentType: String,
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): EncapsulatedContentInfo = {
      val __obj = js.Dynamic.literal(eContent = eContent.asInstanceOf[js.Any], eContentType = eContentType.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[EncapsulatedContentInfo]
    }
    
    @scala.inline
    implicit class EncapsulatedContentInfoMutableBuilder[Self <: EncapsulatedContentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEContent(value: OctetString): Self = StObject.set(x, "eContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEContentType(value: String): Self = StObject.set(x, "eContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
