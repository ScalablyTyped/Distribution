package typings
package openui5Lib.sapNs.uiNs.coreNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.service.ServiceFactory")
@js.native
class ServiceFactory ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
             * Creates a new instance of a service. When used as a generic service factoryby providing a service
             * constructor function it will create a new serviceinstance otherwise the function will fail. For
             * custom service factoriesthis function has to be overridden and should return a <code>Promise</code>.
             * @param oServiceContext Context for which the service is created
             * @returns Promise which resolves with the new Service instance.
            */
  def createInstance(oServiceContext: js.Any): jqueryLib.JQueryPromise[_] = js.native
}

