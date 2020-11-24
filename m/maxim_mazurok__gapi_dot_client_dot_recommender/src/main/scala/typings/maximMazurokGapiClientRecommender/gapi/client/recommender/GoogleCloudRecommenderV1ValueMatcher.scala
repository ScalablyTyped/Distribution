package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1ValueMatcher extends js.Object {
  
  /** To be used for full regex matching. The regular expression is using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be used with RE2::FullMatch */
  var matchesPattern: js.UndefOr[String] = js.native
}
object GoogleCloudRecommenderV1ValueMatcher {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1ValueMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1ValueMatcher]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1ValueMatcherOps[Self <: GoogleCloudRecommenderV1ValueMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchesPattern(value: String): Self = this.set("matchesPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchesPattern: Self = this.set("matchesPattern", js.undefined)
  }
}
