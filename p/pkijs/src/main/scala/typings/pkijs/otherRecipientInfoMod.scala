package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherRecipientInfoMod {
  
  @JSImport("pkijs/src/OtherRecipientInfo", JSImport.Default)
  @js.native
  class default () extends OtherRecipientInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/OtherRecipientInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/OtherRecipientInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OtherRecipientInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OtherRecipientInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OtherRecipientInfo extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var oriType: String = js.native
    
    var oriValue: js.Any = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object OtherRecipientInfo {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      oriType: String,
      oriValue: js.Any,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OtherRecipientInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), oriType = oriType.asInstanceOf[js.Any], oriValue = oriValue.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OtherRecipientInfo]
    }
    
    @scala.inline
    implicit class OtherRecipientInfoMutableBuilder[Self <: OtherRecipientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOriType(value: String): Self = StObject.set(x, "oriType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriValue(value: js.Any): Self = StObject.set(x, "oriValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
