package typings.openui5.sapNs.uiNs.coreNs.utilNs.serializerNs

import typings.openui5.sapNs.uiNs.baseNs.EventProvider
import typings.openui5.sapNs.uiNs.coreNs.mvcNs.XMLView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.serializer.XMLViewSerializer")
@js.native
class XMLViewSerializer protected () extends EventProvider {
  /**
    * XML view serializer class. Serializes a given view.
    * @param oView the view to serialize
    * @param oWindow the window object. Default is the window object the instance of the serializer is
    * running in
    * @param sDefaultXmlNamespace defines the default XML namespace
    * @param fnGetControlId delegate function which returns the control id
    * @param fnGetEventHandlerName delegate function which returns the event handler name
    */
  def this(
    oView: XMLView,
    oWindow: js.Any,
    sDefaultXmlNamespace: String,
    fnGetControlId: js.Any,
    fnGetEventHandlerName: js.Any
  ) = this()
}

