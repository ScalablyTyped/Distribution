package typings
package openui5Lib.sapNs.uiNs.coreNs.searchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.search.SearchProvider")
@js.native
class SearchProvider protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
    * Constructor for a new search/SearchProvider.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>icon</code>.Icon of the Search Provider
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>icon</code>.Icon of the Search ProviderWhen called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: java.lang.String): SearchProvider = js.native
  /**
    * Call this function to get suggest values from the search provider.The given callback function is
    * called with the suggest value (type 'string', 1st parameter)and an array of the suggestions (type
    * '[string]', 2nd parameter).
    * @param sValue The value for which suggestions are requested.
    * @param fnCallback The callback function which is called when the suggestions are available.
    */
  def suggest(sValue: java.lang.String, fnCallback: js.Any): scala.Unit = js.native
}

