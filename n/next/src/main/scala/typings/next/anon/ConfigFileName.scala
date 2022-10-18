package typings.next.anon

import typings.next.distBuildUtilsMod.GenerateParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFileName extends StObject {
  
  var configFileName: String
  
  var generateParams: GenerateParams
  
  var page: String
}
object ConfigFileName {
  
  inline def apply(configFileName: String, generateParams: GenerateParams, page: String): ConfigFileName = {
    val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any], generateParams = generateParams.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFileName]
  }
  
  extension [Self <: ConfigFileName](x: Self) {
    
    inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setGenerateParams(value: GenerateParams): Self = StObject.set(x, "generateParams", value.asInstanceOf[js.Any])
    
    inline def setGenerateParamsVarargs(value: Config*): Self = StObject.set(x, "generateParams", js.Array(value*))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
