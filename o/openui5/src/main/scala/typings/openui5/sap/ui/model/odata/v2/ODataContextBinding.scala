package typings.openui5.sap.ui.model.odata.v2

import typings.openui5.sap.ui.model.ContextBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataContextBinding extends ContextBinding {
  def refresh(bForceUpdate: Boolean, sGroupId: String): Unit = js.native
}

