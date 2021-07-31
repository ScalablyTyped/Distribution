package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extKeyUsageMod {
  
  @JSImport("pkijs/src/ExtKeyUsage", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ExtKeyUsage {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var keyPurposes: js.Array[String] = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/ExtKeyUsage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait ExtKeyUsage extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var keyPurposes: js.Array[String]
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
