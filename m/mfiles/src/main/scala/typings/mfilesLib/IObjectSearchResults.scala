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

object IObjectSearchResults {
  @scala.inline
  def apply(
    Clone: js.Function0[IObjectSearchResults],
    Count: scala.Double,
    GetAsObjectVersions: js.Function0[IObjectVersions],
    GetScoreOfObject: js.Function1[IObjVer, scala.Double],
    Item: js.Function1[scala.Double, IObjectVersion],
    MoreResults: scala.Boolean,
    ScoreAt: js.Function1[scala.Double, scala.Double],
    Sort: js.Function1[IObjectComparer, scala.Unit],
    SortByScore: js.Function1[scala.Boolean, scala.Unit]
  ): IObjectSearchResults = {
    val __obj = js.Dynamic.literal(Clone = Clone, Count = Count, GetAsObjectVersions = GetAsObjectVersions, GetScoreOfObject = GetScoreOfObject, Item = Item, MoreResults = MoreResults, ScoreAt = ScoreAt, Sort = Sort, SortByScore = SortByScore)
  
    __obj.asInstanceOf[IObjectSearchResults]
  }
}

