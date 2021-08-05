package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  @JSImport("polished/lib/shorthands/animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: ((js.Array[String | Double]) | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
