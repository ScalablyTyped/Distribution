package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherRevocationInfoFormatMod {
  
  @JSImport("pkijs/src/OtherRevocationInfoFormat", JSImport.Default)
  @js.native
  class default () extends OtherRevocationInfoFormat {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OtherRevocationInfoFormat", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OtherRevocationInfoFormat", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OtherRevocationInfoFormat", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OtherRevocationInfoFormat extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var otherRevInfo: js.Any = js.native
    
    var otherRevInfoFormat: String = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object OtherRevocationInfoFormat {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      otherRevInfo: js.Any,
      otherRevInfoFormat: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OtherRevocationInfoFormat = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherRevInfo = otherRevInfo.asInstanceOf[js.Any], otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OtherRevocationInfoFormat]
    }
    
    @scala.inline
    implicit class OtherRevocationInfoFormatMutableBuilder[Self <: OtherRevocationInfoFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOtherRevInfo(value: js.Any): Self = StObject.set(x, "otherRevInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherRevInfoFormat(value: String): Self = StObject.set(x, "otherRevInfoFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
