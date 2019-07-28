package typings.opentracing.opentracingMod

import typings.opentracing.libReferenceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", "Reference")
@js.native
class Reference protected () extends default {
  def this(`type`: String, referencedContext: typings.opentracing.libSpanMod.default) = this()
  /**
    * Initialize a new Reference instance.
    *
    * @param {string} type - the Reference type constant (e.g.,
    *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
    * @param {SpanContext} referencedContext - the SpanContext being referred
    *        to. As a convenience, a Span instance may be passed in instead
    *        (in which case its .context() is used here).
    */
  def this(`type`: String, referencedContext: typings.opentracing.libSpanUnderscoreContextMod.default) = this()
}

