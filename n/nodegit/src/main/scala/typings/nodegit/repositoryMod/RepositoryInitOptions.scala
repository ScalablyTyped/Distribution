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
    val __obj = js.Dynamic.literal(description = description, flags = flags, initialHead = initialHead, mode = mode, originUrl = originUrl, templatePath = templatePath, version = version, workdirPath = workdirPath)
  
    __obj.asInstanceOf[RepositoryInitOptions]
  }
}

