package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Until extends StObject {
  
  /** @description GitHub username or email address to use to filter by commit author. */
  var author: js.UndefOr[String] = js.undefined
  
  /** @description GitHub username or email address to use to filter by commit committer. */
  var committer: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  /** @description Only commits containing this file path will be returned. */
  var path: js.UndefOr[String] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** @description SHA or branch to start listing commits from. Default: the repository’s default branch (usually `main`). */
  var sha: js.UndefOr[String] = js.undefined
  
  var since: js.UndefOr[String] = js.undefined
  
  /** @description Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var until: js.UndefOr[String] = js.undefined
}
object Until {
  
  inline def apply(): Until = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Until]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Until] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCommitter(value: String): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
  }
}
