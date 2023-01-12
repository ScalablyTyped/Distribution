package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AEntitySetsNames extends StObject {
  
  /**
    * list of entity set names to fetch. If the list is empty or `undefined`, all entity sets will be retrieved.
    * This parameter should be used to improve performance in case there are a lot of entity sets but only
    * a few are needed to be fetched.
    */
  var aEntitySetsNames: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * if the MockServer should generate mock data for missing .json files that are not found in sMockdataBaseUrl
    */
  var bGenerateMissingMockData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * base url which contains the mockdata as single .json files or the .json file containing the complete
    * mock data
    */
  var sMockdataBaseUrl: js.UndefOr[String] = js.undefined
}
object AEntitySetsNames {
  
  inline def apply(): AEntitySetsNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AEntitySetsNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AEntitySetsNames] (val x: Self) extends AnyVal {
    
    inline def setAEntitySetsNames(value: js.Array[Any]): Self = StObject.set(x, "aEntitySetsNames", value.asInstanceOf[js.Any])
    
    inline def setAEntitySetsNamesUndefined: Self = StObject.set(x, "aEntitySetsNames", js.undefined)
    
    inline def setAEntitySetsNamesVarargs(value: Any*): Self = StObject.set(x, "aEntitySetsNames", js.Array(value*))
    
    inline def setBGenerateMissingMockData(value: Boolean): Self = StObject.set(x, "bGenerateMissingMockData", value.asInstanceOf[js.Any])
    
    inline def setBGenerateMissingMockDataUndefined: Self = StObject.set(x, "bGenerateMissingMockData", js.undefined)
    
    inline def setSMockdataBaseUrl(value: String): Self = StObject.set(x, "sMockdataBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setSMockdataBaseUrlUndefined: Self = StObject.set(x, "sMockdataBaseUrl", js.undefined)
  }
}
