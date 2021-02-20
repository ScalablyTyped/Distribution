package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSelect extends Select {
  
  /**
    * Adds some button into the association <code>buttons</code>.
    * @param vButton the buttons to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addButton(vButton: js.Any): ActionSelect = js.native
  def addButton(vButton: Button): ActionSelect = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>buttons</code>.
    */
  def getButtons(): js.Array[_] = js.native
  
  /**
    * Remove all buttons from the ActionSelect.
    * @returns An array with the ids of the removed elements (might be empty).
    */
  def removeAllButtons(): js.Array[String] = js.native
  
  def removeButton(vButton: String): String = js.native
  /**
    * Button to be removed from the ActionSelect content.
    * @param vButton The button to remove or its index or id.
    * @returns The id of the removed button or null.
    */
  def removeButton(vButton: Double): String = js.native
  def removeButton(vButton: Button): String = js.native
}
