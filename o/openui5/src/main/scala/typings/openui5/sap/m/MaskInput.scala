package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskInput extends InputBase {
  
  /**
    * Gets a replacement string for the character being placed in the input.Subclasses may override this
    * method in order to get some additional behavior. For instance, switching current inputcharacter with
    * other for time input purposes. As an example, if the user enters "2" (in 12-hour format), the
    * consumer may usethis method to replace the input from "2" to "02".
    * @param sChar The current character from the input
    * @param iPlacePosition The position the character should occupy
    * @param sCurrentInputValue The value currently inside the input field (may differ from the property
    * value)
    * @returns A string that replaces the character
    */
  def _feedReplaceChar(sChar: String, iPlacePosition: Double, sCurrentInputValue: String): String = js.native
  
  /**
    * Verifies whether a character at a given position is allowed according to its mask rule.
    * @param sChar The character
    * @param iIndex The position of the character
    */
  def _isCharAllowed(sChar: String, iIndex: Double): Unit = js.native
  
  /**
    * Adds some rule to the aggregation <code>rules</code>.
    * @param oRule the rule to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addRule(oRule: MaskInputRule): MaskInput = js.native
  
  /**
    * Destroys all the rules in the aggregation <code>rules</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyRules(): MaskInput = js.native
  
  /**
    * Gets current value of property <code>mask</code>.Mask defined by its characters type (respectively,
    * by its length).You should consider the following important facts:1. The mask characters normally
    * correspond to an existing rule (one rule per unique char).Characters which don't, are considered
    * immutable characters (for example, the mask '2099', where '9' corresponds to a rulefor digits, has
    * the characters '2' and '0' as immutable).2. Adding a rule corresponding to the
    * <code>placeholderSymbol</code> is not recommended and would lead to an unpredictable behavior.3. You
    * can use the special escape character '^' called "Caret" prepending a rule character to make it
    * immutable.Use the double escape '^^' if you want to make use of the escape character as a immutable
    * one.
    * @returns Value of property <code>mask</code>
    */
  def getMask(): String = js.native
  
  /**
    * Gets current value of property <code>placeholderSymbol</code>.Defines a placeholder symbol. Shown at
    * the position where there is no user input yet.Default value is <code>_</code>.
    * @returns Value of property <code>placeholderSymbol</code>
    */
  def getPlaceholderSymbol(): String = js.native
  
  /**
    * Gets content of aggregation <code>rules</code>.A list of validation rules (one rule per mask
    * character).
    */
  def getRules(): js.Array[MaskInputRule] = js.native
  
  /**
    * Checks for the provided <code>sap.m.MaskInputRule</code> in the aggregation <code>rules</code>.and
    * returns its index if found or -1 otherwise.
    * @param oRule The rule whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfRule(oRule: MaskInputRule): Double = js.native
  
  /**
    * Inserts a rule into the aggregation <code>rules</code>.
    * @param oRule the rule to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the rule should be inserted at; for             a
    * negative value of <code>iIndex</code>, the rule is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the rule is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertRule(oRule: MaskInputRule, iIndex: Double): MaskInput = js.native
  
  /**
    * Removes all the controls from the aggregation <code>rules</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllRules(): js.Array[MaskInputRule] = js.native
  
  def removeRule(vRule: String): MaskInputRule = js.native
  /**
    * Removes a rule from the aggregation <code>rules</code>.
    * @param vRule The rule to remove or its index or id
    * @returns The removed rule or <code>null</code>
    */
  def removeRule(vRule: Double): MaskInputRule = js.native
  def removeRule(vRule: MaskInputRule): MaskInputRule = js.native
}
