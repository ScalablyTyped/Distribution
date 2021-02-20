package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherKeyAttributeMod {
  
  @JSImport("pkijs/src/OtherKeyAttribute", JSImport.Default)
  @js.native
  class default () extends OtherKeyAttribute {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/OtherKeyAttribute", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/OtherKeyAttribute", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OtherKeyAttribute", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OtherKeyAttribute", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OtherKeyAttribute extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyAttr: js.Any = js.native
    
    var keyAttrId: String = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object OtherKeyAttribute {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      keyAttr: js.Any,
      keyAttrId: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OtherKeyAttribute = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyAttr = keyAttr.asInstanceOf[js.Any], keyAttrId = keyAttrId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OtherKeyAttribute]
    }
    
    @scala.inline
    implicit class OtherKeyAttributeMutableBuilder[Self <: OtherKeyAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyAttr(value: js.Any): Self = StObject.set(x, "keyAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyAttrId(value: String): Self = StObject.set(x, "keyAttrId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
