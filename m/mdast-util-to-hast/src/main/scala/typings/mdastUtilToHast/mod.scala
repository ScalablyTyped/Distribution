package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Parent
import typings.mdastUtilToHast.libMod.HastNode
import typings.mdastUtilToHast.traverseMod.MdastNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-to-hast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(h: typings.mdastUtilToHast.traverseMod.H, parent: MdastNode): js.Array[ElementContent] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(h.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementContent]]
  
  inline def one(h: typings.mdastUtilToHast.libMod.H, node: MdastNode): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  inline def one(h: typings.mdastUtilToHast.libMod.H, node: MdastNode, parent: Parent): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  inline def toHast(tree: typings.mdastUtilToHast.libMod.MdastNode): js.UndefOr[HastNode | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHast")(tree.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HastNode | Null]]
  inline def toHast(tree: typings.mdastUtilToHast.libMod.MdastNode, options: typings.mdastUtilToHast.libMod.Options): js.UndefOr[HastNode | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("toHast")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HastNode | Null]]
  
  type H = typings.mdastUtilToHast.libMod.H
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Handlers = typings.mdastUtilToHast.libMod.Handlers
  
  type Options = typings.mdastUtilToHast.libMod.Options
  
  type Raw = typings.mdastUtilToHast.complexTypesMod.Raw
}
