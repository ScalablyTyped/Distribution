package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractUnitJson extends IStructureJson {
  var containerId: java.lang.String
  var containmentName: java.lang.String
  var contents: IAbstractElementJson
}

object IAbstractUnitJson {
  @scala.inline
  def apply(
    $ID: java.lang.String,
    $Type: java.lang.String,
    containerId: java.lang.String,
    containmentName: java.lang.String,
    contents: IAbstractElementJson
  ): IAbstractUnitJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$ID")($ID)
    __obj.updateDynamic("$Type")($Type)
    __obj.updateDynamic("containerId")(containerId)
    __obj.updateDynamic("containmentName")(containmentName)
    __obj.updateDynamic("contents")(contents)
    __obj.asInstanceOf[IAbstractUnitJson]
  }
}

