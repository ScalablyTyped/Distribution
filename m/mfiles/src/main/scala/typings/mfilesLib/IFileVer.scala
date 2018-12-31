package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileVer extends js.Object {
  var ID: scala.Double
  var Version: scala.Double
  def Clone(): IFileVer
  def CloneFrom(FileVer: IFileVer): scala.Unit
}

