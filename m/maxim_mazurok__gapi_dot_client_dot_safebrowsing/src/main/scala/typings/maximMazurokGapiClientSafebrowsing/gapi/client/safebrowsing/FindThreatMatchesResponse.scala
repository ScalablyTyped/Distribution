package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindThreatMatchesResponse extends js.Object {
  
  /** The threat list matches. */
  var matches: js.UndefOr[js.Array[ThreatMatch]] = js.native
}
object FindThreatMatchesResponse {
  
  @scala.inline
  def apply(): FindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindThreatMatchesResponse]
  }
  
  @scala.inline
  implicit class FindThreatMatchesResponseOps[Self <: FindThreatMatchesResponse] (val x: Self) extends AnyVal {
    
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
    def setMatchesVarargs(value: ThreatMatch*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[ThreatMatch]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
  }
}
