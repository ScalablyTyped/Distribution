package typings.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WinswConfig extends js.Object {
  var dependencies: String | js.Array[String] = js.native
  var description: js.UndefOr[String] = js.native
  var env: EnvironmentPair | js.Array[EnvironmentPair] = js.native
  var id: String = js.native
  var logOnAs: User = js.native
  var logmode: LogMode = js.native
  var logpath: String = js.native
  var name: String = js.native
  var nodeOptions: js.UndefOr[String | js.Array[String]] = js.native
  var script: String = js.native
  var workingdirectory: String = js.native
  var wrapperArgs: String = js.native
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
    wrapperArgs: String
  ): WinswConfig = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logOnAs = logOnAs.asInstanceOf[js.Any], logmode = logmode.asInstanceOf[js.Any], logpath = logpath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], workingdirectory = workingdirectory.asInstanceOf[js.Any], wrapperArgs = wrapperArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinswConfig]
  }
  @scala.inline
  implicit class WinswConfigOps[Self <: WinswConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: String | js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvVarargs(value: EnvironmentPair*): Self = this.set("env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: EnvironmentPair | js.Array[EnvironmentPair]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogOnAs(value: User): Self = this.set("logOnAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogmode(value: LogMode): Self = this.set("logmode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogpath(value: String): Self = this.set("logpath", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkingdirectory(value: String): Self = this.set("workingdirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapperArgs(value: String): Self = this.set("wrapperArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setNodeOptionsVarargs(value: String*): Self = this.set("nodeOptions", js.Array(value :_*))
    @scala.inline
    def setNodeOptions(value: String | js.Array[String]): Self = this.set("nodeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeOptions: Self = this.set("nodeOptions", js.undefined)
  }
  
}

