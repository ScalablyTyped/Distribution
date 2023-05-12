package typings.postcssJs

import typings.postcss.mod.AcceptedPlugin
import typings.postcss.mod.LazyResult
import typings.postcss.mod.Root_
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
  
  // Override process method to allow passing CssInJs
  // when the parser is the postcss-js parser.
  // This lets the postcss-js parser be used
  // as long as the object passed to `process` is a CSS-in-JS object
  /* augmented module */
  object postcssLibProcessorAugmentingMod {
    
    @JSImport("postcss/lib/processor", "Processor_")
    @js.native
    open class Processor () extends StObject {
      
      def process(obj: CssInJs, opts: OmitProcessOptionsparserp): LazyResult | typings.postcss.libNoWorkResultMod.^ = js.native
    }
  }
  
  inline def sync(plugins: js.Array[AcceptedPlugin]): js.Function1[/* input */ CssInJs, CssInJs] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(plugins.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ CssInJs, CssInJs]]
  
  type CssInJs = Record[String, Any]
}
