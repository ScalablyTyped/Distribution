package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjOrFileVer extends js.Object {
  var FileVer: IFileVer
  var ObjVer: IObjVer
  def Clone(): IObjOrFileVer
  def IsFile(): scala.Boolean
}

object IObjOrFileVer {
  @scala.inline
  def apply(
    Clone: js.Function0[IObjOrFileVer],
    FileVer: IFileVer,
    IsFile: js.Function0[scala.Boolean],
    ObjVer: IObjVer
  ): IObjOrFileVer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("FileVer")(FileVer)
    __obj.updateDynamic("IsFile")(IsFile)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.asInstanceOf[IObjOrFileVer]
  }
}

