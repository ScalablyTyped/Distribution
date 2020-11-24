package typings.openui5.sap.ui.model

import typings.openui5.sap.ui.base.Object
import typings.openui5.sap.ui.core.Message_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataState extends Object {
  
  /**
    * Returns or sets whether the data state is changed.As long as changed was not set to false the data
    * state is dirtyand the corresponding binding will fire data state change events.
    * @param bNewState the optional new state
    * @returns whether the data state was changed.
    */
  def changed(bNewState: Boolean): Boolean = js.native
  
  /**
    * Returns the changes of the data state in a map that the control can use in
    * the<code>refreshDataState</code> method.The changed property's name is the key in the map. Each
    * element in the map contains an object of below structure.<pre>   {       oldValue : The old value of
    * the property,       value    : The new value of the property   }</pre>The map only contains the
    * changed properties.
    * @returns the changed of the data state
    */
  def getChanges(): js.Any = js.native
  
  /**
    * Returns the array of state messages of the control or undefined.
    * @returns the array of messages of the control or null if no {link:sap.ui.core.messages.ModelManager
    * ModelManager} is used.
    */
  def getControlMessages(): DataState | js.Array[Message_] = js.native
  def getControlMessages(the: js.Array[Message_]): DataState | js.Array[Message_] = js.native
  
  /**
    * Returns the dirty value of a binding that was rejected by a type validation.This value was of an
    * incorrect type and could not be applied to the model. If thevalue was not rejected it will return
    * null. In this case the currentmodel value can be accessed using the <code>getValue</code> method.
    * @returns the value that was rejected or null
    */
  def getInvalidValue(): js.Any = js.native
  
  /**
    * Returns the array of all state messages or null.This combines the model and control messages.
    * @returns the array of all messages or null if no {link:sap.ui.core.messages.ModelManager
    * ModelManager} is used.
    */
  def getMessages(): js.Array[Message_] = js.native
  
  /**
    * Returns the array of state messages of the model or undefined
    * @returns the array of messages of the model or null if no {link:sap.ui.core.messages.ModelManager
    * ModelManager} is used.
    */
  def getModelMessages(): js.Array[Message_] = js.native
  
  /**
    * Returns the formatted original value of the data.The original value is the last confirmed value.
    * @returns the original confirmed value of the server
    */
  def getOriginalValue(): js.Any = js.native
  
  /**
    * Returns the formatted value of the data state.
    * @returns The value of the data.
    */
  def getValue(): js.Any = js.native
  
  /**
    * Returns whether the data state is dirty in the UI control.A data state is dirty in the UI control if
    * the entered value did not yet pass the type validation.
    * @returns true if the data state is dirty
    */
  def isControlDirty(): Boolean = js.native
  
  /**
    * Returns whether the data state is dirty.A data state is dirty if the value was changedbut is not yet
    * confirmed by a server or the entered value did not yet pass the type validation.
    * @returns true if the data state is dirty
    */
  def isDirty(): Boolean = js.native
  
  /**
    * Returns whether the data state is in laundering.If data is send to the server the data state becomes
    * laundering until thedata was accepted or rejected.
    * @returns true if the data is laundering
    */
  def isLaundering(): Boolean = js.native
  
  /**
    * Sets an array of control state messages.
    * @param the control messages
    * @returns <code>this</code> to allow method chaining
    */
  def setControlMessages(the: js.Array[Message_]): DataState = js.native
  
  /**
    * Sets the dirty value that was rejected by the type validation.
    * @param vInvalidValue the value that was rejected by the type validation or null if the value was
    * valid
    * @returns <code>this</code> to allow method chaining
    */
  def setInvalidValue(vInvalidValue: js.Any): DataState = js.native
  
  /**
    * Sets the laundering state of the data state.
    * @param bLaundering true if the state is laundering
    * @returns <code>this</code> to allow method chaining
    */
  def setLaundering(bLaundering: Boolean): DataState = js.native
  
  /**
    * Sets an array of model state messages.
    * @param the model messages for this data state.
    * @returns <code>this</code> to allow method chaining
    */
  def setModelMessages(the: js.Array[_]): DataState = js.native
  
  /**
    * Sets the formatted original value of the data.
    * @param vOriginalValue the original value
    * @returns <code>this</code> to allow method chaining
    */
  def setOriginalValue(vOriginalValue: Boolean): DataState = js.native
  
  /**
    * Sets the formatted value of the data state,
    * @param vValue the value
    * @returns <code>this</code> to allow method chaining
    */
  def setValue(vValue: js.Any): DataState = js.native
}
