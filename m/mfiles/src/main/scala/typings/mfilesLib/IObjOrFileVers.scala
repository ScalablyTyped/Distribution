package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjOrFileVers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjOrFileVer: IObjOrFileVer): scala.Unit
  def Clone(): IObjOrFileVers
  def Item(Index: scala.Double): IObjOrFileVer
  def Remove(Index: scala.Double): scala.Unit
}

