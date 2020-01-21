package typings.mendixmodelsdk.structuresMod

import typings.mendixmodelsdk.versionChecksMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructureClass extends js.Object {
  var versionInfo: StructureVersionInfo
}

object IStructureClass {
  @scala.inline
  def apply(versionInfo: StructureVersionInfo): IStructureClass = {
    val __obj = js.Dynamic.literal(versionInfo = versionInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStructureClass]
  }
}

