package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserPolicyCommonMod {
  
  object BrowserPolicy {
    
    object content {
      
      @JSImport("meteor/browser-policy-common", "BrowserPolicy.content")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def allowAllContentDataUrl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentDataUrl")().asInstanceOf[Unit]
      
      @scala.inline
      def allowAllContentOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentOrigin")().asInstanceOf[Unit]
      
      @scala.inline
      def allowAllContentSameOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentSameOrigin")().asInstanceOf[Unit]
      
      @scala.inline
      def allowContentTypeSniffing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowContentTypeSniffing")().asInstanceOf[Unit]
      
      @scala.inline
      def allowDataUrlForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDataUrlForAll")().asInstanceOf[Unit]
      
      @scala.inline
      def allowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowEval")().asInstanceOf[Unit]
      
      @scala.inline
      def allowFontOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFontOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def allowFrameOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFrameOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def allowImageOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowImageOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def allowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineScripts")().asInstanceOf[Unit]
      
      @scala.inline
      def allowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineStyles")().asInstanceOf[Unit]
      
      @scala.inline
      def allowMediaOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowMediaOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def allowOriginForAll(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowOriginForAll")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def allowSameOriginForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowSameOriginForAll")().asInstanceOf[Unit]
      
      @scala.inline
      def allowScriptOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowScriptOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def allowStyleOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStyleOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def disallowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAll")().asInstanceOf[Unit]
      
      @scala.inline
      def disallowAllContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAllContent")().asInstanceOf[Unit]
      
      @scala.inline
      def disallowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowEval")().asInstanceOf[Unit]
      
      @scala.inline
      def disallowFont(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowFont")().asInstanceOf[Unit]
      
      @scala.inline
      def disallowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineScripts")().asInstanceOf[Unit]
      
      @scala.inline
      def disallowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineStyles")().asInstanceOf[Unit]
      
      @scala.inline
      def disallowObject(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowObject")().asInstanceOf[Unit]
    }
    
    object framing {
      
      @JSImport("meteor/browser-policy-common", "BrowserPolicy.framing")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def allowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAll")().asInstanceOf[Unit]
      
      @scala.inline
      def disallow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallow")().asInstanceOf[Unit]
      
      @scala.inline
      def restrictToOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictToOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
}
