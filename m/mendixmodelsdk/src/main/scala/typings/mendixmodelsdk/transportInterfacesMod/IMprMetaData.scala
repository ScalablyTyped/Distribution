package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMprMetaData extends js.Object {
  /** docs:keep */ var _BuildVersion: String
  /** docs:keep */ var _ProductVersion: String
  /** docs:keep */ var _SchemaHash: String
}

object IMprMetaData {
  @scala.inline
  def apply(_BuildVersion: String, _ProductVersion: String, _SchemaHash: String): IMprMetaData = {
    val __obj = js.Dynamic.literal(_BuildVersion = _BuildVersion.asInstanceOf[js.Any], _ProductVersion = _ProductVersion.asInstanceOf[js.Any], _SchemaHash = _SchemaHash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMprMetaData]
  }
}

