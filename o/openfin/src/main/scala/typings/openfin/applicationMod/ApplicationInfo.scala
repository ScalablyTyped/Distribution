package typings.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationInfo extends js.Object {
  var initialOptions: js.Object
  var launchMode: String
  var manifest: js.Object
  var manifestUrl: String
  var parentUuid: js.UndefOr[String] = js.undefined
  var runtime: js.Object
}

object ApplicationInfo {
  @scala.inline
  def apply(
    initialOptions: js.Object,
    launchMode: String,
    manifest: js.Object,
    manifestUrl: String,
    runtime: js.Object,
    parentUuid: String = null
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal(initialOptions = initialOptions.asInstanceOf[js.Any], launchMode = launchMode.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    if (parentUuid != null) __obj.updateDynamic("parentUuid")(parentUuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
}

