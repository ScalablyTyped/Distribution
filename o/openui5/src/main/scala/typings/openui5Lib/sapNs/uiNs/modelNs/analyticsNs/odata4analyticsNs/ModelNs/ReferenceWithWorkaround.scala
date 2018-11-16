package typings
package openui5Lib.sapNs.uiNs.modelNs.analyticsNs.odata4analyticsNs.ModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround")
@js.native
class ReferenceWithWorkaround protected () extends js.Object {
  /**
                 * Create a reference to an OData model having certain workarounds activated. Aworkaround is an
                 * implementation that changes the standard behavior of the APIto overcome some gap or limitation in
                 * the OData provider. The workaroundimplementation can be conditionally activated by passing the
                 * identifier inthe contructor.Known workaround identifiers are:<li>"CreateLabelsFromTechnicalNames" -
                 * If a property has no label text, itgets generated from the property
                 * name.</li><li>"IdentifyTextPropertiesByName" -If a dimension property has no text andanother
                 * property with the same name and an appended "Name", "Text" etc.exists, they are linked via
                 * annotation.</li>
                 * @param oModel holding a reference to the OData model, obtained           by
                 * odata4analytics.Model.ReferenceByModel or by           sap.odata4analytics.Model.ReferenceByURI.
                 * @param aWorkaroundID listing all workarounds to be applied.
                */
  def this(oModel: js.Any, aWorkaroundID: js.Array[java.lang.String]) = this()
}

