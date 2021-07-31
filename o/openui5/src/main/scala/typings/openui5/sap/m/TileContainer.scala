package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileContainer
  extends StObject
     with Control {
  
  /**
    * Adds a Tile to the end of the tiles collection.
    * @param oTile The tile to add
    * @returns this pointer for chaining
    */
  def addTile(oTile: Tile): TileContainer = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tileAdd</code> event of this
    * <code>sap.m.TileContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TileContainer</code> itself.Fires when a Tile is added.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TileContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTileAdd(oData: js.Any, fnFunction: js.Any): TileContainer = js.native
  def attachTileAdd(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TileContainer = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tileDelete</code> event of this
    * <code>sap.m.TileContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TileContainer</code> itself.Fires if a Tile is deleted in Edit mode.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TileContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTileDelete(oData: js.Any, fnFunction: js.Any): TileContainer = js.native
  def attachTileDelete(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TileContainer = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>tileMove</code> event of this
    * <code>sap.m.TileContainer</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.TileContainer</code> itself.Fires if a Tile is moved.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.TileContainer</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTileMove(oData: js.Any, fnFunction: js.Any): TileContainer = js.native
  def attachTileMove(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TileContainer = js.native
  
  /**
    * Deletes a Tile.
    * @param oTile The tile to move
    * @returns this pointer for chaining
    */
  def deleteTile(oTile: Tile): TileContainer = js.native
  
  /**
    * Destroys all the tiles in the aggregation <code>tiles</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyTiles(): TileContainer = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tileAdd</code> event of this
    * <code>sap.m.TileContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTileAdd(fnFunction: js.Any, oListener: js.Any): TileContainer = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tileDelete</code> event of this
    * <code>sap.m.TileContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTileDelete(fnFunction: js.Any, oListener: js.Any): TileContainer = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>tileMove</code> event of this
    * <code>sap.m.TileContainer</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTileMove(fnFunction: js.Any, oListener: js.Any): TileContainer = js.native
  
  /**
    * Fires event <code>tileAdd</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTileAdd(mArguments: js.Any): TileContainer = js.native
  
  /**
    * Fires event <code>tileDelete</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>tile</code> of type <code>sap.m.Tile</code>The deleted Tile.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTileDelete(mArguments: js.Any): TileContainer = js.native
  
  /**
    * Fires event <code>tileMove</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>tile</code> of type <code>sap.m.Tile</code>The Tile that has been
    * moved.</li><li><code>newIndex</code> of type <code>int</code>The new index of the Tile in the tiles
    * aggregation.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTileMove(mArguments: js.Any): TileContainer = js.native
  
  /**
    * Gets current value of property <code>allowAdd</code>.Determines whether the user is allowed to add
    * Tiles in Edit mode (editable = true).
    * @returns Value of property <code>allowAdd</code>
    */
  def getAllowAdd(): Boolean = js.native
  
  /**
    * Gets current value of property <code>editable</code>.Determines whether the TileContainer is
    * editable so you can move, delete or add tiles.
    * @returns Value of property <code>editable</code>
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Gets current value of property <code>height</code>.Defines the height of the TileContainer in
    * px.Default value is <code>100%</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  
  /**
    * Returns the index of the first Tile visible in the current page.
    * @returns The index of the first Tile that is visible in the current page
    */
  def getPageFirstTileIndex(): Double = js.native
  
  /**
    * Gets content of aggregation <code>tiles</code>.The Tiles to be displayed by the TileContainer.
    */
  def getTiles(): js.Array[Tile] = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the TileContainer in
    * px.Default value is <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Checks for the provided <code>sap.m.Tile</code> in the aggregation <code>tiles</code>.and returns
    * its index if found or -1 otherwise.
    * @param oTile The tile whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfTile(oTile: Tile): Double = js.native
  
  /**
    * Inserts a Tile to the given index.
    * @param oTile The Tile to insert
    * @param iIndex The new Tile position in the tiles aggregation
    * @returns this pointer for chaining
    */
  def insertTile(oTile: Tile, iIndex: Double): TileContainer = js.native
  
  /**
    * Moves a given Tile to the given index.
    * @param vTile The tile to move
    * @param iNewIndex The new Tile position in the tiles aggregation
    * @returns this pointer for chaining
    */
  def moveTile(vTile: Tile, iNewIndex: Double): TileContainer = js.native
  
  /**
    * Removes all the controls from the aggregation <code>tiles</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllTiles(): js.Array[Tile] = js.native
  
  def removeTile(vTile: String): Tile = js.native
  /**
    * Removes a tile from the aggregation <code>tiles</code>.
    * @param vTile The tile to remove or its index or id
    * @returns The removed tile or <code>null</code>
    */
  def removeTile(vTile: Double): Tile = js.native
  def removeTile(vTile: Tile): Tile = js.native
  
  def scrollIntoView(vTile: Double, bAnimated: Boolean): Unit = js.native
  /**
    * Scrolls to the page where the given Tile or tile index is included.Optionally this can be done
    * animated or not. With IE9 the scroll is never animated.
    * @param vTile The Tile or tile index to be scrolled into view
    * @param bAnimated Whether the scroll should be animated
    */
  def scrollIntoView(vTile: Tile, bAnimated: Boolean): Unit = js.native
  
  /**
    * Scrolls one page to the left.
    */
  def scrollLeft(): Unit = js.native
  
  /**
    * Scrolls one page to the right.
    */
  def scrollRight(): Unit = js.native
  
  /**
    * Sets a new value for property <code>allowAdd</code>.Determines whether the user is allowed to add
    * Tiles in Edit mode (editable = true).When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param bAllowAdd New value for property <code>allowAdd</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAllowAdd(bAllowAdd: Boolean): TileContainer = js.native
  
  /**
    * Sets the editable property to the TileContainer, allowing to move icons.This is currently also set
    * with a long tap.
    * @param bValue Whether the container is in edit mode or not
    * @returns this pointer for chaining
    */
  def setEditable(bValue: Boolean): TileContainer = js.native
  
  /**
    * Sets a new value for property <code>height</code>.Defines the height of the TileContainer in px.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>100%</code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): TileContainer = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the TileContainer in px.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): TileContainer = js.native
}
