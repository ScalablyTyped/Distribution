package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateTransitionsForClient extends StObject {
  
  def Add(Index: Double, StateTransitionForClient: IStateTransitionForClient): Unit = js.native
  
  def Clone(): IStateTransitionsForClient = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IStateTransitionForClient = js.native
  def Item(Index: Double, value: IStateTransitionForClient): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
