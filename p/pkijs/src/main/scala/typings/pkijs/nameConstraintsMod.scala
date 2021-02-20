package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameConstraintsMod {
  
  @JSImport("pkijs/src/NameConstraints", JSImport.Default)
  @js.native
  class default () extends NameConstraints {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/NameConstraints", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/NameConstraints", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/NameConstraints", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait NameConstraints extends StObject {
    
    var excludedSubtrees: js.UndefOr[js.Array[typings.pkijs.generalSubtreeMod.default]] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var permittedSubtrees: js.UndefOr[js.Array[typings.pkijs.generalSubtreeMod.default]] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object NameConstraints {
    
    @scala.inline
    def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): NameConstraints = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[NameConstraints]
    }
    
    @scala.inline
    implicit class NameConstraintsMutableBuilder[Self <: NameConstraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludedSubtrees(value: js.Array[typings.pkijs.generalSubtreeMod.default]): Self = StObject.set(x, "excludedSubtrees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedSubtreesUndefined: Self = StObject.set(x, "excludedSubtrees", js.undefined)
      
      @scala.inline
      def setExcludedSubtreesVarargs(value: typings.pkijs.generalSubtreeMod.default*): Self = StObject.set(x, "excludedSubtrees", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPermittedSubtrees(value: js.Array[typings.pkijs.generalSubtreeMod.default]): Self = StObject.set(x, "permittedSubtrees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermittedSubtreesUndefined: Self = StObject.set(x, "permittedSubtrees", js.undefined)
      
      @scala.inline
      def setPermittedSubtreesVarargs(value: typings.pkijs.generalSubtreeMod.default*): Self = StObject.set(x, "permittedSubtrees", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
