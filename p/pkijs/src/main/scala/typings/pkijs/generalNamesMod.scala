package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalNamesMod {
  
  @JSImport("pkijs/src/GeneralNames", JSImport.Default)
  @js.native
  class default () extends GeneralNames {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/GeneralNames", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/GeneralNames", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/GeneralNames", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait GeneralNames extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var names: js.Array[typings.pkijs.generalNameMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object GeneralNames {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      names: js.Array[typings.pkijs.generalNameMod.default],
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): GeneralNames = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), names = names.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[GeneralNames]
    }
    
    @scala.inline
    implicit class GeneralNamesMutableBuilder[Self <: GeneralNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNames(value: js.Array[typings.pkijs.generalNameMod.default]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: typings.pkijs.generalNameMod.default*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
