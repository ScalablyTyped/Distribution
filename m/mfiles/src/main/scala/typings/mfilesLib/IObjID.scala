package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjID extends js.Object {
  var ID: scala.Double
  var Type: scala.Double
  def Clone(): IObjID
  def CloneFrom(ObjID: IObjID): scala.Unit
  def Serialize(): js.Array[scala.Double]
  def SetIDs(ObjType: scala.Double, ID: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
  def Unserialize(Bytes: js.Array[scala.Double]): scala.Unit
}

