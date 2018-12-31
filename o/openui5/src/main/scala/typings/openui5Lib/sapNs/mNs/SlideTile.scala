package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.SlideTile")
@js.native
class SlideTile protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new sap.m.SlideTile control.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some tile to the aggregation <code>tiles</code>.
    * @param oTile the tile to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addTile(oTile: GenericTile): SlideTile = js.native
  /**
    * Destroys all the tiles in the aggregation <code>tiles</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyTiles(): SlideTile = js.native
  /**
    * Gets current value of property <code>displayTime</code>.The time of the slide display in
    * milliseconds.Default value is <code>5000</code>.
    * @returns Value of property <code>displayTime</code>
    */
  def getDisplayTime(): scala.Double = js.native
  /**
    * Gets content of aggregation <code>tiles</code>.The set of Generic Tiles to be shown in the control.
    */
  def getTiles(): js.Array[GenericTile] = js.native
  /**
    * Gets current value of property <code>transitionTime</code>.The time of the slide changing in
    * milliseconds.Default value is <code>500</code>.
    * @returns Value of property <code>transitionTime</code>
    */
  def getTransitionTime(): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.m.GenericTile</code> in the aggregation <code>tiles</code>.and
    * returns its index if found or -1 otherwise.
    * @param oTile The tile whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfTile(oTile: GenericTile): scala.Double = js.native
  /**
    * Inserts a tile into the aggregation <code>tiles</code>.
    * @param oTile the tile to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the tile should be inserted at; for             a
    * negative value of <code>iIndex</code>, the tile is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the tile is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertTile(oTile: GenericTile, iIndex: scala.Double): SlideTile = js.native
  /**
    * Removes all the controls from the aggregation <code>tiles</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllTiles(): js.Array[GenericTile] = js.native
  def removeTile(vTile: java.lang.String): GenericTile = js.native
  def removeTile(vTile: GenericTile): GenericTile = js.native
  /**
    * Removes a tile from the aggregation <code>tiles</code>.
    * @param vTile The tile to remove or its index or id
    * @returns The removed tile or <code>null</code>
    */
  def removeTile(vTile: scala.Double): GenericTile = js.native
  /**
    * Sets a new value for property <code>displayTime</code>.The time of the slide display in
    * milliseconds.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>5000</code>.
    * @param iDisplayTime New value for property <code>displayTime</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayTime(iDisplayTime: scala.Double): SlideTile = js.native
  /**
    * Sets a new value for property <code>transitionTime</code>.The time of the slide changing in
    * milliseconds.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>500</code>.
    * @param iTransitionTime New value for property <code>transitionTime</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTransitionTime(iTransitionTime: scala.Double): SlideTile = js.native
}

