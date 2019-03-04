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
    val __obj = js.Dynamic.literal($ID = $ID, $Type = $Type, containerId = containerId, containmentName = containmentName, contents = contents)
  
    __obj.asInstanceOf[IAbstractUnitJson]
  }
}

