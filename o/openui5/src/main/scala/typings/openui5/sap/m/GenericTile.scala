package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTile
  extends StObject
     with Control {
  
  /**
    * Adds some tileContent to the aggregation <code>tileContent</code>.
    * @param oTileContent the tileContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addTileContent(oTileContent: TileContent): GenericTile = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.GenericTile</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.GenericTile</code> itself.The event is fired when the user chooses the tile.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.GenericTile</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): GenericTile = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): GenericTile = js.native
  
  /**
    * Destroys the icon in the aggregation <code>icon</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyIcon(): GenericTile = js.native
  
  /**
    * Destroys all the tileContent in the aggregation <code>tileContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyTileContent(): GenericTile = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.GenericTile</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): GenericTile = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): GenericTile = js.native
  
  /**
    * Gets current value of property <code>backgroundImage</code>.The URI of the background image.
    * @returns Value of property <code>backgroundImage</code>
    */
  def getBackgroundImage(): js.Any = js.native
  
  /**
    * Gets current value of property <code>failedText</code>.The message that appears when the control is
    * in the Failed state.
    * @returns Value of property <code>failedText</code>
    */
  def getFailedText(): String = js.native
  
  /**
    * Gets current value of property <code>frameType</code>.The frame type: 1x1 or 2x1.Default value is
    * <code>library.FrameType.OneByOne</code>.
    * @returns Value of property <code>frameType</code>
    */
  def getFrameType(): FrameType = js.native
  
  /**
    * Gets current value of property <code>header</code>.The header of the tile.
    * @returns Value of property <code>header</code>
    */
  def getHeader(): String = js.native
  
  /**
    * Gets current value of property <code>headerImage</code>.The image to be displayed as a graphical
    * element within the header. This can be an image or an icon from the icon font.
    * @returns Value of property <code>headerImage</code>
    */
  def getHeaderImage(): js.Any = js.native
  
  /**
    * Gets content of aggregation <code>icon</code>.An icon or image to be displayed in the control.This
    * aggregation is deprecated since version 1.36.0, to display an icon or image use sap.m.TileContent
    * control instead.
    */
  def getIcon(): Control = js.native
  
  /**
    * Gets current value of property <code>imageDescription</code>.Description of a header image that is
    * used in the tooltip.
    * @returns Value of property <code>imageDescription</code>
    */
  def getImageDescription(): String = js.native
  
  /**
    * Gets current value of property <code>mode</code>.The mode of the GenericTile.Default value is
    * <code>library.GenericTileMode.ContentMode</code>.
    * @returns Value of property <code>mode</code>
    */
  def getMode(): GenericTileMode = js.native
  
  /**
    * Gets current value of property <code>size</code>.The size of the tile. If not set, then the default
    * size is applied based on the device.Default value is <code>Auto</code>.
    * @returns Value of property <code>size</code>
    */
  def getSize(): Size = js.native
  
  /**
    * Gets current value of property <code>state</code>.The load status.Default value is
    * <code>Loaded</code>.
    * @returns Value of property <code>state</code>
    */
  def getState(): LoadState = js.native
  
  /**
    * Gets current value of property <code>subheader</code>.The subheader of the tile.
    * @returns Value of property <code>subheader</code>
    */
  def getSubheader(): String = js.native
  
  /**
    * Gets content of aggregation <code>tileContent</code>.The switchable view that depends on the tile
    * type.
    */
  def getTileContent(): js.Array[TileContent] = js.native
  
  /**
    * Checks for the provided <code>sap.m.TileContent</code> in the aggregation
    * <code>tileContent</code>.and returns its index if found or -1 otherwise.
    * @param oTileContent The tileContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfTileContent(oTileContent: TileContent): Double = js.native
  
  /**
    * Inserts a tileContent into the aggregation <code>tileContent</code>.
    * @param oTileContent the tileContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the tileContent should be inserted at; for            
    * a negative value of <code>iIndex</code>, the tileContent is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the tileContent is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertTileContent(oTileContent: TileContent, iIndex: Double): GenericTile = js.native
  
  /**
    * Removes all the controls from the aggregation <code>tileContent</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllTileContent(): js.Array[TileContent] = js.native
  
  def removeTileContent(vTileContent: String): TileContent = js.native
  /**
    * Removes a tileContent from the aggregation <code>tileContent</code>.
    * @param vTileContent The tileContent to remove or its index or id
    * @returns The removed tileContent or <code>null</code>
    */
  def removeTileContent(vTileContent: Double): TileContent = js.native
  def removeTileContent(vTileContent: TileContent): TileContent = js.native
  
  /**
    * Sets a new value for property <code>backgroundImage</code>.The URI of the background image.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sBackgroundImage New value for property <code>backgroundImage</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundImage(sBackgroundImage: js.Any): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>failedText</code>.The message that appears when the control is
    * in the Failed state.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sFailedText New value for property <code>failedText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFailedText(sFailedText: String): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>frameType</code>.The frame type: 1x1 or 2x1.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>library.FrameType.OneByOne</code>.
    * @param sFrameType New value for property <code>frameType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFrameType(sFrameType: FrameType): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>header</code>.The header of the tile.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sHeader New value for property <code>header</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeader(sHeader: String): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>headerImage</code>.The image to be displayed as a graphical
    * element within the header. This can be an image or an icon from the icon font.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sHeaderImage New value for property <code>headerImage</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderImage(sHeaderImage: js.Any): GenericTile = js.native
  
  /**
    * Sets the aggregated <code>icon</code>.
    * @param oIcon The icon to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(oIcon: Control): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>imageDescription</code>.Description of a header image that is
    * used in the tooltip.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sImageDescription New value for property <code>imageDescription</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setImageDescription(sImageDescription: String): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>mode</code>.The mode of the GenericTile.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>library.GenericTileMode.ContentMode</code>.
    * @param sMode New value for property <code>mode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMode(sMode: GenericTileMode): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>size</code>.The size of the tile. If not set, then the default
    * size is applied based on the device.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Auto</code>.
    * @param sSize New value for property <code>size</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSize(sSize: Size): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>state</code>.The load status.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Loaded</code>.
    * @param sState New value for property <code>state</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setState(sState: LoadState): GenericTile = js.native
  
  /**
    * Sets a new value for property <code>subheader</code>.The subheader of the tile.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sSubheader New value for property <code>subheader</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSubheader(sSubheader: String): GenericTile = js.native
}
