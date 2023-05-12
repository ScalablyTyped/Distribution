package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudApplicationEvidence
  extends StObject
     with AlertEvidence {
  
  // Unique identifier of the application.
  var appId: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Name of the application.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifier of the instance of the Software as a Service (SaaS) application.
  var instanceId: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Name of the instance of the SaaS application.
  var instanceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identifier of the SaaS application.
  var saasAppId: js.UndefOr[NullableOption[Double]] = js.undefined
}
object CloudApplicationEvidence {
  
  inline def apply(): CloudApplicationEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudApplicationEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudApplicationEvidence] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: NullableOption[Double]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInstanceId(value: NullableOption[Double]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceName(value: NullableOption[String]): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameNull: Self = StObject.set(x, "instanceName", null)
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setSaasAppId(value: NullableOption[Double]): Self = StObject.set(x, "saasAppId", value.asInstanceOf[js.Any])
    
    inline def setSaasAppIdNull: Self = StObject.set(x, "saasAppId", null)
    
    inline def setSaasAppIdUndefined: Self = StObject.set(x, "saasAppId", js.undefined)
  }
}
