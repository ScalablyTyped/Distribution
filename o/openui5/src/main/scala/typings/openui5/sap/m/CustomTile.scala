package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.CustomTile")
@js.native
class CustomTile protected () extends Tile {
  /**
    * Constructor for a new CustomTile.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Destroys the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): CustomTile = js.native
  /**
    * Gets content of aggregation <code>content</code>.Defines the content of the CustomTile.
    */
  def getContent(): Control = js.native
  /**
    * Sets the aggregated <code>content</code>.
    * @param oContent The content to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContent(oContent: Control): CustomTile = js.native
}

