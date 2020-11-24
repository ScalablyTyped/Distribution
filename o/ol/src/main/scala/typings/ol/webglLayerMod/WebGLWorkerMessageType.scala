package typings.ol.webglLayerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebGLWorkerMessageType extends js.Object
@JSImport("ol/renderer/webgl/Layer", "WebGLWorkerMessageType")
@js.native
object WebGLWorkerMessageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebGLWorkerMessageType with String] = js.native
  
  @js.native
  sealed trait GENERATE_BUFFERS extends WebGLWorkerMessageType
  /* "GENERATE_BUFFERS" */ @js.native
  object GENERATE_BUFFERS extends TopLevel[GENERATE_BUFFERS with String]
}
