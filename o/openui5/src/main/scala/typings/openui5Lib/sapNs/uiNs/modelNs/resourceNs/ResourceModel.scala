package typings
package openui5Lib.sapNs.uiNs.modelNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.resource.ResourceModel")
@js.native
class ResourceModel protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.Model {
  /**
    * Constructor for a new ResourceModel.
    * @param oData parameters used to initialize the ResourceModel; at least either bundleUrl or
    * bundleName must be set on this object; if both are set, bundleName wins
    */
  def this(oData: js.Any) = this()
  /**
    * Enhances the resource model with a custom resource bundle. The resource modelcan be enhanced with
    * multiple resource bundles. The last enhanced resourcebundle wins against the previous ones and the
    * original ones. This functioncan be called several times.
    * @since 1.16.1
    * @param oData parameters used to initialize the ResourceModel; at least either bundleUrl or
    * bundleName must be set on this object; if both are set, bundleName wins - or an instance of an
    * existing {@link jQuery.sap.util.ResourceBundle}
    * @returns Promise in async case (async ResourceModel) which is resolved when the the enhancement is
    * finished
    */
  def enhance(oData: js.Any): jqueryLib.JQueryPromise[_] = js.native
  /**
    * Returns the resource bundle of this model
    * @returns loaded resource bundle or ECMA Script 6 Promise in asynchronous case
    */
  def getResourceBundle(): js.Any | jqueryLib.JQueryPromise[_] = js.native
}

