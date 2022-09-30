package typings.meteor.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BrowserPolicy {
  
  object content {
    
    @JSGlobal("BrowserPolicy.content")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allowAllContentDataUrl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentDataUrl")().asInstanceOf[Unit]
    
    inline def allowAllContentOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentOrigin")().asInstanceOf[Unit]
    
    inline def allowAllContentSameOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentSameOrigin")().asInstanceOf[Unit]
    
    inline def allowConnectOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowConnectOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowContentTypeSniffing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowContentTypeSniffing")().asInstanceOf[Unit]
    
    inline def allowDataUrlForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDataUrlForAll")().asInstanceOf[Unit]
    
    inline def allowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowEval")().asInstanceOf[Unit]
    
    inline def allowFontOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFontOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowFrameAncestorsOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFrameAncestorsOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowFrameOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFrameOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowImageOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowImageOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineScripts")().asInstanceOf[Unit]
    
    inline def allowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineStyles")().asInstanceOf[Unit]
    
    inline def allowMediaOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowMediaOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowObjectOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowObjectOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowOriginForAll(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowOriginForAll")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowSameOriginForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowSameOriginForAll")().asInstanceOf[Unit]
    
    inline def allowScriptOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowScriptOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def allowStyleOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStyleOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def disallowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAll")().asInstanceOf[Unit]
    
    inline def disallowAllContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAllContent")().asInstanceOf[Unit]
    
    inline def disallowConnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowConnect")().asInstanceOf[Unit]
    
    inline def disallowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowEval")().asInstanceOf[Unit]
    
    inline def disallowFont(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowFont")().asInstanceOf[Unit]
    
    inline def disallowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineScripts")().asInstanceOf[Unit]
    
    inline def disallowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineStyles")().asInstanceOf[Unit]
    
    inline def disallowObject(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowObject")().asInstanceOf[Unit]
  }
  
  object framing {
    
    @JSGlobal("BrowserPolicy.framing")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAll")().asInstanceOf[Unit]
    
    inline def disallow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallow")().asInstanceOf[Unit]
    
    inline def restrictToOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictToOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
