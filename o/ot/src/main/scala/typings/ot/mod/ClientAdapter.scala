package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientAdapter extends StObject {
  
  def applyOperation(operation: TextOperation): Unit = js.native
  
  def getSelection(): Selection = js.native
  
  def getValue(): String = js.native
  
  def registerCallbacks(callbacks: ClientAdapterCallbacks): Unit = js.native
  
  def registerRedo(fun: js.Function0[Unit]): Unit = js.native
  
  def registerUndo(fun: js.Function0[Unit]): Unit = js.native
  
  def setOtherSelection(selection: Selection, color: String, otherClientId: String): Mark = js.native
  
  def setSelection(): Unit = js.native
  def setSelection(selection: Selection): Unit = js.native
}
