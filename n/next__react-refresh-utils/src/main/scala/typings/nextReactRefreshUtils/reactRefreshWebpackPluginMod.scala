package typings.nextReactRefreshUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactRefreshWebpackPluginMod {
  
  @JSImport("@next/react-refresh-utils/ReactRefreshWebpackPlugin", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ReactFreshWebpackPlugin {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  trait ReactFreshWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit
  }
  object ReactFreshWebpackPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): ReactFreshWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[ReactFreshWebpackPlugin]
    }
    
    @scala.inline
    implicit class ReactFreshWebpackPluginMutableBuilder[Self <: ReactFreshWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
}
