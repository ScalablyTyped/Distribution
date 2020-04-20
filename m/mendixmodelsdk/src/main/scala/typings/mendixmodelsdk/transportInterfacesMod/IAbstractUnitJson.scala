package typings.mendixmodelsdk.transportInterfacesMod

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
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractUnitJson]
  }
}

