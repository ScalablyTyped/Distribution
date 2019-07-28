package typings.pathDashKey.pathDashKeyMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJSNs.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Use a custom environment variables object. Default: [`process.env`](https://nodejs.org/api/process.html#process_process_env).
  		*/
  val env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  /**
  		Get the PATH key for a specific platform. Default: [`process.platform`](https://nodejs.org/api/process.html#process_process_platform).
  		*/
  val platform: js.UndefOr[Platform] = js.undefined
}

object Options {
  @scala.inline
  def apply(env: StringDictionary[js.UndefOr[String]] = null, platform: Platform = null): Options = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Options]
  }
}

