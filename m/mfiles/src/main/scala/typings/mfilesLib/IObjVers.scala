package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjVers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjVer: IObjVer): scala.Unit
  def Clone(): IObjVers
  def GetAllDistinctObjIDs(): IObjIDs
  def Item(Index: scala.Double): IObjVer
  def Remove(Index: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
}

