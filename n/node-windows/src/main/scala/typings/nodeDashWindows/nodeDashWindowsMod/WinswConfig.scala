package typings.nodeDashWindows.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WinswConfig extends js.Object {
  var dependencies: String | js.Array[String]
  var description: js.UndefOr[String] = js.undefined
  var env: EnvironmentPair | js.Array[EnvironmentPair]
  var id: String
  var logOnAs: User
  var logmode: LogMode
  var logpath: String
  var name: String
  var nodeOptions: js.UndefOr[String | js.Array[String]] = js.undefined
  var script: String
  var workingdirectory: String
  var wrapperArgs: String
}

object WinswConfig {
  @scala.inline
  def apply(
    dependencies: String | js.Array[String],
    env: EnvironmentPair | js.Array[EnvironmentPair],
    id: String,
    logOnAs: User,
    logmode: LogMode,
    logpath: String,
    name: String,
    script: String,
    workingdirectory: String,
    wrapperArgs: String,
    description: String = null,
    nodeOptions: String | js.Array[String] = null
  ): WinswConfig = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id, logOnAs = logOnAs, logmode = logmode, logpath = logpath, name = name, script = script, workingdirectory = workingdirectory, wrapperArgs = wrapperArgs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (nodeOptions != null) __obj.updateDynamic("nodeOptions")(nodeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinswConfig]
  }
}

