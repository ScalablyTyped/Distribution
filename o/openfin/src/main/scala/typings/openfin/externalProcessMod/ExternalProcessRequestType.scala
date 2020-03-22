package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalProcessRequestType extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var arguments: js.UndefOr[String] = js.undefined
  var certificate: js.UndefOr[CertificationInfo] = js.undefined
  var lifetime: js.UndefOr[String] = js.undefined
  var listener: js.UndefOr[LaunchExternalProcessListener] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object ExternalProcessRequestType {
  @scala.inline
  def apply(
    alias: String = null,
    arguments: String = null,
    certificate: CertificationInfo = null,
    lifetime: String = null,
    listener: /* code */ ExitCode => Unit = null,
    path: String = null,
    uuid: String = null
  ): ExternalProcessRequestType = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(js.Any.fromFunction1(listener))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalProcessRequestType]
  }
}

