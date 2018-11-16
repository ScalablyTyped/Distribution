package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOCRPages extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, OCRPage: IOCRPage): scala.Unit
  def Clone(): IOCRPages
  def Item(Index: scala.Double): IOCRPage
  def Remove(Index: scala.Double): scala.Unit
}

