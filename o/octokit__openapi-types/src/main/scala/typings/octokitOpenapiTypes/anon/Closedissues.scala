package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closedissues extends StObject {
  
  var closed_issues: js.UndefOr[Double] = js.undefined
  
  var open_issues: js.UndefOr[Double] = js.undefined
  
  var total_issues: js.UndefOr[Double] = js.undefined
}
object Closedissues {
  
  inline def apply(): Closedissues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closedissues]
  }
  
  extension [Self <: Closedissues](x: Self) {
    
    inline def setClosed_issues(value: Double): Self = StObject.set(x, "closed_issues", value.asInstanceOf[js.Any])
    
    inline def setClosed_issuesUndefined: Self = StObject.set(x, "closed_issues", js.undefined)
    
    inline def setOpen_issues(value: Double): Self = StObject.set(x, "open_issues", value.asInstanceOf[js.Any])
    
    inline def setOpen_issuesUndefined: Self = StObject.set(x, "open_issues", js.undefined)
    
    inline def setTotal_issues(value: Double): Self = StObject.set(x, "total_issues", value.asInstanceOf[js.Any])
    
    inline def setTotal_issuesUndefined: Self = StObject.set(x, "total_issues", js.undefined)
  }
}
