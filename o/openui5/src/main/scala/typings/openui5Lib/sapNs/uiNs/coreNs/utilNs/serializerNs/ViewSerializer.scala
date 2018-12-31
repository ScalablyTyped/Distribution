package typings
package openui5Lib.sapNs.uiNs.coreNs.utilNs.serializerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.serializer.ViewSerializer")
@js.native
class ViewSerializer protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
    * View serializer class. Iterates over all controls and serializes all found views by calling the
    * corresponding view type serializer.
    * @param oRootControl the root control to serialize
    * @param oWindow the window object. Default is the window object the instance of the serializer is
    * running in.
    * @param sDefaultXmlNamespace defines the default xml namespace
    */
  def this(oRootControl: openui5Lib.sapNs.uiNs.coreNs.Control) = this()
  def this(oRootControl: openui5Lib.sapNs.uiNs.coreNs.UIArea) = this()
  def this(oRootControl: openui5Lib.sapNs.uiNs.coreNs.Control, oWindow: js.Any) = this()
  def this(oRootControl: openui5Lib.sapNs.uiNs.coreNs.UIArea, oWindow: js.Any) = this()
  def this(oRootControl: openui5Lib.sapNs.uiNs.coreNs.Control, oWindow: js.Any, sDefaultXmlNamespace: java.lang.String) = this()
  def this(oRootControl: openui5Lib.sapNs.uiNs.coreNs.UIArea, oWindow: js.Any, sDefaultXmlNamespace: java.lang.String) = this()
}

