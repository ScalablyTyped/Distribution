package typings.mdastUtilToHast

import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revertMod {
  
  @JSImport("mdast-util-to-hast/lib/revert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def revert(h: H, node: ImageReference): Content | js.Array[Content] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Content | js.Array[Content]]
  inline def revert(h: H, node: LinkReference): Content | js.Array[Content] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Content | js.Array[Content]]
  
  type Content = typings.mdastUtilToHast.libMod.Content
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type ImageReference = typings.mdast.mod.ImageReference
  
  type LinkReference = typings.mdast.mod.LinkReference
}
