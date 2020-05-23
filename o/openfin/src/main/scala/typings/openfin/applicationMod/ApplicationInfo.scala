package typings.openfin.applicationMod

import typings.openfin.anon.Version
import typings.openfin.applicationOptionMod.ApplicationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationInfo extends js.Object {
  var initialOptions: ApplicationOption
  var launchMode: String
  var manifest: js.Object
  var manifestUrl: String
  var parentUuid: js.UndefOr[String] = js.undefined
  var runtime: Version
}

object ApplicationInfo {
  @scala.inline
  def apply(
    initialOptions: ApplicationOption,
    launchMode: String,
    manifest: js.Object,
    manifestUrl: String,
    runtime: Version,
    parentUuid: String = null
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal(initialOptions = initialOptions.asInstanceOf[js.Any], launchMode = launchMode.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    if (parentUuid != null) __obj.updateDynamic("parentUuid")(parentUuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
}

