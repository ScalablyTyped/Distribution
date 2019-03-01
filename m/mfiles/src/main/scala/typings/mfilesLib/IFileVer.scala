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
  def apply(
    Clone: js.Function0[IFileVer],
    CloneFrom: js.Function1[IFileVer, scala.Unit],
    ID: scala.Double,
    Version: scala.Double
  ): IFileVer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[IFileVer]
  }
}

