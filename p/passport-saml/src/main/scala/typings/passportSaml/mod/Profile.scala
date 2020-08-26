package typings.passportSaml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile
  extends /* attributeName */ StringDictionary[js.Any] {
  var ID: js.UndefOr[String] = js.native
   // InCommon Attribute urn:oid:0.9.2342.19200300.100.1.3
  var email: js.UndefOr[String] = js.native
  var issuer: js.UndefOr[String] = js.native
  var mail: js.UndefOr[String] = js.native
  var nameID: js.UndefOr[String] = js.native
  var nameIDFormat: js.UndefOr[String] = js.native
  var nameQualifier: js.UndefOr[String] = js.native
  var sessionIndex: js.UndefOr[String] = js.native
  var spNameQualifier: js.UndefOr[String] = js.native
   // get the raw assertion XML
  def getAssertion(): js.Object = js.native
   // `mail` if not present in the assertion
  def getAssertionXml(): String = js.native
   // get the assertion XML parsed as a JavaScript object
  def getSamlResponseXml(): String = js.native
}

object Profile {
  @scala.inline
  def apply(getAssertion: () => js.Object, getAssertionXml: () => String, getSamlResponseXml: () => String): Profile = {
    val __obj = js.Dynamic.literal(getAssertion = js.Any.fromFunction0(getAssertion), getAssertionXml = js.Any.fromFunction0(getAssertionXml), getSamlResponseXml = js.Any.fromFunction0(getSamlResponseXml))
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
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
    def setGetAssertion(value: () => js.Object): Self = this.set("getAssertion", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAssertionXml(value: () => String): Self = this.set("getAssertionXml", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSamlResponseXml(value: () => String): Self = this.set("getSamlResponseXml", js.Any.fromFunction0(value))
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setMail(value: String): Self = this.set("mail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMail: Self = this.set("mail", js.undefined)
    @scala.inline
    def setNameID(value: String): Self = this.set("nameID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameID: Self = this.set("nameID", js.undefined)
    @scala.inline
    def setNameIDFormat(value: String): Self = this.set("nameIDFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameIDFormat: Self = this.set("nameIDFormat", js.undefined)
    @scala.inline
    def setNameQualifier(value: String): Self = this.set("nameQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameQualifier: Self = this.set("nameQualifier", js.undefined)
    @scala.inline
    def setSessionIndex(value: String): Self = this.set("sessionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionIndex: Self = this.set("sessionIndex", js.undefined)
    @scala.inline
    def setSpNameQualifier(value: String): Self = this.set("spNameQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpNameQualifier: Self = this.set("spNameQualifier", js.undefined)
  }
  
}

