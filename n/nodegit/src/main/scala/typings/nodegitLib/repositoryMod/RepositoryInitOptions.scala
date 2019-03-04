package typings
package nodegitLib.repositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryInitOptions extends js.Object {
  var description: java.lang.String
  var flags: scala.Double
  var initialHead: java.lang.String
  var mode: scala.Double
  var originUrl: java.lang.String
  var templatePath: java.lang.String
  var version: scala.Double
  var workdirPath: java.lang.String
}

object RepositoryInitOptions {
  @scala.inline
  def apply(
    description: java.lang.String,
    flags: scala.Double,
    initialHead: java.lang.String,
    mode: scala.Double,
    originUrl: java.lang.String,
    templatePath: java.lang.String,
    version: scala.Double,
    workdirPath: java.lang.String
  ): RepositoryInitOptions = {
    val __obj = js.Dynamic.literal(description = description, flags = flags, initialHead = initialHead, mode = mode, originUrl = originUrl, templatePath = templatePath, version = version, workdirPath = workdirPath)
  
    __obj.asInstanceOf[RepositoryInitOptions]
  }
}

