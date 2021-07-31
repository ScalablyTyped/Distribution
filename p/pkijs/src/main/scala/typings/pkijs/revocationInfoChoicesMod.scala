package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revocationInfoChoicesMod {
  
  @JSImport("pkijs/src/RevocationInfoChoices", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RevocationInfoChoices {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var crls: js.Array[typings.pkijs.certificateRevocationListMod.default] = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default] = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RevocationInfoChoices", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait RevocationInfoChoices extends StObject {
    
    var crls: js.Array[typings.pkijs.certificateRevocationListMod.default]
    
    def fromSchema(schema: js.Any): Unit
    
    var otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default]
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
