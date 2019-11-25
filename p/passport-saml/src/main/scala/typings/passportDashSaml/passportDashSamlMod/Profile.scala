package typings.passportDashSaml.passportDashSamlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends /* attributeName */ StringDictionary[js.Any] {
  var ID: js.UndefOr[String] = js.undefined
   // InCommon Attribute urn:oid:0.9.2342.19200300.100.1.3
  var email: js.UndefOr[String] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var mail: js.UndefOr[String] = js.undefined
  var nameID: js.UndefOr[String] = js.undefined
  var nameIDFormat: js.UndefOr[String] = js.undefined
  var nameQualifier: js.UndefOr[String] = js.undefined
  var sessionIndex: js.UndefOr[String] = js.undefined
  var spNameQualifier: js.UndefOr[String] = js.undefined
   // get the raw assertion XML
  def getAssertion(): js.Object
   // `mail` if not present in the assertion
  def getAssertionXml(): String
   // get the assertion XML parsed as a JavaScript object
  def getSamlResponseXml(): String
}

object Profile {
  @scala.inline
  def apply(
    getAssertion: () => js.Object,
    getAssertionXml: () => String,
    getSamlResponseXml: () => String,
    ID: String = null,
    StringDictionary: /* attributeName */ StringDictionary[js.Any] = null,
    email: String = null,
    issuer: String = null,
    mail: String = null,
    nameID: String = null,
    nameIDFormat: String = null,
    nameQualifier: String = null,
    sessionIndex: String = null,
    spNameQualifier: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(getAssertion = js.Any.fromFunction0(getAssertion), getAssertionXml = js.Any.fromFunction0(getAssertionXml), getSamlResponseXml = js.Any.fromFunction0(getSamlResponseXml))
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (mail != null) __obj.updateDynamic("mail")(mail.asInstanceOf[js.Any])
    if (nameID != null) __obj.updateDynamic("nameID")(nameID.asInstanceOf[js.Any])
    if (nameIDFormat != null) __obj.updateDynamic("nameIDFormat")(nameIDFormat.asInstanceOf[js.Any])
    if (nameQualifier != null) __obj.updateDynamic("nameQualifier")(nameQualifier.asInstanceOf[js.Any])
    if (sessionIndex != null) __obj.updateDynamic("sessionIndex")(sessionIndex.asInstanceOf[js.Any])
    if (spNameQualifier != null) __obj.updateDynamic("spNameQualifier")(spNameQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

