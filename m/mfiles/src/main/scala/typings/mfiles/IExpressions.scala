package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExpressions extends StObject {
  
  def Add(Index: Double, Expression: IExpression): Unit = js.native
  
  def Clone(): IExpressions = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IExpression = js.native
  def Item(Index: Double, value: IExpression): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
