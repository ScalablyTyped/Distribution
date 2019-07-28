package typings.opentracing.libReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var _referencedContext: typings.opentracing.libSpanUnderscoreContextMod.default
  var _type: String
  /**
    * @return {SpanContext} The SpanContext being referred to (e.g., the
    *         parent in a REFERENCE_CHILD_OF Reference).
    */
  def referencedContext(): typings.opentracing.libSpanUnderscoreContextMod.default
  /**
    * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
    *         REFERENCE_FOLLOWS_FROM).
    */
  def `type`(): String
}

object Reference {
  @scala.inline
  def apply(
    _referencedContext: typings.opentracing.libSpanUnderscoreContextMod.default,
    _type: String,
    referencedContext: () => typings.opentracing.libSpanUnderscoreContextMod.default,
    `type`: () => String
  ): Reference = {
    val __obj = js.Dynamic.literal(_referencedContext = _referencedContext, _type = _type, referencedContext = js.Any.fromFunction0(referencedContext))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Reference]
  }
}

