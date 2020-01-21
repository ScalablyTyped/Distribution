package typings.openapiFramework.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkVisitor extends js.Object {
  var visitApi: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkAPIContext, Unit]] = js.undefined
  var visitOperation: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkOperationContext, Unit]] = js.undefined
  var visitPath: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkPathContext, Unit]] = js.undefined
}

object OpenAPIFrameworkVisitor {
  @scala.inline
  def apply(
    visitApi: /* context */ OpenAPIFrameworkAPIContext => Unit = null,
    visitOperation: /* context */ OpenAPIFrameworkOperationContext => Unit = null,
    visitPath: /* context */ OpenAPIFrameworkPathContext => Unit = null
  ): OpenAPIFrameworkVisitor = {
    val __obj = js.Dynamic.literal()
    if (visitApi != null) __obj.updateDynamic("visitApi")(js.Any.fromFunction1(visitApi))
    if (visitOperation != null) __obj.updateDynamic("visitOperation")(js.Any.fromFunction1(visitOperation))
    if (visitPath != null) __obj.updateDynamic("visitPath")(js.Any.fromFunction1(visitPath))
    __obj.asInstanceOf[OpenAPIFrameworkVisitor]
  }
}

