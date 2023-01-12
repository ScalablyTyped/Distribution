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
  inline def default(vnode: VNode[js.Object], context: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(vnode: VNode[js.Object], context: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def render(vnode: VNode[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(vnode: VNode[js.Object], context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(vnode: VNode[js.Object], context: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(vnode: VNode[js.Object], context: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def renderToString(vnode: VNode[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderToString(vnode: VNode[js.Object], context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def renderToString(vnode: VNode[js.Object], context: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def renderToString(vnode: VNode[js.Object], context: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def shallowRender(vnode: VNode[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowRender")(vnode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def shallowRender(vnode: VNode[js.Object], context: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowRender")(vnode.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var pretty: js.UndefOr[Boolean | String] = js.undefined
    
    var shallow: js.UndefOr[Boolean] = js.undefined
    
    var xml: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPretty(value: Boolean | String): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
      
      inline def setXml(value: Boolean): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
    }
  }
}
