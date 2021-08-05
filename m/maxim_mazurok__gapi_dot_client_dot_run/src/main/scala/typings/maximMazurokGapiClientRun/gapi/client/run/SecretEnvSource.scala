package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretEnvSource extends StObject {
  
  /** This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead. */
  var localObjectReference: js.UndefOr[LocalObjectReference] = js.undefined
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The Secret to select from. */
  var name: js.UndefOr[String] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Specify whether the Secret must be defined */
  var optional: js.UndefOr[Boolean] = js.undefined
}
object SecretEnvSource {
  
  inline def apply(): SecretEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretEnvSource]
  }
  
  extension [Self <: SecretEnvSource](x: Self) {
    
    inline def setLocalObjectReference(value: LocalObjectReference): Self = StObject.set(x, "localObjectReference", value.asInstanceOf[js.Any])
    
    inline def setLocalObjectReferenceUndefined: Self = StObject.set(x, "localObjectReference", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
