package typings.mobxReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobx-react/dist/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def copyStaticProperties(base: js.Object, target: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyStaticProperties")(base.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def newSymbol(name: String): js.Symbol | String = ^.asInstanceOf[js.Dynamic].applyDynamic("newSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[js.Symbol | String]
  
  @scala.inline
  def patch(target: js.Object, methodName: String, mixinMethod: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], mixinMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setHiddenProp(target: js.Object, prop: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHiddenProp")(target.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def shallowEqual(objA: js.Any, objB: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait Mixins extends StObject {
    
    var locks: Double
    
    var methods: js.Array[js.Function]
  }
  object Mixins {
    
    @scala.inline
    def apply(locks: Double, methods: js.Array[js.Function]): Mixins = {
      val __obj = js.Dynamic.literal(locks = locks.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mixins]
    }
    
    @scala.inline
    implicit class MixinsMutableBuilder[Self <: Mixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocks(value: Double): Self = StObject.set(x, "locks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethods(value: js.Array[js.Function]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: js.Function*): Self = StObject.set(x, "methods", js.Array(value :_*))
    }
  }
}
