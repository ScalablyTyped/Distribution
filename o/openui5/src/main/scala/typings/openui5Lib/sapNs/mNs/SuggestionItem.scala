package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.SuggestionItem")
@js.native
class SuggestionItem protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new SuggestionItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>description</code>.Additional text of type string, optionally
    * to be displayed along with this item.Default value is <code></code>.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): java.lang.String = js.native
  /**
    * Gets current value of property <code>icon</code>.The icon belonging to this list item instance.This
    * can be an URI to an image or an icon font URI.Default value is <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): java.lang.String = js.native
  /**
    * Return suggestion text. By default, it is the value of the <code>text</code> property.Subclasses may
    * override this function.
    * @returns suggestion text.
    */
  def getSuggestionText(): java.lang.String = js.native
  /**
    * Produces the HTML of the suggestion item and writes it to render-output-buffer.Subclasses may
    * override this function.
    * @param oRenderManager The <code>RenderManager</code>
    * @param oItem The item which should be rendered
    * @param sSearch The search text that should be emphasized
    * @param bSelected The item is selected
    */
  def render(
    oRenderManager: openui5Lib.sapNs.uiNs.coreNs.RenderManager,
    oItem: SuggestionItem,
    sSearch: java.lang.String,
    bSelected: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Sets a new value for property <code>description</code>.Additional text of type string, optionally to
    * be displayed along with this item.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: java.lang.String): SuggestionItem = js.native
  /**
    * Sets a new value for property <code>icon</code>.The icon belonging to this list item instance.This
    * can be an URI to an image or an icon font URI.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: java.lang.String): SuggestionItem = js.native
}

