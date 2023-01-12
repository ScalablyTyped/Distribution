package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.generated
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.library
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.source
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysiskey extends StObject {
  
  var analysis_key: js.UndefOr[String] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * @description Classifications that have been applied to the file that triggered the alert.
    * For example identifying it as documentation, or a generated file.
    */
  var classifications: js.UndefOr[js.Array[source | generated | test | library | Null]] = js.undefined
  
  var commit_sha: js.UndefOr[String] = js.undefined
  
  var environment: js.UndefOr[String] = js.undefined
  
  var html_url: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Endcolumn] = js.undefined
  
  var message: js.UndefOr[Text] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[open | closed | dismissed | fixed] = js.undefined
}
object Analysiskey {
  
  inline def apply(): Analysiskey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analysiskey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Analysiskey] (val x: Self) extends AnyVal {
    
    inline def setAnalysis_key(value: String): Self = StObject.set(x, "analysis_key", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_keyUndefined: Self = StObject.set(x, "analysis_key", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setClassifications(value: js.Array[source | generated | test | library | Null]): Self = StObject.set(x, "classifications", value.asInstanceOf[js.Any])
    
    inline def setClassificationsUndefined: Self = StObject.set(x, "classifications", js.undefined)
    
    inline def setClassificationsVarargs(value: (source | generated | test | library | Null)*): Self = StObject.set(x, "classifications", js.Array(value*))
    
    inline def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    inline def setCommit_shaUndefined: Self = StObject.set(x, "commit_sha", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setLocation(value: Endcolumn): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: Text): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setState(value: open | closed | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
