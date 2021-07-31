package typings.openui5.sap.ui.model

import typings.jquery.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resource {
  
  @js.native
  trait ResourceModel
    extends StObject
       with Model {
    
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
    def enhance(oData: js.Any): JQueryPromise[js.Any] = js.native
    
    /**
      * Returns the resource bundle of this model
      * @returns loaded resource bundle or ECMA Script 6 Promise in asynchronous case
      */
    def getResourceBundle(): js.Any | JQueryPromise[js.Any] = js.native
  }
}
