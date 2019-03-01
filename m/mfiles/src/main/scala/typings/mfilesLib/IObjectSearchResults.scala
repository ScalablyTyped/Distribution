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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetAsObjectVersions")(GetAsObjectVersions)
    __obj.updateDynamic("GetScoreOfObject")(GetScoreOfObject)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("MoreResults")(MoreResults)
    __obj.updateDynamic("ScoreAt")(ScoreAt)
    __obj.updateDynamic("Sort")(Sort)
    __obj.updateDynamic("SortByScore")(SortByScore)
    __obj.asInstanceOf[IObjectSearchResults]
  }
}

