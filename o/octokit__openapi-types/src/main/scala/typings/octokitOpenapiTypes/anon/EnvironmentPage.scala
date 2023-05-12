package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentPage extends StObject {
  
  /** @description The name of the environment that was deployed to (e.g., `staging` or `production`). */
  var environment: js.UndefOr[String | Null] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** @description The name of the ref. This can be a branch, tag, or SHA. */
  var ref: js.UndefOr[String] = js.undefined
  
  /** @description The SHA recorded at creation time. */
  var sha: js.UndefOr[String] = js.undefined
  
  /** @description The name of the task for the deployment (e.g., `deploy` or `deploy:migrations`). */
  var task: js.UndefOr[String] = js.undefined
}
object EnvironmentPage {
  
  inline def apply(): EnvironmentPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentPage] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
