package typings
package olLib.renderEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @param type Type.
     * @param opt_vectorContext Vector context.
     * @param opt_frameState Frame state.
     * @param opt_context Context.
     * @param opt_glContext WebGL Context.
     */
@JSImport("ol/render/event", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.renderNs.Event {
  /**
           * @param type Type.
           * @param opt_vectorContext Vector context.
           * @param opt_frameState Frame state.
           * @param opt_context Context.
           * @param opt_glContext WebGL Context.
           */
  def this(`type`: openlayersLib.openlayersMod.renderNs.EventType) = this()
  /**
           * @param type Type.
           * @param opt_vectorContext Vector context.
           * @param opt_frameState Frame state.
           * @param opt_context Context.
           * @param opt_glContext WebGL Context.
           */
  def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext) = this()
  /**
           * @param type Type.
           * @param opt_vectorContext Vector context.
           * @param opt_frameState Frame state.
           * @param opt_context Context.
           * @param opt_glContext WebGL Context.
           */
  def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
  /**
           * @param type Type.
           * @param opt_vectorContext Vector context.
           * @param opt_frameState Frame state.
           * @param opt_context Context.
           * @param opt_glContext WebGL Context.
           */
  def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState, opt_context: stdLib.CanvasRenderingContext2D) = this()
  /**
           * @param type Type.
           * @param opt_vectorContext Vector context.
           * @param opt_frameState Frame state.
           * @param opt_context Context.
           * @param opt_glContext WebGL Context.
           */
  def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState, opt_context: stdLib.CanvasRenderingContext2D, opt_glContext: js.Any) = this()
}

