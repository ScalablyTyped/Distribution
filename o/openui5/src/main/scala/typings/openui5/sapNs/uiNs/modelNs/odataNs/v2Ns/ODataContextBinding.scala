package typings.openui5.sapNs.uiNs.modelNs.odataNs.v2Ns

import typings.openui5.sapNs.uiNs.modelNs.ContextBinding
import typings.openui5.sapNs.uiNs.modelNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v2.ODataContextBinding")
@js.native
abstract class ODataContextBinding protected () extends ContextBinding {
  /**
    * Constructor for odata.ODataContextBinding
    * @param oModel undefined
    * @param sPath undefined
    * @param oContext undefined
    * @param mParameters a map which contains additional parameters for the binding.
    */
  def this(oModel: Model, sPath: String, oContext: js.Any) = this()
  def this(oModel: Model, sPath: String, oContext: js.Any, mParameters: js.Any) = this()
  def refresh(bForceUpdate: Boolean, sGroupId: String): Unit = js.native
}

