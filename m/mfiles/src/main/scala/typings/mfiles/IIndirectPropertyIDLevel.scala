package typings.mfiles

import typings.mfiles.MFilesNs.MFIndirectPropertyIDLevelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyIDLevel extends js.Object {
  var ID: Double
  var LevelType: MFIndirectPropertyIDLevelType
  def Clone(): IIndirectPropertyIDLevel
  def ToJSON(): String
}

object IIndirectPropertyIDLevel {
  @scala.inline
  def apply(
    Clone: () => IIndirectPropertyIDLevel,
    ID: Double,
    LevelType: MFIndirectPropertyIDLevelType,
    ToJSON: () => String
  ): IIndirectPropertyIDLevel = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID, LevelType = LevelType, ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IIndirectPropertyIDLevel]
  }
}

