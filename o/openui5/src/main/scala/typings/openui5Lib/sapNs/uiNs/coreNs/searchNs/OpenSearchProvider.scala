package typings
package openui5Lib.sapNs.uiNs.coreNs.searchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.search.OpenSearchProvider")
@js.native
class OpenSearchProvider protected () extends SearchProvider {
  /**
             * Constructor for a new search/OpenSearchProvider.Accepts an object literal <code>mSettings</code>
             * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
             * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
             * settings object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String) = this()
  /**
             * Constructor for a new search/OpenSearchProvider.Accepts an object literal <code>mSettings</code>
             * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
             * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
             * settings object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
             * Gets current value of property <code>suggestType</code>.The type of data which is provided by the
             * given suggestUrl: either 'json' or 'xml'.Default value is <code>json</code>.
             * @returns Value of property <code>suggestType</code>
            */
  def getSuggestType(): java.lang.String = js.native
  /**
             * Gets current value of property <code>suggestUrl</code>.The URL for suggestions of the search
             * provider. As placeholder for the concrete search queries '{searchTerms}' must be used. For cross
             * domain requests maybe a proxy must be used.
             * @returns Value of property <code>suggestUrl</code>
            */
  def getSuggestUrl(): js.Any = js.native
  /**
             * Sets a new value for property <code>suggestType</code>.The type of data which is provided by the
             * given suggestUrl: either 'json' or 'xml'.When called with a value of <code>null</code> or
             * <code>undefined</code>, the default value of the property will be restored.Default value is
             * <code>json</code>.
             * @param sSuggestType New value for property <code>suggestType</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setSuggestType(sSuggestType: java.lang.String): OpenSearchProvider = js.native
  /**
             * Sets a new value for property <code>suggestUrl</code>.The URL for suggestions of the search
             * provider. As placeholder for the concrete search queries '{searchTerms}' must be used. For cross
             * domain requests maybe a proxy must be used.When called with a value of <code>null</code> or
             * <code>undefined</code>, the default value of the property will be restored.
             * @param sSuggestUrl New value for property <code>suggestUrl</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setSuggestUrl(sSuggestUrl: js.Any): OpenSearchProvider = js.native
}

