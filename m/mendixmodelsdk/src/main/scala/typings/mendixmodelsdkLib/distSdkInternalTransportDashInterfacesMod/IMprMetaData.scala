package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMprMetaData extends js.Object {
  /** docs:keep */ var _BuildVersion: java.lang.String
  /** docs:keep */ var _ProductVersion: java.lang.String
  /** docs:keep */ var _SchemaHash: java.lang.String
}

object IMprMetaData {
  @scala.inline
  def apply(_BuildVersion: java.lang.String, _ProductVersion: java.lang.String, _SchemaHash: java.lang.String): IMprMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_BuildVersion")(_BuildVersion)
    __obj.updateDynamic("_ProductVersion")(_ProductVersion)
    __obj.updateDynamic("_SchemaHash")(_SchemaHash)
    __obj.asInstanceOf[IMprMetaData]
  }
}

