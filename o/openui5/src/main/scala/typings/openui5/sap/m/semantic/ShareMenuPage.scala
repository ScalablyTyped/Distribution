package typings.openui5.sap.m.semantic

import typings.openui5.sap.m.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareMenuPage extends SemanticPage {
  /**
    * Adds some customShareMenuContent to the aggregation <code>customShareMenuContent</code>.
    * @param oCustomShareMenuContent the customShareMenuContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addCustomShareMenuContent(oCustomShareMenuContent: Button): ShareMenuPage = js.native
  /**
    * Destroys all the customShareMenuContent in the aggregation <code>customShareMenuContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomShareMenuContent(): ShareMenuPage = js.native
  /**
    * Gets content of aggregation <code>customShareMenuContent</code>.Custom share menu buttons
    */
  def getCustomShareMenuContent(): js.Array[Button] = js.native
  /**
    * Checks for the provided <code>sap.m.Button</code> in the aggregation
    * <code>customShareMenuContent</code>.and returns its index if found or -1 otherwise.
    * @param oCustomShareMenuContent The customShareMenuContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfCustomShareMenuContent(oCustomShareMenuContent: Button): Double = js.native
  /**
    * Inserts a customShareMenuContent into the aggregation <code>customShareMenuContent</code>.
    * @param oCustomShareMenuContent the customShareMenuContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the customShareMenuContent should be inserted at; for  
    *           a negative value of <code>iIndex</code>, the customShareMenuContent is inserted at
    * position 0; for a value             greater than the current size of the aggregation, the
    * customShareMenuContent is inserted at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertCustomShareMenuContent(oCustomShareMenuContent: Button, iIndex: Double): ShareMenuPage = js.native
  /**
    * Removes all the controls from the aggregation <code>customShareMenuContent</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllCustomShareMenuContent(): js.Array[Button] = js.native
  def removeCustomShareMenuContent(vCustomShareMenuContent: String): Button = js.native
  /**
    * Removes a customShareMenuContent from the aggregation <code>customShareMenuContent</code>.
    * @param vCustomShareMenuContent The customShareMenuContent to remove or its index or id
    * @returns The removed customShareMenuContent or <code>null</code>
    */
  def removeCustomShareMenuContent(vCustomShareMenuContent: Double): Button = js.native
  def removeCustomShareMenuContent(vCustomShareMenuContent: Button): Button = js.native
}

