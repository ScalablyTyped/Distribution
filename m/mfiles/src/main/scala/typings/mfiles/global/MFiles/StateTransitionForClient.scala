package typings.mfiles.global.MFiles

import typings.mfiles.ILookup
import typings.mfiles.IStateTransitionForClient
import typings.mfiles.ITypedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.StateTransitionForClient")
@js.native
open class StateTransitionForClient ()
  extends StObject
     with IStateTransitionForClient {
  
  /* CompleteClass */
  override def Clone(): IStateTransitionForClient = js.native
  
  /* CompleteClass */
  var FromState: Double = js.native
  
  /* CompleteClass */
  override def GetAsLookup(): ILookup = js.native
  
  /* CompleteClass */
  override def GetAsTypedValue(): ITypedValue = js.native
  
  /* CompleteClass */
  override val ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var Selectable: Boolean = js.native
  
  /* CompleteClass */
  var SelectableFlagAffectedByPseudoUsers: Boolean = js.native
  
  /* CompleteClass */
  var ToState: Double = js.native
}
