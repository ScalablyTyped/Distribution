package typings.maximMazurokGapiClientVerifiedaccess.gapi.client.verifiedaccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Challenge extends js.Object {
  
  /** Challenge generated with the old signing key (this will only be present during key rotation) */
  var alternativeChallenge: js.UndefOr[SignedData] = js.native
  
  /** Generated challenge */
  var challenge: js.UndefOr[SignedData] = js.native
}
object Challenge {
  
  @scala.inline
  def apply(): Challenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Challenge]
  }
  
  @scala.inline
  implicit class ChallengeOps[Self <: Challenge] (val x: Self) extends AnyVal {
    
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
    def setAlternativeChallenge(value: SignedData): Self = this.set("alternativeChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativeChallenge: Self = this.set("alternativeChallenge", js.undefined)
    
    @scala.inline
    def setChallenge(value: SignedData): Self = this.set("challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
  }
}
