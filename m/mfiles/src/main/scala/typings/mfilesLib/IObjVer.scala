package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVer extends js.Object {
  var ID: scala.Double
  var ObjID: IObjID
  var Type: scala.Double
  var Version: scala.Double
  def Clone(): IObjVer
  def CloneFrom(ObjVer: IObjVer): scala.Unit
  def Serialize(): js.Array[scala.Double]
  def SetIDs(ObjType: scala.Double, ID: scala.Double, Version: scala.Double): scala.Unit
  def SetObjIDAndVersion(ObjID: IObjID, Version: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
  def Unserialize(Bytes: js.Array[scala.Double]): scala.Unit
}

