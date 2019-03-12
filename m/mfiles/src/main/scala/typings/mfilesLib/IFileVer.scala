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

object IFileVer {
  @scala.inline
  def apply(Clone: () => IFileVer, CloneFrom: IFileVer => scala.Unit, ID: scala.Double, Version: scala.Double): IFileVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID, Version = Version)
  
    __obj.asInstanceOf[IFileVer]
  }
}

