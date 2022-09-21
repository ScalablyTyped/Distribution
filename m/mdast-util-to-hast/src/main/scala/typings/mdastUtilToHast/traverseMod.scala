package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Parent
import typings.mdast.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traverseMod {
  
  @JSImport("mdast-util-to-hast/lib/traverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(h: H, parent: MdastNode): js.Array[ElementContent] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(h.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementContent]]
  
  inline def one(h: typings.mdastUtilToHast.libMod.H, node: MdastNode): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  inline def one(h: typings.mdastUtilToHast.libMod.H, node: MdastNode, parent: Parent): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Content = typings.mdastUtilToHast.libMod.Content
  
  type H = typings.mdastUtilToHast.libMod.H
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type MdastNode = Root | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<mdast.mdast.Content>[number] */ js.Any)
}
