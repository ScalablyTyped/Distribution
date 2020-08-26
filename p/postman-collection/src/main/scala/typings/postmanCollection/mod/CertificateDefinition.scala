package typings.postmanCollection.mod

import typings.postmanCollection.anon.Src
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDefinition extends PropertyDefinition {
  var cert: js.UndefOr[Src | String] = js.native
  var key: js.UndefOr[Src | String] = js.native
  var matches: js.UndefOr[js.Array[String] | UrlMatchPatternList] = js.native
  var passphrase: js.UndefOr[String] = js.native
}

object CertificateDefinition {
  @scala.inline
  def apply(): CertificateDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDefinition]
  }
  @scala.inline
  implicit class CertificateDefinitionOps[Self <: CertificateDefinition] (val x: Self) extends AnyVal {
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
    def setCert(value: Src | String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setKey(value: Src | String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[String] | UrlMatchPatternList): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

