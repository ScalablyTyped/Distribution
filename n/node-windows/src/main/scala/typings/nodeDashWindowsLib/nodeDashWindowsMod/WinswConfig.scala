package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WinswConfig extends js.Object {
  var dependencies: java.lang.String | js.Array[java.lang.String]
  var description: js.UndefOr[java.lang.String] = js.undefined
  var env: EnvironmentPair | js.Array[EnvironmentPair]
  var id: java.lang.String
  var logOnAs: User
  var logmode: LogMode
  var logpath: java.lang.String
  var name: java.lang.String
  var nodeOptions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var script: java.lang.String
  var workingdirectory: java.lang.String
  var wrapperArgs: java.lang.String
}

object WinswConfig {
  @scala.inline
  def apply(
    dependencies: java.lang.String | js.Array[java.lang.String],
    env: EnvironmentPair | js.Array[EnvironmentPair],
    id: java.lang.String,
    logOnAs: User,
    logmode: LogMode,
    logpath: java.lang.String,
    name: java.lang.String,
    script: java.lang.String,
    workingdirectory: java.lang.String,
    wrapperArgs: java.lang.String,
    description: java.lang.String = null,
    nodeOptions: java.lang.String | js.Array[java.lang.String] = null
  ): WinswConfig = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id, logOnAs = logOnAs, logmode = logmode, logpath = logpath, name = name, script = script, workingdirectory = workingdirectory, wrapperArgs = wrapperArgs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (nodeOptions != null) __obj.updateDynamic("nodeOptions")(nodeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinswConfig]
  }
}

