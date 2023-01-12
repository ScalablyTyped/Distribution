package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1ValueMatcher extends StObject {
  
  /** To be used for full regex matching. The regular expression is using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be used with RE2::FullMatch */
  var matchesPattern: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1ValueMatcher {
  
  inline def apply(): GoogleCloudRecommenderV1ValueMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1ValueMatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommenderV1ValueMatcher] (val x: Self) extends AnyVal {
    
    inline def setMatchesPattern(value: String): Self = StObject.set(x, "matchesPattern", value.asInstanceOf[js.Any])
    
    inline def setMatchesPatternUndefined: Self = StObject.set(x, "matchesPattern", js.undefined)
  }
}
