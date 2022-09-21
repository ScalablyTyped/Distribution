package typings.mfiles.global.MFiles

import typings.mfiles.IStateTransition
import typings.mfiles.IStateTransitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.StateTransitions")
@js.native
open class StateTransitions ()
  extends StObject
     with IStateTransitions {
  
  /* CompleteClass */
  override def Add(Index: Double, StateTransition: IStateTransition): Unit = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IStateTransition = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
