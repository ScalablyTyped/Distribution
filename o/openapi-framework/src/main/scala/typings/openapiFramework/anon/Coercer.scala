package typings.openapiFramework.anon

import typings.openapiDefaultSetter.mod.IOpenAPIDefaultSetter
import typings.openapiRequestCoercer.mod.IOpenAPIRequestCoercer
import typings.openapiRequestValidator.mod.IOpenAPIRequestValidator
import typings.openapiResponseValidator.mod.IOpenAPIResponseValidator
import typings.openapiSecurityHandler.mod.IOpenAPISecurityHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coercer extends js.Object {
  var coercer: js.UndefOr[IOpenAPIRequestCoercer] = js.undefined
  var defaultSetter: js.UndefOr[IOpenAPIDefaultSetter] = js.undefined
  var requestValidator: js.UndefOr[IOpenAPIRequestValidator] = js.undefined
  var responseValidator: js.UndefOr[IOpenAPIResponseValidator] = js.undefined
  var securityHandler: js.UndefOr[IOpenAPISecurityHandler] = js.undefined
}

object Coercer {
  @scala.inline
  def apply(
    coercer: IOpenAPIRequestCoercer = null,
    defaultSetter: IOpenAPIDefaultSetter = null,
    requestValidator: IOpenAPIRequestValidator = null,
    responseValidator: IOpenAPIResponseValidator = null,
    securityHandler: IOpenAPISecurityHandler = null
  ): Coercer = {
    val __obj = js.Dynamic.literal()
    if (coercer != null) __obj.updateDynamic("coercer")(coercer.asInstanceOf[js.Any])
    if (defaultSetter != null) __obj.updateDynamic("defaultSetter")(defaultSetter.asInstanceOf[js.Any])
    if (requestValidator != null) __obj.updateDynamic("requestValidator")(requestValidator.asInstanceOf[js.Any])
    if (responseValidator != null) __obj.updateDynamic("responseValidator")(responseValidator.asInstanceOf[js.Any])
    if (securityHandler != null) __obj.updateDynamic("securityHandler")(securityHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coercer]
  }
}

