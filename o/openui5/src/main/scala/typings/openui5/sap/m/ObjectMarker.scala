package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMarker extends Control {
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): ObjectMarker = js.native
  
  /**
    * Gets current value of property <code>type</code>.Sets one of the predefined types.<br><b>Note</b>:
    * If the <code>visibility</code> property is not specified explicitly, every <code>type</code> comes
    * with predefined one as follows:<ul>                <li>For <code>Flagged</code> and
    * <code>Favorite</code> the icon is visible and the text is not displayed</li>                <li>For
    * <code>Draft</code> the text is visible and the icon is not displayed</li>                <li>For
    * <code>Locked</code> and <code>Unsaved</code> - on screens larger than 600px both icon and text are
    * visible, otherwise only the icon</li></ul>
    * @returns Value of property <code>type</code>
    */
  def getType(): ObjectMarkerType = js.native
  
  /**
    * Gets current value of property <code>visibility</code>.Sets one of the visibility states.Visibility
    * states are as follows:<ul>                <li><code>IconOnly</code> - displays only icon, regardless
    * of the screen size</li>                <li><code>TextOnly</code> - displays only text, regardless of
    * the screen size</li>                <li><code>IconAndText</code> - displays both icon and text,
    * regardless of the screen size</li></ul>
    * @returns Value of property <code>visibility</code>
    */
  def getVisibility(): ObjectMarkerVisibility = js.native
}
