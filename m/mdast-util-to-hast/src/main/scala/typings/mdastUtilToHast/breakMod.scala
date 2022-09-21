package typings.mdastUtilToHast

import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breakMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/break", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hardBreak(h: H, node: Break): js.Array[Element | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | Text]]
  
  type Break = typings.mdast.mod.Break
  
  type Element = typings.hast.mod.Element
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Text = typings.hast.mod.Text
}
