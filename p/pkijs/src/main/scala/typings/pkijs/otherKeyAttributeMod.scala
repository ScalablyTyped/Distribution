package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherKeyAttributeMod {
  
  @JSImport("pkijs/src/OtherKeyAttribute", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with OtherKeyAttribute {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var keyAttr: js.Any = js.native
    
    /* CompleteClass */
    var keyAttrId: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OtherKeyAttribute", JSImport.Default)
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
  
  trait OtherKeyAttribute extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var keyAttr: js.Any
    
    var keyAttrId: String
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
