package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructureJson extends js.Object {
  @JSName("$ID")
  var $ID: String
  @JSName("$Type")
  var $Type: String
}

object IStructureJson {
  @scala.inline
  def apply($ID: String, $Type: String): IStructureJson = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStructureJson]
  }
}

