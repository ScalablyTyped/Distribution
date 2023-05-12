package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classifications extends StObject {
  
  /** @description Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. */
  var analysis_key: String
  
  /** @description Identifies the configuration under which the analysis was executed. */
  var category: js.UndefOr[String] = js.undefined
  
  var classifications: js.UndefOr[js.Array[String]] = js.undefined
  
  var commit_sha: js.UndefOr[String] = js.undefined
  
  /** @description Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed. */
  var environment: String
  
  var location: js.UndefOr[Endline] = js.undefined
  
  var message: js.UndefOr[Text] = js.undefined
  
  /** @description The full Git reference, formatted as `refs/heads/<branch name>`. */
  var ref: String
  
  /**
    * @description State of a code scanning alert.
    * @enum {string}
    */
  var state: open | dismissed | fixed
}
object Classifications {
  
  inline def apply(analysis_key: String, environment: String, ref: String, state: open | dismissed | fixed): Classifications = {
    val __obj = js.Dynamic.literal(analysis_key = analysis_key.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classifications] (val x: Self) extends AnyVal {
    
    inline def setAnalysis_key(value: String): Self = StObject.set(x, "analysis_key", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setClassifications(value: js.Array[String]): Self = StObject.set(x, "classifications", value.asInstanceOf[js.Any])
    
    inline def setClassificationsUndefined: Self = StObject.set(x, "classifications", js.undefined)
    
    inline def setClassificationsVarargs(value: String*): Self = StObject.set(x, "classifications", js.Array(value*))
    
    inline def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    inline def setCommit_shaUndefined: Self = StObject.set(x, "commit_sha", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Endline): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: Text): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
