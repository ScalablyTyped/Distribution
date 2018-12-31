package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDRange extends js.Object {
  var MaxID: scala.Double
  var MaxID_32bit: java.lang.String
  var MinID: scala.Double
  var MinID_32bit: java.lang.String
  def Clone(): IIDRange
  def SetIDs(MinID: scala.Double, MaxID: scala.Double): scala.Unit
  def SetIDs_32bit(MinID: java.lang.String, MaxID: java.lang.String): scala.Unit
}

