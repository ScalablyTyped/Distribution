package typings.openui5.global.sap.ui.model.odata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.odata.ODataModel")
@js.native
class ODataModel protected ()
  extends StObject
     with typings.openui5.sap.ui.model.odata.ODataModel {
  /**
    * Constructor for a new ODataModel.
    * @param sServiceUrl base uri of the service to request data from; additional URL parameters appended
    * here will be appended to every request                                can be passed with the mParameters object as well:
    * [mParameters.serviceUrl] A serviceURl is required!
    * @param mParameters (optional) a map which contains the following parameter properties:
    */
  def this(sServiceUrl: String) = this()
  def this(sServiceUrl: String, mParameters: js.Any) = this()
}
