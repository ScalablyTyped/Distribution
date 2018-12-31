package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.ClientModel")
@js.native
abstract class ClientModel protected () extends Model {
  /**
    * Constructor for a new ClientModel.
    * @param oData URL where to load the data from
    */
  def this(oData: js.Any) = this()
  /**
    * Force no caching.
    * @param bForceNoCache whether to force not to cache
    */
  def forceNoCache(bForceNoCache: scala.Boolean): scala.Unit = js.native
  /**
    * Returns the current data of the model.Be aware that the returned object is a reference to the model
    * data so all changes to that data will also change the model data.
    */
  def getData(): scala.Unit = js.native
  /**
    * update all bindings
    * @param bForceUpdate true/false: Default = false. If set to false an update					will only be done
    * when the value of a binding changed.
    */
  def updateBindings(bForceUpdate: scala.Boolean): scala.Unit = js.native
}

