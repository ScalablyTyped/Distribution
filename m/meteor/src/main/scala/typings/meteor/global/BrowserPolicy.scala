package typings.meteor.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BrowserPolicy")
@js.native
object BrowserPolicy extends js.Object {
  @js.native
  object content extends js.Object {
    def allowAllContentDataUrl(): Unit = js.native
    def allowAllContentOrigin(): Unit = js.native
    def allowAllContentSameOrigin(): Unit = js.native
    def allowConnectOrigin(origin: String): Unit = js.native
    def allowContentTypeSniffing(): Unit = js.native
    def allowDataUrlForAll(): Unit = js.native
    def allowEval(): Unit = js.native
    def allowFontOrigin(origin: String): Unit = js.native
    def allowFrameAncestorsOrigin(origin: String): Unit = js.native
    def allowFrameOrigin(origin: String): Unit = js.native
    def allowImageOrigin(origin: String): Unit = js.native
    def allowInlineScripts(): Unit = js.native
    def allowInlineStyles(): Unit = js.native
    def allowMediaOrigin(origin: String): Unit = js.native
    def allowObjectOrigin(origin: String): Unit = js.native
    def allowOriginForAll(origin: String): Unit = js.native
    def allowSameOriginForAll(): Unit = js.native
    def allowScriptOrigin(origin: String): Unit = js.native
    def allowStyleOrigin(origin: String): Unit = js.native
    def disallowAll(): Unit = js.native
    def disallowAllContent(): Unit = js.native
    def disallowConnect(): Unit = js.native
    def disallowEval(): Unit = js.native
    def disallowFont(): Unit = js.native
    def disallowInlineScripts(): Unit = js.native
    def disallowInlineStyles(): Unit = js.native
    def disallowObject(): Unit = js.native
  }
  
  @js.native
  object framing extends js.Object {
    def allowAll(): Unit = js.native
    def disallow(): Unit = js.native
    def restrictToOrigin(origin: String): Unit = js.native
  }
  
}

