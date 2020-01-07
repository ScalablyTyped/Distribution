package typings.ol.rendererWebglLayerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebGLWorkerMessageType extends js.Object

@JSImport("ol/renderer/webgl/Layer", "WebGLWorkerMessageType")
@js.native
object WebGLWorkerMessageType extends js.Object {
  @js.native
  sealed trait GENERATE_BUFFERS extends WebGLWorkerMessageType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebGLWorkerMessageType with String] = js.native
  /* "GENERATE_BUFFERS" */ @js.native
  object GENERATE_BUFFERS extends TopLevel[GENERATE_BUFFERS with String]
  
}

