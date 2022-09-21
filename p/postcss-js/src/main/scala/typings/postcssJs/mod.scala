package typings.postcssJs

import typings.postcss.mod.AcceptedPlugin
import typings.postcss.mod.LazyResult
import typings.postcss.mod.Root_
import typings.postcss.noWorkResultMod.default
import typings.postcssJs.anon.OmitProcessOptionsparserp
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postcss-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def async(plugins: js.Array[AcceptedPlugin]): js.Function1[/* input */ CssInJs, js.Promise[CssInJs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(plugins.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ CssInJs, js.Promise[CssInJs]]]
  
  inline def objectify(root: Root_): CssInJs = ^.asInstanceOf[js.Dynamic].applyDynamic("objectify")(root.asInstanceOf[js.Any]).asInstanceOf[CssInJs]
  
  inline def parse(obj: CssInJs): Root_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(obj.asInstanceOf[js.Any]).asInstanceOf[Root_]
  
  inline def sync(plugins: js.Array[AcceptedPlugin]): js.Function1[/* input */ CssInJs, CssInJs] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(plugins.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ CssInJs, CssInJs]]
  
  type CssInJs = Record[String, Any]
  
  // Override process method to allow passing CssInJs
  // when the parser is the postcss-js parser.
  // This lets the postcss-js parser be used
  // as long as the object passed to `process` is a CSS-in-JS object
  object postcssLibProcessorAugmentingMod {
    
    trait Processor extends StObject {
      
      def process(obj: CssInJs, opts: OmitProcessOptionsparserp): LazyResult | default
    }
    object Processor {
      
      inline def apply(process: (CssInJs, OmitProcessOptionsparserp) => LazyResult | default): Processor = {
        val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
        __obj.asInstanceOf[Processor]
      }
      
      extension [Self <: Processor](x: Self) {
        
        inline def setProcess(value: (CssInJs, OmitProcessOptionsparserp) => LazyResult | default): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      }
    }
  }
}
