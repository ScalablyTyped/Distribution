package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object altNameMod {
  
  @JSImport("pkijs/src/AltName", JSImport.Default)
  @js.native
  class default () extends AltName {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AltName", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/AltName", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/AltName", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait AltName extends StObject {
    
    var altNames: js.Array[typings.pkijs.generalNameMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
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
