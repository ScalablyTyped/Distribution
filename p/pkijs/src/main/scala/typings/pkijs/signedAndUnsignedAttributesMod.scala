package typings.pkijs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedAndUnsignedAttributesMod {
  
  @JSImport("pkijs/src/SignedAndUnsignedAttributes", JSImport.Default)
  @js.native
  class default () extends SignedAndUnsignedAttributes {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/SignedAndUnsignedAttributes", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/SignedAndUnsignedAttributes", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/SignedAndUnsignedAttributes", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/SignedAndUnsignedAttributes", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait SignedAndUnsignedAttributes extends StObject {
    
    var attributes: js.Array[typings.pkijs.attributeMod.default] = js.native
    
    var encodedValue: ArrayBuffer = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var `type`: String = js.native
  }
  object SignedAndUnsignedAttributes {
    
    @scala.inline
    def apply(
      attributes: js.Array[typings.pkijs.attributeMod.default],
      encodedValue: ArrayBuffer,
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      `type`: String
    ): SignedAndUnsignedAttributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], encodedValue = encodedValue.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedAndUnsignedAttributes]
    }
    
    @scala.inline
    implicit class SignedAndUnsignedAttributesMutableBuilder[Self <: SignedAndUnsignedAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[typings.pkijs.attributeMod.default]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: typings.pkijs.attributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setEncodedValue(value: ArrayBuffer): Self = StObject.set(x, "encodedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
