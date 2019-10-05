package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.MultiInput")
@js.native
class MultiInput protected () extends Input {
  /**
    * Constructor for a new MultiInput.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some token to the aggregation <code>tokens</code>.
    * @param oToken the token to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addToken(oToken: Token): MultiInput = js.native
  /**
    * Function adds an validation callback called before any new token gets added to the tokens
    * aggregation
    * @param fValidator undefined
    */
  def addValidator(fValidator: js.Any): Unit = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tokenChange</code> event of this
    * <code>sap.m.MultiInput</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.MultiInput</code> itself.Fired when the tokens aggregation changed (add / remove token)
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MultiInput</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTokenChange(oData: js.Any, fnFunction: js.Any): MultiInput = js.native
  def attachTokenChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MultiInput = js.native
  /**
    * Close multi-line MultiInput in multi-line mode
    * @since 1.28
    */
  def closeMultiLine(): Unit = js.native
  /**
    * Destroys all the tokens in the aggregation <code>tokens</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyTokens(): MultiInput = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tokenChange</code> event of this
    * <code>sap.m.MultiInput</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTokenChange(fnFunction: js.Any, oListener: js.Any): MultiInput = js.native
  /**
    * Fires event <code>tokenChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>type</code> of type <code>string</code>Type of tokenChange event.There are
    * four TokenChange types: "added", "removed", "removedAll", "tokensChanged".Use
    * Tokenizer.TokenChangeType.Added for "added",	Tokenizer.TokenChangeType.Removed for "removed",
    * Tokenizer.TokenChangeType.RemovedAll for "removedAll" and Tokenizer.TokenChangeType.TokensChanged
    * for "tokensChanged".</li><li><code>token</code> of type <code>sap.m.Token</code>The added token or
    * removed token.This parameter is used when tokenChange type is "added" or
    * "removed".</li><li><code>tokens</code> of type <code>sap.m.Token[]</code>The array of removed
    * tokens.This parameter is used when tokenChange type is
    * "removedAll".</li><li><code>addedTokens</code> of type <code>sap.m.Token[]</code>The array of tokens
    * that are added.This parameter is used when tokenChange type is
    * "tokenChanged".</li><li><code>removedTokens</code> of type <code>sap.m.Token[]</code>The array of
    * tokens that are removed.This parameter is used when tokenChange type is "tokenChanged".</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTokenChange(mArguments: js.Any): MultiInput = js.native
  /**
    * Gets current value of property <code>enableMultiLineMode</code>.If set to true, the MultiInput will
    * be displayed in multi-line display mode.In multi-line display mode, all tokens can be fully viewed
    * and easily edited in the MultiInput.The default value is false.Default value is <code>false</code>.
    * @since 1.28
    * @returns Value of property <code>enableMultiLineMode</code>
    */
  def getEnableMultiLineMode(): Boolean = js.native
  /**
    * Gets current value of property <code>maxTokens</code>.The max number of tokens that is allowed in
    * MultiInput.
    * @since 1.36
    * @returns Value of property <code>maxTokens</code>
    */
  def getMaxTokens(): Double = js.native
  /**
    * Function returns domref which acts as reference point for the opening suggestion menu
    * @returns the domref at which to open the suggestion menu
    */
  def getPopupAnchorDomRef(): js.Any = js.native
  /**
    * Gets content of aggregation <code>tokens</code>.The currently displayed tokens
    */
  def getTokens(): js.Array[Token] = js.native
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
  def insertToken(oToken: Token, iIndex: Double): MultiInput = js.native
  /**
    * Focus is on MultiInput
    * @param oEvent undefined
    */
  def onfocusin(oEvent: js.Any): Unit = js.native
  /**
    * When press ESC, deselect all tokens and all texts
    * @param oEvent undefined
    */
  def onsapescape(oEvent: js.Any): Unit = js.native
  /**
    * Expand multi-line MultiInput in multi-line mode
    * @since 1.28
    */
  def openMultiLine(): Unit = js.native
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
    * Setter for property <code>enableMultiLineMode</code>.
    * @since 1.28
    */
  def setEnableMultiLineMode(): Unit = js.native
  /**
    * Sets a new value for property <code>maxTokens</code>.The max number of tokens that is allowed in
    * MultiInput.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @since 1.36
    * @param iMaxTokens New value for property <code>maxTokens</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxTokens(iMaxTokens: Double): MultiInput = js.native
  /**
    * Function sets an array of tokens, existing tokens will get overridden
    * @param aTokens the new token set
    */
  def setTokens(aTokens: js.Array[Token]): Unit = js.native
}

