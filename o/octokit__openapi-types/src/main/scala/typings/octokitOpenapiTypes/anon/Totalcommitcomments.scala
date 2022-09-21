package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totalcommitcomments extends StObject {
  
  var total_commit_comments: js.UndefOr[Double] = js.undefined
  
  var total_gist_comments: js.UndefOr[Double] = js.undefined
  
  var total_issue_comments: js.UndefOr[Double] = js.undefined
  
  var total_pull_request_comments: js.UndefOr[Double] = js.undefined
}
object Totalcommitcomments {
  
  inline def apply(): Totalcommitcomments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Totalcommitcomments]
  }
  
  extension [Self <: Totalcommitcomments](x: Self) {
    
    inline def setTotal_commit_comments(value: Double): Self = StObject.set(x, "total_commit_comments", value.asInstanceOf[js.Any])
    
    inline def setTotal_commit_commentsUndefined: Self = StObject.set(x, "total_commit_comments", js.undefined)
    
    inline def setTotal_gist_comments(value: Double): Self = StObject.set(x, "total_gist_comments", value.asInstanceOf[js.Any])
    
    inline def setTotal_gist_commentsUndefined: Self = StObject.set(x, "total_gist_comments", js.undefined)
    
    inline def setTotal_issue_comments(value: Double): Self = StObject.set(x, "total_issue_comments", value.asInstanceOf[js.Any])
    
    inline def setTotal_issue_commentsUndefined: Self = StObject.set(x, "total_issue_comments", js.undefined)
    
    inline def setTotal_pull_request_comments(value: Double): Self = StObject.set(x, "total_pull_request_comments", value.asInstanceOf[js.Any])
    
    inline def setTotal_pull_request_commentsUndefined: Self = StObject.set(x, "total_pull_request_comments", js.undefined)
  }
}
