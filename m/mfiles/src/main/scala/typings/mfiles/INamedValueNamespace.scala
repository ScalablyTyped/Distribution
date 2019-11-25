package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedValueNamespace extends js.Object {
  var NamedValues: INamedValues
  var NamespaceName: String
  def Clone(): INamedValueNamespace
}

object INamedValueNamespace {
  @scala.inline
  def apply(Clone: () => INamedValueNamespace, NamedValues: INamedValues, NamespaceName: String): INamedValueNamespace = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), NamedValues = NamedValues.asInstanceOf[js.Any], NamespaceName = NamespaceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INamedValueNamespace]
  }
}

