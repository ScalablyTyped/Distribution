package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarSpacer extends Control {
  
  /**
    * Flexible Spacer Class Name
    */
  var flexClass: js.Any = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the horizontal space.Note:
    * Empty("") value makes the space flexible which means it covers the remaining space between toolbar
    * items.This feature can be used to push next item to the edge of the toolbar.Default value is
    * <code></code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the horizontal space.Note:
    * Empty("") value makes the space flexible which means it covers the remaining space between toolbar
    * items.This feature can be used to push next item to the edge of the toolbar.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): ToolbarSpacer = js.native
}
