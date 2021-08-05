package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherRevocationInfoFormatMod {
  
  @JSImport("pkijs/src/OtherRevocationInfoFormat", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with OtherRevocationInfoFormat {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var otherRevInfo: js.Any = js.native
    
    /* CompleteClass */
    var otherRevInfoFormat: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OtherRevocationInfoFormat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait OtherRevocationInfoFormat extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var otherRevInfo: js.Any
    
    var otherRevInfoFormat: String
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object OtherRevocationInfoFormat {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      otherRevInfo: js.Any,
      otherRevInfoFormat: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OtherRevocationInfoFormat = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherRevInfo = otherRevInfo.asInstanceOf[js.Any], otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OtherRevocationInfoFormat]
    }
    
    extension [Self <: OtherRevocationInfoFormat](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setOtherRevInfo(value: js.Any): Self = StObject.set(x, "otherRevInfo", value.asInstanceOf[js.Any])
      
      inline def setOtherRevInfoFormat(value: String): Self = StObject.set(x, "otherRevInfoFormat", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
