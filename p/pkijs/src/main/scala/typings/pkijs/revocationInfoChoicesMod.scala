package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revocationInfoChoicesMod {
  
  @JSImport("pkijs/src/RevocationInfoChoices", JSImport.Default)
  @js.native
  class default () extends RevocationInfoChoices {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RevocationInfoChoices", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/RevocationInfoChoices", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/RevocationInfoChoices", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait RevocationInfoChoices extends StObject {
    
    var crls: js.Array[typings.pkijs.certificateRevocationListMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object RevocationInfoChoices {
    
    @scala.inline
    def apply(
      crls: js.Array[typings.pkijs.certificateRevocationListMod.default],
      fromSchema: js.Any => Unit,
      otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default],
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): RevocationInfoChoices = {
      val __obj = js.Dynamic.literal(crls = crls.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), otherRevocationInfos = otherRevocationInfos.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[RevocationInfoChoices]
    }
    
    @scala.inline
    implicit class RevocationInfoChoicesMutableBuilder[Self <: RevocationInfoChoices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrls(value: js.Array[typings.pkijs.certificateRevocationListMod.default]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlsVarargs(value: typings.pkijs.certificateRevocationListMod.default*): Self = StObject.set(x, "crls", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOtherRevocationInfos(value: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default]): Self = StObject.set(x, "otherRevocationInfos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherRevocationInfosVarargs(value: typings.pkijs.otherRevocationInfoFormatMod.default*): Self = StObject.set(x, "otherRevocationInfos", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
