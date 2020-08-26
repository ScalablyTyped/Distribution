package typings.nodegit.repositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryInitOptions extends js.Object {
  var description: String = js.native
  var flags: Double = js.native
  var initialHead: String = js.native
  var mode: Double = js.native
  var originUrl: String = js.native
  var templatePath: String = js.native
  var version: Double = js.native
  var workdirPath: String = js.native
}

object RepositoryInitOptions {
  @scala.inline
  def apply(
    description: String,
    flags: Double,
    initialHead: String,
    mode: Double,
    originUrl: String,
    templatePath: String,
    version: Double,
    workdirPath: String
  ): RepositoryInitOptions = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], initialHead = initialHead.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], originUrl = originUrl.asInstanceOf[js.Any], templatePath = templatePath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workdirPath = workdirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryInitOptions]
  }
  @scala.inline
  implicit class RepositoryInitOptionsOps[Self <: RepositoryInitOptions] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialHead(value: String): Self = this.set("initialHead", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginUrl(value: String): Self = this.set("originUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplatePath(value: String): Self = this.set("templatePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkdirPath(value: String): Self = this.set("workdirPath", value.asInstanceOf[js.Any])
  }
  
}

