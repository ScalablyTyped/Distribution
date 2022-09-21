package typings.prefreshWebpack

import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@prefresh/webpack", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PreactRefreshPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    var runsInNextJs: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setRunsInNextJs(value: Boolean): Self = StObject.set(x, "runsInNextJs", value.asInstanceOf[js.Any])
      
      inline def setRunsInNextJsUndefined: Self = StObject.set(x, "runsInNextJs", js.undefined)
    }
  }
  
  trait PreactRefreshPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object PreactRefreshPlugin {
    
    inline def apply(apply: Compiler => Unit): PreactRefreshPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[PreactRefreshPlugin]
    }
    
    extension [Self <: PreactRefreshPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
}
