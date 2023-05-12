package typings.preactRenderToString

import typings.preact.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("preact-render-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(vnode: VNode[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(vnode: VNode[js.Object], context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def render(vnode: VNode[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(vnode: VNode[js.Object], context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def renderToStaticMarkup(vnode: VNode[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticMarkup")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderToStaticMarkup(vnode: VNode[js.Object], context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticMarkup")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def renderToString(vnode: VNode[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderToString(vnode: VNode[js.Object], context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
}
