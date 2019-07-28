package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjOrFileVer extends js.Object {
  var FileVer: IFileVer
  var ObjVer: IObjVer
  def Clone(): IObjOrFileVer
  def IsFile(): Boolean
}

object IObjOrFileVer {
  @scala.inline
  def apply(Clone: () => IObjOrFileVer, FileVer: IFileVer, IsFile: () => Boolean, ObjVer: IObjVer): IObjOrFileVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FileVer = FileVer, IsFile = js.Any.fromFunction0(IsFile), ObjVer = ObjVer)
  
    __obj.asInstanceOf[IObjOrFileVer]
  }
}

