package typings.opentracing.referenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/reference", JSImport.Default)
@js.native
class default protected () extends Reference {
  /**
    * Initialize a new Reference instance.
    *
    * @param {string} type - the Reference type constant (e.g.,
    *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
    * @param {SpanContext} referencedContext - the SpanContext being referred
    *        to. As a convenience, a Span instance may be passed in instead
    *        (in which case its .context() is used here).
    */
  def this(`type`: String, referencedContext: typings.opentracing.spanContextMod.default) = this()
  def this(`type`: String, referencedContext: typings.opentracing.spanMod.default) = this()
}
