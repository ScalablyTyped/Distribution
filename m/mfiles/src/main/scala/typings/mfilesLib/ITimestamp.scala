package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimestamp extends js.Object {
  var Day: scala.Double
  var Fraction: scala.Double
  var Hour: scala.Double
  var Minute: scala.Double
  var Month: scala.Double
  var Second: scala.Double
  var Year: scala.Double
  def Clone(): ITimestamp
  def GetValue(): js.Any
  def LocalTimeToUtc(): ITimestamp
  def SetValue(Value: js.Any): scala.Unit
  def UtcToLocalTime(): ITimestamp
}

