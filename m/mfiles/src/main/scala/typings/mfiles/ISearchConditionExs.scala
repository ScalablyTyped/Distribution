package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchConditionExs extends js.Object {
  
  def Add(Index: Double, SearchConditionEx: ISearchConditionEx): Unit = js.native
  
  def Clone(): ISearchConditionExs = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ISearchConditionEx = js.native
  def Item(Index: Double, value: ISearchConditionEx): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
