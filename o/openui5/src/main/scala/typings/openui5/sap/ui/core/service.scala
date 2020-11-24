package typings.openui5.sap.ui.core

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.service")
@js.native
object service extends js.Object {
  
  @js.native
  trait Service extends Object {
    
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
  
  @js.native
  trait ServiceFactory extends Object {
    
    /**
      * Creates a new instance of a service. When used as a generic service factoryby providing a service
      * constructor function it will create a new serviceinstance otherwise the function will fail. For
      * custom service factoriesthis function has to be overridden and should return a <code>Promise</code>.
      * @param oServiceContext Context for which the service is created
      * @returns Promise which resolves with the new Service instance.
      */
    def createInstance(oServiceContext: js.Any): JQueryPromise[_] = js.native
  }
}
