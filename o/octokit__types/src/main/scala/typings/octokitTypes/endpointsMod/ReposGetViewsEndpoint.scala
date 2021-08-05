package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.day
import typings.octokitTypes.octokitTypesStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetViewsEndpoint extends StObject {
  
  var owner: String
  
  /**
    * Must be one of: `day`, `week`.
    */
  var per: js.UndefOr[day | week] = js.undefined
  
  var repo: String
}
object ReposGetViewsEndpoint {
  
  inline def apply(owner: String, repo: String): ReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsEndpoint]
  }
  
  extension [Self <: ReposGetViewsEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPer(value: day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
