package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.v2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v2.ODataContextBinding")
@js.native
abstract class ODataContextBinding protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.ContextBinding {
  /**
    * Constructor for odata.ODataContextBinding
    * @param oModel undefined
    * @param sPath undefined
    * @param oContext undefined
    * @param mParameters a map which contains additional parameters for the binding.
    */
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: js.Any) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: js.Any, mParameters: js.Any) = this()
  def refresh(bForceUpdate: scala.Boolean, sGroupId: java.lang.String): scala.Unit = js.native
}

