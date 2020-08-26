package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedValueNamespace extends js.Object {
  var NamedValues: INamedValues = js.native
  var NamespaceName: String = js.native
  def Clone(): INamedValueNamespace = js.native
}

object INamedValueNamespace {
  @scala.inline
  def apply(Clone: () => INamedValueNamespace, NamedValues: INamedValues, NamespaceName: String): INamedValueNamespace = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), NamedValues = NamedValues.asInstanceOf[js.Any], NamespaceName = NamespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedValueNamespace]
  }
  @scala.inline
  implicit class INamedValueNamespaceOps[Self <: INamedValueNamespace] (val x: Self) extends AnyVal {
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
    def setClone(value: () => INamedValueNamespace): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setNamedValues(value: INamedValues): Self = this.set("NamedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespaceName(value: String): Self = this.set("NamespaceName", value.asInstanceOf[js.Any])
  }
  
}

