package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Log tracing functionality, allowing for tracing of the internal functionality of the engine.
  * Note that the trace logging only takes place in the debug build of the engine and is stripped
  * out in other builds.
  */
@JSImport("playcanvas", "Tracing")
@js.native
open class Tracing () extends StObject
object Tracing {
  
  @JSImport("playcanvas", "Tracing")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Test if the trace channel is enabled.
    *
    * @param {string} channel - Name of the trace channel.
    * @returns {boolean} - True if the trace channel is enabled.
    */
  /* static member */
  inline def get(channel: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(channel.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Enable or disable a trace channel.
    *
    * @param {string} channel - Name of the trace channel. Can be:
    *
    * - {@link TRACEID_RENDER_FRAME}
    * - {@link TRACEID_RENDER_PASS}
    * - {@link TRACEID_RENDER_PASS_DETAIL}
    * - {@link TRACEID_RENDER_ACTION}
    * - {@link TRACEID_RENDER_TARGET_ALLOC}
    * - {@link TRACEID_TEXTURE_ALLOC}
    * - {@link TRACEID_SHADER_ALLOC}
    * - {@link TRACEID_SHADER_COMPILE}
    * - {@link TRACEID_VRAM_TEXTURE}
    * - {@link TRACEID_VRAM_VB}
    * - {@link TRACEID_VRAM_IB}
    *
    * @param {boolean} enabled - New enabled state for the channel.
    */
  /* static member */
  inline def set(channel: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(channel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(channel: String, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(channel.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Enable call stack logging for trace calls. Defaults to false.
    *
    * @type {boolean}
    */
  /* static member */
  @JSImport("playcanvas", "Tracing.stack")
  @js.native
  def stack: Boolean = js.native
  inline def stack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stack")(x.asInstanceOf[js.Any])
  
  /**
    * Set storing the names of enabled trace channels.
    *
    * @type {Set<string>}
    * @private
    */
  /* static member */
  @JSImport("playcanvas", "Tracing._traceChannels")
  @js.native
  def traceChannels: Any = js.native
  
  inline def traceChannels_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_traceChannels")(x.asInstanceOf[js.Any])
}
