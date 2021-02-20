package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extKeyUsageMod {
  
  @JSImport("pkijs/src/ExtKeyUsage", JSImport.Default)
  @js.native
  class default () extends ExtKeyUsage {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/ExtKeyUsage", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/ExtKeyUsage", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/ExtKeyUsage", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ExtKeyUsage extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyPurposes: js.Array[String] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object ExtKeyUsage {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      keyPurposes: js.Array[String],
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): ExtKeyUsage = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyPurposes = keyPurposes.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[ExtKeyUsage]
    }
    
    @scala.inline
    implicit class ExtKeyUsageMutableBuilder[Self <: ExtKeyUsage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyPurposes(value: js.Array[String]): Self = StObject.set(x, "keyPurposes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPurposesVarargs(value: String*): Self = StObject.set(x, "keyPurposes", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
