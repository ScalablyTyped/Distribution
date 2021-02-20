package typings.mobxReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobx-react/dist/utils/utils", "copyStaticProperties")
  @js.native
  def copyStaticProperties(base: js.Object, target: js.Object): Unit = js.native
  
  @JSImport("mobx-react/dist/utils/utils", "newSymbol")
  @js.native
  def newSymbol(name: String): js.Symbol | String = js.native
  
  @JSImport("mobx-react/dist/utils/utils", "patch")
  @js.native
  def patch(target: js.Object, methodName: String, mixinMethod: js.Function): Unit = js.native
  
  @JSImport("mobx-react/dist/utils/utils", "setHiddenProp")
  @js.native
  def setHiddenProp(target: js.Object, prop: js.Any, value: js.Any): Unit = js.native
  
  @JSImport("mobx-react/dist/utils/utils", "shallowEqual")
  @js.native
  def shallowEqual(objA: js.Any, objB: js.Any): Boolean = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait Mixins extends StObject {
    
    var locks: Double = js.native
    
    var methods: js.Array[js.Function] = js.native
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
