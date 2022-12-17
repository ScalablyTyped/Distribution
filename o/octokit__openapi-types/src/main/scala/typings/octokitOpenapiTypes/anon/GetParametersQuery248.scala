package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery248 extends StObject {
  
  /**
    * Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.
    *
    * This endpoint and the [Map a commit author](https://docs.github.com/rest/reference/migrations#map-a-commit-author) endpoint allow you to provide correct Git author information.
    */
  var get: ParametersQuery248
}
object GetParametersQuery248 {
  
  inline def apply(get: ParametersQuery248): GetParametersQuery248 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery248]
  }
  
  extension [Self <: GetParametersQuery248](x: Self) {
    
    inline def setGet(value: ParametersQuery248): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
