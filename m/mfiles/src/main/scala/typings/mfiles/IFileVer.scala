package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileVer extends js.Object {
  var ID: Double
  var Version: Double
  def Clone(): IFileVer
  def CloneFrom(FileVer: IFileVer): Unit
}

object IFileVer {
  @scala.inline
  def apply(Clone: () => IFileVer, CloneFrom: IFileVer => Unit, ID: Double, Version: Double): IFileVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID, Version = Version)
  
    __obj.asInstanceOf[IFileVer]
  }
}

