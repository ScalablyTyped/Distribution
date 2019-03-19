package typings
package passportDashSamlLib.passportDashSamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends /* attributeName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var ID: js.UndefOr[java.lang.String] = js.undefined
    // InCommon Attribute urn:oid:0.9.2342.19200300.100.1.3
  var email: js.UndefOr[java.lang.String] = js.undefined
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  var mail: js.UndefOr[java.lang.String] = js.undefined
  var nameID: js.UndefOr[java.lang.String] = js.undefined
  var nameIDFormat: js.UndefOr[java.lang.String] = js.undefined
  var nameQualifier: js.UndefOr[java.lang.String] = js.undefined
  var sessionIndex: js.UndefOr[java.lang.String] = js.undefined
  var spNameQualifier: js.UndefOr[java.lang.String] = js.undefined
    // get the raw assertion XML
  def getAssertion(): js.Object
    // `mail` if not present in the assertion
  def getAssertionXml(): java.lang.String
    // get the assertion XML parsed as a JavaScript object
  def getSamlResponseXml(): java.lang.String
}

object Profile {
  @scala.inline
  def apply(
    getAssertion: () => js.Object,
    getAssertionXml: () => java.lang.String,
    getSamlResponseXml: () => java.lang.String,
    ID: java.lang.String = null,
    StringDictionary: /* attributeName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    email: java.lang.String = null,
    issuer: java.lang.String = null,
    mail: java.lang.String = null,
    nameID: java.lang.String = null,
    nameIDFormat: java.lang.String = null,
    nameQualifier: java.lang.String = null,
    sessionIndex: java.lang.String = null,
    spNameQualifier: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(getAssertion = js.Any.fromFunction0(getAssertion), getAssertionXml = js.Any.fromFunction0(getAssertionXml), getSamlResponseXml = js.Any.fromFunction0(getSamlResponseXml))
    if (ID != null) __obj.updateDynamic("ID")(ID)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (email != null) __obj.updateDynamic("email")(email)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (mail != null) __obj.updateDynamic("mail")(mail)
    if (nameID != null) __obj.updateDynamic("nameID")(nameID)
    if (nameIDFormat != null) __obj.updateDynamic("nameIDFormat")(nameIDFormat)
    if (nameQualifier != null) __obj.updateDynamic("nameQualifier")(nameQualifier)
    if (sessionIndex != null) __obj.updateDynamic("sessionIndex")(sessionIndex)
    if (spNameQualifier != null) __obj.updateDynamic("spNameQualifier")(spNameQualifier)
    __obj.asInstanceOf[Profile]
  }
}

