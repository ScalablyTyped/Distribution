package typings.nodeHtmlParser

import typings.nodeHtmlParser.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distValidMod {
  
  @JSImport("node-html-parser/dist/valid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(data: String, options: PartialOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
