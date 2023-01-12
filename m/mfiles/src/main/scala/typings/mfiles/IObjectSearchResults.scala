package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectSearchResults extends StObject {
  
  def Clone(): IObjectSearchResults
  
  val Count: Double
  
  def GetAsObjectVersions(): IObjectVersions
  
  def GetScoreOfObject(ObjVer: IObjVer): Double
  
  def Item(Index: Double): IObjectVersion
  
  val MoreResults: Boolean
  
  def ScoreAt(Index: Double): Double
  
  def Sort(ObjectComparer: IObjectComparer): Unit
  
  def SortByScore(Ascending: Boolean): Unit
}
object IObjectSearchResults {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IObjectSearchResults] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IObjectSearchResults): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetAsObjectVersions(value: () => IObjectVersions): Self = StObject.set(x, "GetAsObjectVersions", js.Any.fromFunction0(value))
    
    inline def setGetScoreOfObject(value: IObjVer => Double): Self = StObject.set(x, "GetScoreOfObject", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IObjectVersion): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setScoreAt(value: Double => Double): Self = StObject.set(x, "ScoreAt", js.Any.fromFunction1(value))
    
    inline def setSort(value: IObjectComparer => Unit): Self = StObject.set(x, "Sort", js.Any.fromFunction1(value))
    
    inline def setSortByScore(value: Boolean => Unit): Self = StObject.set(x, "SortByScore", js.Any.fromFunction1(value))
  }
}
