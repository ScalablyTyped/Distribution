package typings.mdastUtilToMarkdown

import typings.mdast.mod.Image
import typings.mdastUtilToMarkdown.libTypesMod.Context
import typings.mdastUtilToMarkdown.libTypesMod.Parent
import typings.mdastUtilToMarkdown.libTypesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleImageMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def image(node: Image_, _underscore: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def image(node: Image_, _underscore: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def image(node: Image_, _underscore: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typings.mdastUtilToMarkdown.libTypesMod.Handle
  
  type Image_ = Image
}
