package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicConstraintsMod {
  
  @JSImport("pkijs/src/BasicConstraints", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with BasicConstraints {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var cA: Boolean = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var pathLenConstraint: Double | Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/BasicConstraints", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait BasicConstraints extends StObject {
    
    var cA: Boolean
    
    def fromSchema(schema: js.Any): Unit
    
    var pathLenConstraint: Double | Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object BasicConstraints {
    
    inline def apply(
      cA: Boolean,
      fromSchema: js.Any => Unit,
      pathLenConstraint: Double | Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): BasicConstraints = {
      val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[BasicConstraints]
    }
    
    extension [Self <: BasicConstraints](x: Self) {
      
      inline def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setPathLenConstraint(value: Double | Integer): Self = StObject.set(x, "pathLenConstraint", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
