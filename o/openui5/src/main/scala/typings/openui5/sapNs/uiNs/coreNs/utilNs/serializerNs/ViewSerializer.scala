package typings.openui5.sapNs.uiNs.coreNs.utilNs.serializerNs

import typings.openui5.sapNs.uiNs.baseNs.EventProvider
import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.UIArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.serializer.ViewSerializer")
@js.native
class ViewSerializer protected () extends EventProvider {
  /**
    * View serializer class. Iterates over all controls and serializes all found views by calling the
    * corresponding view type serializer.
    * @param oRootControl the root control to serialize
    * @param oWindow the window object. Default is the window object the instance of the serializer is
    * running in.
    * @param sDefaultXmlNamespace defines the default xml namespace
    */
  def this(oRootControl: Control) = this()
  def this(oRootControl: UIArea) = this()
  def this(oRootControl: Control, oWindow: js.Any) = this()
  def this(oRootControl: UIArea, oWindow: js.Any) = this()
  def this(oRootControl: Control, oWindow: js.Any, sDefaultXmlNamespace: String) = this()
  def this(oRootControl: UIArea, oWindow: js.Any, sDefaultXmlNamespace: String) = this()
}

