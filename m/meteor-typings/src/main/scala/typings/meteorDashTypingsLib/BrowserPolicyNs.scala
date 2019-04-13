package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BrowserPolicy")
@js.native
object BrowserPolicyNs extends js.Object {
  @js.native
  object content extends js.Object {
    def allowAllContentDataUrl(): scala.Unit = js.native
    def allowAllContentOrigin(): scala.Unit = js.native
    def allowAllContentSameOrigin(): scala.Unit = js.native
    def allowContentTypeSniffing(): scala.Unit = js.native
    def allowDataUrlForAll(): scala.Unit = js.native
    def allowEval(): scala.Unit = js.native
    def allowFontOrigin(origin: java.lang.String): scala.Unit = js.native
    def allowFrameOrigin(origin: java.lang.String): scala.Unit = js.native
    def allowImageOrigin(origin: java.lang.String): scala.Unit = js.native
    def allowInlineScripts(): scala.Unit = js.native
    def allowInlineStyles(): scala.Unit = js.native
    def allowMediaOrigin(origin: java.lang.String): scala.Unit = js.native
    def allowOriginForAll(origin: java.lang.String): scala.Unit = js.native
    def allowSameOriginForAll(): scala.Unit = js.native
    def allowScriptOrigin(origin: java.lang.String): scala.Unit = js.native
    def allowStyleOrigin(origin: java.lang.String): scala.Unit = js.native
    def disallowAll(): scala.Unit = js.native
    def disallowAllContent(): scala.Unit = js.native
    def disallowEval(): scala.Unit = js.native
    def disallowFont(): scala.Unit = js.native
    def disallowInlineScripts(): scala.Unit = js.native
    def disallowInlineStyles(): scala.Unit = js.native
    def disallowObject(): scala.Unit = js.native
  }
  
  @js.native
  object framing extends js.Object {
    def allowAll(): scala.Unit = js.native
    def disallow(): scala.Unit = js.native
    def restrictToOrigin(origin: java.lang.String): scala.Unit = js.native
  }
  
}

