package typings.nodegit.repositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryInitOptions extends js.Object {
  var description: String
  var flags: Double
  var initialHead: String
  var mode: Double
  var originUrl: String
  var templatePath: String
  var version: Double
  var workdirPath: String
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
}

