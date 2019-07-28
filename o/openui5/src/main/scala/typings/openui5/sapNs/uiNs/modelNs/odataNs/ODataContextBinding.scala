package typings.openui5.sapNs.uiNs.modelNs.odataNs

import typings.openui5.sapNs.uiNs.modelNs.ContextBinding
import typings.openui5.sapNs.uiNs.modelNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.ODataContextBinding")
@js.native
abstract class ODataContextBinding protected () extends ContextBinding {
  /**
    * Constructor for odata.ODataContextBinding
    * @param oModel undefined
    * @param sPath undefined
    * @param oContext undefined
    * @param mParameters undefined
    */
  def this(oModel: Model, sPath: String, oContext: js.Any) = this()
  def this(oModel: Model, sPath: String, oContext: js.Any, mParameters: js.Any) = this()
}

