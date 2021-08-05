package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameConstraintsMod {
  
  @JSImport("pkijs/src/NameConstraints", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with NameConstraints {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/NameConstraints", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait NameConstraints extends StObject {
    
    var excludedSubtrees: js.UndefOr[js.Array[typings.pkijs.generalSubtreeMod.default]] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var permittedSubtrees: js.UndefOr[js.Array[typings.pkijs.generalSubtreeMod.default]] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object NameConstraints {
    
    inline def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): NameConstraints = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[NameConstraints]
    }
    
    extension [Self <: NameConstraints](x: Self) {
      
      inline def setExcludedSubtrees(value: js.Array[typings.pkijs.generalSubtreeMod.default]): Self = StObject.set(x, "excludedSubtrees", value.asInstanceOf[js.Any])
      
      inline def setExcludedSubtreesUndefined: Self = StObject.set(x, "excludedSubtrees", js.undefined)
      
      inline def setExcludedSubtreesVarargs(value: typings.pkijs.generalSubtreeMod.default*): Self = StObject.set(x, "excludedSubtrees", js.Array(value :_*))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setPermittedSubtrees(value: js.Array[typings.pkijs.generalSubtreeMod.default]): Self = StObject.set(x, "permittedSubtrees", value.asInstanceOf[js.Any])
      
      inline def setPermittedSubtreesUndefined: Self = StObject.set(x, "permittedSubtrees", js.undefined)
      
      inline def setPermittedSubtreesVarargs(value: typings.pkijs.generalSubtreeMod.default*): Self = StObject.set(x, "permittedSubtrees", js.Array(value :_*))
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
