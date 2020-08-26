package typings.opentracing.referenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  var _referencedContext: typings.opentracing.spanContextMod.default = js.native
  var _type: String = js.native
  /**
    * @return {SpanContext} The SpanContext being referred to (e.g., the
    *         parent in a REFERENCE_CHILD_OF Reference).
    */
  def referencedContext(): typings.opentracing.spanContextMod.default = js.native
  /**
    * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
    *         REFERENCE_FOLLOWS_FROM).
    */
  def `type`(): String = js.native
}

object Reference {
  @scala.inline
  def apply(
    _referencedContext: typings.opentracing.spanContextMod.default,
    _type: String,
    referencedContext: () => typings.opentracing.spanContextMod.default,
    `type`: () => String
  ): Reference = {
    val __obj = js.Dynamic.literal(_referencedContext = _referencedContext.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], referencedContext = js.Any.fromFunction0(referencedContext))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_referencedContext(value: typings.opentracing.spanContextMod.default): Self = this.set("_referencedContext", value.asInstanceOf[js.Any])
    @scala.inline
    def set_type(value: String): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencedContext(value: () => typings.opentracing.spanContextMod.default): Self = this.set("referencedContext", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: () => String): Self = this.set("type", js.Any.fromFunction0(value))
  }
  
}

