package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvisibleText extends Control {
  
  /**
    * Gets current value of property <code>text</code>.The text of the InvisibleText.Default value is
    * <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setBusy(): js.Any = js.native
  
  /**
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setBusyIndicatorDelay(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>text</code>.The text of the InvisibleText.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): InvisibleText = js.native
  
  /**
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setTooltip(): js.Any = js.native
  
  /**
    * @returns Returns <code>this</code> to allow method chaining
    */
  def setVisible(): js.Any = js.native
  
  /**
    * Adds <code>this</code> control into the static, hidden area UI area container.
    * @returns Returns <code>this</code> to allow method chaining
    */
  def toStatic(): js.Any = js.native
}
