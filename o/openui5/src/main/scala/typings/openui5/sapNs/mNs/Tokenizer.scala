package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.delegateNs.ScrollEnablement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Tokenizer")
@js.native
class Tokenizer protected () extends Control {
  /**
    * Constructor for a new Tokenizer.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): Tokenizer = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): Tokenizer = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Tokenizer = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Tokenizer = js.native
  /**
    * Adds some token to the aggregation <code>tokens</code>.
    * @param oToken the token to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addToken(oToken: Token): Tokenizer = js.native
  /**
    * Function validates the given text and adds a new token if validation was successful
    * @param oParameters parameter bag containing following fields: {sap.m.String} text - the source text
    * {sap.m.Token}         [optional] token - a suggested token {object} [optional] suggestionObject -
    * any object used to find the         suggested token {function} [optional] validationCallback -
    * callback which gets called after validation has         finished
    */
  def addValidateToken(oParameters: js.Any): Unit = js.native
  /**
    * Function adds an validation callback called before any new token gets added to the tokens
    * aggregation
    * @param fValidator undefined
    */
  def addValidator(fValidator: js.Any): Unit = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tokenChange</code> event of this
    * <code>sap.m.Tokenizer</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Tokenizer</code> itself.fired when the tokens aggregation changed (add / remove token)
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Tokenizer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTokenChange(oData: js.Any, fnFunction: js.Any): Tokenizer = js.native
  def attachTokenChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Tokenizer = js.native
  /**
    * Destroys all the tokens in the aggregation <code>tokens</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyTokens(): Tokenizer = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tokenChange</code> event of this
    * <code>sap.m.Tokenizer</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTokenChange(fnFunction: js.Any, oListener: js.Any): Tokenizer = js.native
  /**
    * Fires event <code>tokenChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>type</code> of type <code>string</code>type of tokenChange event.There are
    * four TokenChange types: "added", "removed", "removedAll", "tokensChanged".Use
    * Tokenizer.TokenChangeType.Added for "added",	Tokenizer.TokenChangeType.Removed for "removed",
    * Tokenizer.TokenChangeType.RemovedAll for "removedAll" and Tokenizer.TokenChangeType.TokensChanged
    * for "tokensChanged".</li><li><code>token</code> of type <code>sap.m.Token</code>the added token or
    * removed token.This parameter is used when tokenChange type is "added" or
    * "removed".</li><li><code>tokens</code> of type <code>sap.m.Token[]</code>the array of removed
    * tokens.This parameter is used when tokenChange type is
    * "removedAll".</li><li><code>addedTokens</code> of type <code>sap.m.Token[]</code>the array of tokens
    * that are added.This parameter is used when tokenChange type is
    * "tokenChanged".</li><li><code>removedTokens</code> of type <code>sap.m.Token[]</code>the array of
    * tokens that are removed.This parameter is used when tokenChange type is "tokenChanged".</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTokenChange(mArguments: js.Any): Tokenizer = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>editable</code>.true if tokens shall be editable otherwise
    * falseDefault value is <code>true</code>.
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): Boolean = js.native
  /**
    * Function returns the internally used scroll delegate
    */
  def getScrollDelegate(): ScrollEnablement = js.native
  /**
    * Function returns the tokens' width
    */
  def getScrollWidth(): Unit = js.native
  /**
    * Function returns all currently selected tokens
    * @returns - array of selected tokens or empty array
    */
  def getSelectedTokens(): js.Array[Token] = js.native
  /**
    * Gets content of aggregation <code>tokens</code>.the currently displayed tokens
    */
  def getTokens(): js.Array[Token] = js.native
  /**
    * Gets current value of property <code>width</code>.Defines the width of the Tokenizer.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.m.Token</code> in the aggregation <code>tokens</code>.and returns
    * its index if found or -1 otherwise.
    * @param oToken The token whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfToken(oToken: Token): Double = js.native
  /**
    * Inserts a token into the aggregation <code>tokens</code>.
    * @param oToken the token to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the token should be inserted at; for             a
    * negative value of <code>iIndex</code>, the token is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the token is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertToken(oToken: Token, iIndex: Double): Tokenizer = js.native
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>tokens</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllTokens(): js.Array[Token] = js.native
  /**
    * Function removes all validation callbacks
    */
  def removeAllValidators(): Unit = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  /**
    * Function removes all selected tokens
    * @returns - this for chaining
    */
  def removeSelectedTokens(): Tokenizer = js.native
  def removeToken(vToken: String): Token = js.native
  /**
    * Removes a token from the aggregation <code>tokens</code>.
    * @param vToken The token to remove or its index or id
    * @returns The removed token or <code>null</code>
    */
  def removeToken(vToken: Double): Token = js.native
  def removeToken(vToken: Token): Token = js.native
  /**
    * Function removes an validation callback
    * @param fValidator undefined
    */
  def removeValidator(fValidator: js.Any): Unit = js.native
  /**
    * Function scrolls the tokens to the end
    * @param bInitialize indicates if we should reset the 'scroll-to-end-pending' flag; if true we would
    * reset this flag
    */
  def scrollToEnd(bInitialize: Boolean): Unit = js.native
  /**
    * Function scrolls the tokens to the start
    */
  def scrollToStart(): Unit = js.native
  /**
    * Function selects all tokens
    * @param optional bSelect - true for selecting, false for deselecting
    * @returns - this for chaining
    */
  def selectAllTokens(optional: Boolean): Tokenizer = js.native
  /**
    * Sets a new value for property <code>editable</code>.true if tokens shall be editable otherwise
    * falseWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bEditable New value for property <code>editable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEditable(bEditable: Boolean): Tokenizer = js.native
  /**
    * Function sets the tokenizer's width in pixels
    * @param nWidth the new width in pixels
    */
  def setPixelWidth(nWidth: Double): Unit = js.native
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the Tokenizer.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Tokenizer = js.native
}

