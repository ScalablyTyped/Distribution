package typings.openui5.global.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.resource")
@js.native
object resource extends js.Object {
  
  @js.native
  class ResourceModel protected ()
    extends typings.openui5.sap.ui.model.resource.ResourceModel {
    /**
      * Constructor for a new ResourceModel.
      * @param oData parameters used to initialize the ResourceModel; at least either bundleUrl or
      * bundleName must be set on this object; if both are set, bundleName wins
      */
    def this(oData: js.Any) = this()
  }
}
