package typings
package pathDashKeyLib.pathDashKeyMod.pathKeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var platform: js.UndefOr[nodeLib.NodeJSNs.Platform] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    env: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    platform: nodeLib.NodeJSNs.Platform = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Options]
  }
}

