package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicConstraintsMod {
  
  @JSImport("pkijs/src/BasicConstraints", JSImport.Default)
  @js.native
  class default () extends BasicConstraints {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/BasicConstraints", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/BasicConstraints", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/BasicConstraints", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait BasicConstraints extends StObject {
    
    var cA: Boolean = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var pathLenConstraint: Double | Integer = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object BasicConstraints {
    
    @scala.inline
    def apply(
      cA: Boolean,
      fromSchema: js.Any => Unit,
      pathLenConstraint: Double | Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): BasicConstraints = {
      val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[BasicConstraints]
    }
    
    @scala.inline
    implicit class BasicConstraintsMutableBuilder[Self <: BasicConstraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPathLenConstraint(value: Double | Integer): Self = StObject.set(x, "pathLenConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
