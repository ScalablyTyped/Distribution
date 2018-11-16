package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IIDs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ID: scala.Double): scala.Unit
  def Clone(): IIDs
  def IndexOf(ID: scala.Double): scala.Double
  def Item(Index: scala.Double): scala.Double
  def Remove(Index: scala.Double): scala.Unit
  def RemoveAll(ID: scala.Double): scala.Double
}

