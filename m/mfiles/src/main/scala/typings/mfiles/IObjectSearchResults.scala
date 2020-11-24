package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectSearchResults extends js.Object {
  
  def Clone(): IObjectSearchResults = js.native
  
  val Count: Double = js.native
  
  def GetAsObjectVersions(): IObjectVersions = js.native
  
  def GetScoreOfObject(ObjVer: IObjVer): Double = js.native
  
  def Item(Index: Double): IObjectVersion = js.native
  
  val MoreResults: Boolean = js.native
  
  def ScoreAt(Index: Double): Double = js.native
  
  def Sort(ObjectComparer: IObjectComparer): Unit = js.native
  
  def SortByScore(Ascending: Boolean): Unit = js.native
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetAsObjectVersions = js.Any.fromFunction0(GetAsObjectVersions), GetScoreOfObject = js.Any.fromFunction1(GetScoreOfObject), Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any], ScoreAt = js.Any.fromFunction1(ScoreAt), Sort = js.Any.fromFunction1(Sort), SortByScore = js.Any.fromFunction1(SortByScore))
    __obj.asInstanceOf[IObjectSearchResults]
  }
  
  @scala.inline
  implicit class IObjectSearchResultsOps[Self <: IObjectSearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => IObjectSearchResults): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAsObjectVersions(value: () => IObjectVersions): Self = this.set("GetAsObjectVersions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScoreOfObject(value: IObjVer => Double): Self = this.set("GetScoreOfObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IObjectVersion): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreResults(value: Boolean): Self = this.set("MoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreAt(value: Double => Double): Self = this.set("ScoreAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: IObjectComparer => Unit): Self = this.set("Sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortByScore(value: Boolean => Unit): Self = this.set("SortByScore", js.Any.fromFunction1(value))
  }
}
