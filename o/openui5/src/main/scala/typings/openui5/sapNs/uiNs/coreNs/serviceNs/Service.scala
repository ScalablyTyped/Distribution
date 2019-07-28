package typings.openui5.sapNs.uiNs.coreNs.serviceNs

import typings.openui5.sapNs.uiNs.baseNs.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.service.Service")
@js.native
abstract class Service () extends Object {
  /**
    * Cleans up the service instance before destruction.Applications must not call this hook method
    * directly, it is called by theframework when the service is {@link #destroy destroyed}.Subclasses of
    * service should override this hook to implement any necessaryclean-up.
    */
  def exit(): Unit = js.native
  /**
    * Returns the context of the service:<pre>{  "scopeObject": oComponent, // the Component instance 
    * "scopeType": "component"   // the stereotype of the scopeObject}</pre>This function is not available
    * on the service interface.
    * @returns the context of the service
    */
  def getContext(): js.Any = js.native
  /**
    * Initializes the service instance after creation.Applications must not call this hook method
    * directly, it is called by theframework while the constructor of a service is executed.Subclasses of
    * service should override this hook to implement any necessaryinitialization.
    */
  def init(): Unit = js.native
}

