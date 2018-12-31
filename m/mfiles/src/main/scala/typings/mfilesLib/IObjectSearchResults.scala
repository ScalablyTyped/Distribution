package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectSearchResults extends js.Object {
  val Count: scala.Double
  val MoreResults: scala.Boolean
  def Clone(): IObjectSearchResults
  def GetAsObjectVersions(): IObjectVersions
  def GetScoreOfObject(ObjVer: IObjVer): scala.Double
  def Item(Index: scala.Double): IObjectVersion
  def ScoreAt(Index: scala.Double): scala.Double
  def Sort(ObjectComparer: IObjectComparer): scala.Unit
  def SortByScore(Ascending: scala.Boolean): scala.Unit
}

