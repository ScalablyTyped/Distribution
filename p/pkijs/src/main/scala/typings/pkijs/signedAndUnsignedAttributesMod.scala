package typings.pkijs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedAndUnsignedAttributesMod {
  
  @JSImport("pkijs/src/SignedAndUnsignedAttributes", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with SignedAndUnsignedAttributes {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var attributes: js.Array[typings.pkijs.attributeMod.default] = js.native
    
    /* CompleteClass */
    var encodedValue: ArrayBuffer = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/SignedAndUnsignedAttributes", JSImport.Default)
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
  
  trait SignedAndUnsignedAttributes extends StObject {
    
    var attributes: js.Array[typings.pkijs.attributeMod.default]
    
    var encodedValue: ArrayBuffer
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var `type`: String
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
