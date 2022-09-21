package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Table
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def table(h: H, node: Table_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Content = typings.mdastUtilToHast.libMod.Content
  
  type Element = typings.hast.mod.Element
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Table_ = Table
}
