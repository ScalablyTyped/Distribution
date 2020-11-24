package typings.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientModel extends Model {
  
  /**
    * Force no caching.
    * @param bForceNoCache whether to force not to cache
    */
  def forceNoCache(bForceNoCache: Boolean): Unit = js.native
  
  /**
    * Returns the current data of the model.Be aware that the returned object is a reference to the model
    * data so all changes to that data will also change the model data.
    */
  def getData(): Unit = js.native
  
  /**
    * update all bindings
    * @param bForceUpdate true/false: Default = false. If set to false an update                    will only be done
    * when the value of a binding changed.
    */
  def updateBindings(bForceUpdate: Boolean): Unit = js.native
}
