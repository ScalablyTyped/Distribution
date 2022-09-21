package typings.nodeHtmlParser

import org.scalablytyped.runtime.Shortcut
import typings.cssSelect.libTypesMod.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod extends Shortcut {
  
  @JSImport("node-html-parser/dist/matcher", JSImport.Default)
  @js.native
  val default: Adapter[typings.nodeHtmlParser.nodeMod.default, typings.nodeHtmlParser.htmlMod.default] = js.native
  
  type Predicate = js.Function1[
    /* node */ typings.nodeHtmlParser.nodeMod.default, 
    /* is node-html-parser.node-html-parser/dist/nodes/html.default */ Boolean
  ]
  
  type _To = Adapter[typings.nodeHtmlParser.nodeMod.default, typings.nodeHtmlParser.htmlMod.default]
  
  /* This means you don't have to write `default`, but can instead just say `matcherMod.foo` */
  override def _to: Adapter[typings.nodeHtmlParser.nodeMod.default, typings.nodeHtmlParser.htmlMod.default] = default
}
