package typings.mdastUtilToHast

import typings.mdast.mod.ThematicBreak
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thematicBreakMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/thematic-break", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def thematicBreak(h: H): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("thematicBreak")(h.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def thematicBreak(h: H, node: ThematicBreak): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("thematicBreak")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type Element = typings.hast.mod.Element
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type ThematicBreak_ = ThematicBreak
}
