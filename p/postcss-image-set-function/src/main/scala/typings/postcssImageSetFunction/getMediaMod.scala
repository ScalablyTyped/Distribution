package typings.postcssImageSetFunction

import typings.postcssImageSetFunction.postcssImageSetFunctionBooleans.`false`
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMediaMod {
  
  @JSImport("postcss-image-set-function/dist/lib/get-media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMedia(dpi: Double, postcss: Any, decl: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMedia")(dpi.asInstanceOf[js.Any], postcss.asInstanceOf[js.Any], decl.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMediaDPI(node: Node): Double | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("getMediaDPI")(node.asInstanceOf[js.Any]).asInstanceOf[Double | `false`]
  
  inline def getMedia_false(dpi: `false`, postcss: Any, decl: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMedia")(dpi.asInstanceOf[js.Any], postcss.asInstanceOf[js.Any], decl.asInstanceOf[js.Any])).asInstanceOf[Any]
}
