package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedValueNamespace extends js.Object {
  var NamedValues: INamedValues
  var NamespaceName: java.lang.String
  def Clone(): INamedValueNamespace
}

object INamedValueNamespace {
  @scala.inline
  def apply(
    Clone: js.Function0[INamedValueNamespace],
    NamedValues: INamedValues,
    NamespaceName: java.lang.String
  ): INamedValueNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("NamedValues")(NamedValues)
    __obj.updateDynamic("NamespaceName")(NamespaceName)
    __obj.asInstanceOf[INamedValueNamespace]
  }
}

