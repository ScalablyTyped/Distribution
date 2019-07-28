package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectSearchResults extends js.Object {
  val Count: Double
  val MoreResults: Boolean
  def Clone(): IObjectSearchResults
  def GetAsObjectVersions(): IObjectVersions
  def GetScoreOfObject(ObjVer: IObjVer): Double
  def Item(Index: Double): IObjectVersion
  def ScoreAt(Index: Double): Double
  def Sort(ObjectComparer: IObjectComparer): Unit
  def SortByScore(Ascending: Boolean): Unit
}

object IObjectSearchResults {
  @scala.inline
  def apply(
    Clone: () => IObjectSearchResults,
    Count: Double,
    GetAsObjectVersions: () => IObjectVersions,
    GetScoreOfObject: IObjVer => Double,
    Item: Double => IObjectVersion,
    MoreResults: Boolean,
    ScoreAt: Double => Double,
    Sort: IObjectComparer => Unit,
    SortByScore: Boolean => Unit
  ): IObjectSearchResults = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, GetAsObjectVersions = js.Any.fromFunction0(GetAsObjectVersions), GetScoreOfObject = js.Any.fromFunction1(GetScoreOfObject), Item = js.Any.fromFunction1(Item), MoreResults = MoreResults, ScoreAt = js.Any.fromFunction1(ScoreAt), Sort = js.Any.fromFunction1(Sort), SortByScore = js.Any.fromFunction1(SortByScore))
  
    __obj.asInstanceOf[IObjectSearchResults]
  }
}

