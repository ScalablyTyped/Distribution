package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructureJson extends js.Object {
  @JSName("$ID")
  var $ID: java.lang.String
  @JSName("$Type")
  var $Type: java.lang.String
}

object IStructureJson {
  @scala.inline
  def apply($ID: java.lang.String, $Type: java.lang.String): IStructureJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$ID")($ID)
    __obj.updateDynamic("$Type")($Type)
    __obj.asInstanceOf[IStructureJson]
  }
}

