package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalNameMod {
  
  @JSImport("pkijs/src/GeneralName", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with GeneralName {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /**
      * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
      *
      * @type {number}
      * @memberOf GeneralName
      */
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * asn1js object having GENERAL_NAME value (type depends on "type" value)
      *
      * @type {*}
      * @memberOf GeneralName
      */
    /* CompleteClass */
    var value: js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/GeneralName", JSImport.Default)
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
  
  trait GeneralName extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    /**
      * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
      *
      * @type {number}
      * @memberOf GeneralName
      */
    var `type`: Double
    
    /**
      * asn1js object having GENERAL_NAME value (type depends on "type" value)
      *
      * @type {*}
      * @memberOf GeneralName
      */
    var value: js.Any
  }
  object GeneralName {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      `type`: Double,
      value: js.Any
    ): GeneralName = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralName]
    }
    
    @scala.inline
    implicit class GeneralNameMutableBuilder[Self <: GeneralName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
