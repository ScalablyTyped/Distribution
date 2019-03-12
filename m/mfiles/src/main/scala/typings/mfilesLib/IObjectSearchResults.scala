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
    Clone: () => IObjectSearchResults,
    Count: scala.Double,
    GetAsObjectVersions: () => IObjectVersions,
    GetScoreOfObject: IObjVer => scala.Double,
    Item: scala.Double => IObjectVersion,
    MoreResults: scala.Boolean,
    ScoreAt: scala.Double => scala.Double,
    Sort: IObjectComparer => scala.Unit,
    SortByScore: scala.Boolean => scala.Unit
  ): IObjectSearchResults = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, GetAsObjectVersions = js.Any.fromFunction0(GetAsObjectVersions), GetScoreOfObject = js.Any.fromFunction1(GetScoreOfObject), Item = js.Any.fromFunction1(Item), MoreResults = MoreResults, ScoreAt = js.Any.fromFunction1(ScoreAt), Sort = js.Any.fromFunction1(Sort), SortByScore = js.Any.fromFunction1(SortByScore))
  
    __obj.asInstanceOf[IObjectSearchResults]
  }
}

