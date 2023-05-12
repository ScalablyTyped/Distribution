package typings.postcssCustomMedia

import typings.postcss.mod.Result
import typings.postcss.mod.Root_
import typings.postcssCustomMedia.anon.Falsy
import typings.postcssCustomMedia.anon.Preserve
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCustomMediaFromRootMod {
  
  @JSImport("postcss-custom-media/dist/custom-media-from-root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(root: Root_, result: Result, opts: Preserve): Map[String, Falsy] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any], result.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Map[String, Falsy]]
}
