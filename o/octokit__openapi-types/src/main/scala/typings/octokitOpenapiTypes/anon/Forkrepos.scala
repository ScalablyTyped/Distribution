package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forkrepos extends StObject {
  
  var fork_repos: js.UndefOr[Double] = js.undefined
  
  var org_repos: js.UndefOr[Double] = js.undefined
  
  var root_repos: js.UndefOr[Double] = js.undefined
  
  var total_pushes: js.UndefOr[Double] = js.undefined
  
  var total_repos: js.UndefOr[Double] = js.undefined
  
  var total_wikis: js.UndefOr[Double] = js.undefined
}
object Forkrepos {
  
  inline def apply(): Forkrepos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Forkrepos]
  }
  
  extension [Self <: Forkrepos](x: Self) {
    
    inline def setFork_repos(value: Double): Self = StObject.set(x, "fork_repos", value.asInstanceOf[js.Any])
    
    inline def setFork_reposUndefined: Self = StObject.set(x, "fork_repos", js.undefined)
    
    inline def setOrg_repos(value: Double): Self = StObject.set(x, "org_repos", value.asInstanceOf[js.Any])
    
    inline def setOrg_reposUndefined: Self = StObject.set(x, "org_repos", js.undefined)
    
    inline def setRoot_repos(value: Double): Self = StObject.set(x, "root_repos", value.asInstanceOf[js.Any])
    
    inline def setRoot_reposUndefined: Self = StObject.set(x, "root_repos", js.undefined)
    
    inline def setTotal_pushes(value: Double): Self = StObject.set(x, "total_pushes", value.asInstanceOf[js.Any])
    
    inline def setTotal_pushesUndefined: Self = StObject.set(x, "total_pushes", js.undefined)
    
    inline def setTotal_repos(value: Double): Self = StObject.set(x, "total_repos", value.asInstanceOf[js.Any])
    
    inline def setTotal_reposUndefined: Self = StObject.set(x, "total_repos", js.undefined)
    
    inline def setTotal_wikis(value: Double): Self = StObject.set(x, "total_wikis", value.asInstanceOf[js.Any])
    
    inline def setTotal_wikisUndefined: Self = StObject.set(x, "total_wikis", js.undefined)
  }
}
