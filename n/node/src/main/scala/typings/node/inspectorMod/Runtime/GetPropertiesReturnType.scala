package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPropertiesReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  /**
    * Internal object properties (only of the element itself).
    */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.native
  /**
    * Object properties.
    */
  var result: js.Array[PropertyDescriptor] = js.native
}

object GetPropertiesReturnType {
  @scala.inline
  def apply(result: js.Array[PropertyDescriptor]): GetPropertiesReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesReturnType]
  }
  @scala.inline
  implicit class GetPropertiesReturnTypeOps[Self <: GetPropertiesReturnType] (val x: Self) extends AnyVal {
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
    def setResultVarargs(value: PropertyDescriptor*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[PropertyDescriptor]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = this.set("exceptionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptionDetails: Self = this.set("exceptionDetails", js.undefined)
    @scala.inline
    def setInternalPropertiesVarargs(value: InternalPropertyDescriptor*): Self = this.set("internalProperties", js.Array(value :_*))
    @scala.inline
    def setInternalProperties(value: js.Array[InternalPropertyDescriptor]): Self = this.set("internalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalProperties: Self = this.set("internalProperties", js.undefined)
  }
  
}

