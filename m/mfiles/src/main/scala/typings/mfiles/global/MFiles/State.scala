package typings.mfiles.global.MFiles

import typings.mfiles.ILookup
import typings.mfiles.IState
import typings.mfiles.ITypedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.State")
@js.native
class State ()
  extends StObject
     with IState {
  
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
}
