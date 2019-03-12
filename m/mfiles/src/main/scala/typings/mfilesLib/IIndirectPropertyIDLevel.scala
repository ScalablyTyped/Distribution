package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyIDLevel extends js.Object {
  var ID: scala.Double
  var LevelType: mfilesLib.MFilesNs.MFIndirectPropertyIDLevelType
  def Clone(): IIndirectPropertyIDLevel
  def ToJSON(): java.lang.String
}

object IIndirectPropertyIDLevel {
  @scala.inline
  def apply(
    Clone: () => IIndirectPropertyIDLevel,
    ID: scala.Double,
    LevelType: mfilesLib.MFilesNs.MFIndirectPropertyIDLevelType,
    ToJSON: () => java.lang.String
  ): IIndirectPropertyIDLevel = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID, LevelType = LevelType, ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IIndirectPropertyIDLevel]
  }
}

