package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Fragment
import typings.openui5.sap.ui.core.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.extensionpoint")
@js.native
object extensionpoint extends js.Object {
  //  Creates 0.
  def apply(oContainer: js.Any, sExtName: String): Unit = js.native
  def apply(oContainer: js.Any, sExtName: String, fnCreateDefaultContent: js.Any): Unit = js.native
  def apply(oContainer: js.Any, sExtName: String, fnCreateDefaultContent: js.Any, oTargetControl: js.Any): Unit = js.native
  def apply(
    oContainer: js.Any,
    sExtName: String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: js.Any,
    sAggregationName: String
  ): Unit = js.native
  def apply(oContainer: Fragment, sExtName: String): js.Array[Control] = js.native
  def apply(oContainer: Fragment, sExtName: String, fnCreateDefaultContent: js.Any): js.Array[Control] = js.native
  def apply(oContainer: Fragment, sExtName: String, fnCreateDefaultContent: js.Any, oTargetControl: Control): js.Array[Control] = js.native
  def apply(
    oContainer: Fragment,
    sExtName: String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: Control,
    sAggregationName: String
  ): js.Array[Control] = js.native
  /**
    * Creates 0..n UI5 controls from an ExtensionPoint.One control if the ExtensionPoint is e.g. filled
    * with a View, zero for ExtensionPoints without configured extension andn controls for multi-root
    * Fragments as extension.In JSViews, this function allows both JSON notation in aggregation content as
    * well as adding an extension point to an aggregation after the target controlhas already been
    * instantiated. In the latter case the optional parameters oTargetControls and oTargetAggregation need
    * to be specified.
    * @param oContainer The view or fragment containing the extension point
    * @param sExtName The extensionName used to identify the extension point in the customizing
    * @param fnCreateDefaultContent Optional callback function creating default content, returning an
    * Array of controls. It is executed            when there's no customizing, if not provided, no default content
    * will be rendered.
    * @param oTargetControl Optional - use this parameter to attach the extension point to a particular
    * aggregation
    * @param sAggregationName Optional - if provided along with oTargetControl, the extension point
    * content is added to this particular aggregation at oTargetControl,            if not given, but an
    * oTargetControl is still present, the function will attempt to add the extension point to the default
    * aggregation of oTargetControl.            If no oTargetControl is provided, sAggregationName will also be
    * ignored.
    * @returns an array with 0..n controls created from an ExtensionPoint
    */
  def apply(oContainer: View, sExtName: String): js.Array[Control] = js.native
  def apply(oContainer: View, sExtName: String, fnCreateDefaultContent: js.Any): js.Array[Control] = js.native
  def apply(oContainer: View, sExtName: String, fnCreateDefaultContent: js.Any, oTargetControl: Control): js.Array[Control] = js.native
  def apply(
    oContainer: View,
    sExtName: String,
    fnCreateDefaultContent: js.Any,
    oTargetControl: Control,
    sAggregationName: String
  ): js.Array[Control] = js.native
}

