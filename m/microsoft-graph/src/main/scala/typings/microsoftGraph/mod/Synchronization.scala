package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Synchronization
  extends StObject
     with Entity {
  
  var jobs: js.UndefOr[NullableOption[js.Array[SynchronizationJob]]] = js.undefined
  
  var secrets: js.UndefOr[NullableOption[js.Array[SynchronizationSecretKeyStringValuePair]]] = js.undefined
  
  var templates: js.UndefOr[NullableOption[js.Array[SynchronizationTemplate]]] = js.undefined
}
object Synchronization {
  
  inline def apply(): Synchronization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Synchronization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Synchronization] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: NullableOption[js.Array[SynchronizationJob]]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsNull: Self = StObject.set(x, "jobs", null)
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SynchronizationJob*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setSecrets(value: NullableOption[js.Array[SynchronizationSecretKeyStringValuePair]]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsNull: Self = StObject.set(x, "secrets", null)
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecretsVarargs(value: SynchronizationSecretKeyStringValuePair*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTemplates(value: NullableOption[js.Array[SynchronizationTemplate]]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesNull: Self = StObject.set(x, "templates", null)
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: SynchronizationTemplate*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
