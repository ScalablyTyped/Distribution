package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractUnitJson extends IStructureJson {
  var containerId: String
  var containmentName: String
  var contents: IAbstractElementJson
}

object IAbstractUnitJson {
  @scala.inline
  def apply(
    $ID: String,
    $Type: String,
    containerId: String,
    containmentName: String,
    contents: IAbstractElementJson
  ): IAbstractUnitJson = {
    val __obj = js.Dynamic.literal($ID = $ID, $Type = $Type, containerId = containerId, containmentName = containmentName, contents = contents)
  
    __obj.asInstanceOf[IAbstractUnitJson]
  }
}

