package typings.nodeHtmlParser

import typings.nodeHtmlParser.anon.PartialOptions
import typings.nodeHtmlParser.distNodesHtmlMod.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseMod {
  
  @JSImport("node-html-parser/dist/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def default(data: String, options: PartialOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
