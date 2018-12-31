package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRZones extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, OCRZone: IOCRZone): scala.Unit
  def Clone(): IOCRZones
  def Item(Index: scala.Double): IOCRZone
  def Remove(Index: scala.Double): scala.Unit
}

