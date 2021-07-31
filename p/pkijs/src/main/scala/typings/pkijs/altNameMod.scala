package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object altNameMod {
  
  @JSImport("pkijs/src/AltName", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AltName {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var altNames: js.Array[typings.pkijs.generalNameMod.default] = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AltName", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait AltName extends StObject {
    
    var altNames: js.Array[typings.pkijs.generalNameMod.default]
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object AltName {
    
    @scala.inline
    def apply(
      altNames: js.Array[typings.pkijs.generalNameMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): AltName = {
      val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[AltName]
    }
    
    @scala.inline
    implicit class AltNameMutableBuilder[Self <: AltName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltNames(value: js.Array[typings.pkijs.generalNameMod.default]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltNamesVarargs(value: typings.pkijs.generalNameMod.default*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
