package typings.nodeDashForge.nodeDashForgeMod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * Extensions
    */
  var extensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * e.g. challengePassword
    */
  var name: String
  /**
    * Short name, if available (e.g. 'CN' for 'commonName')
    */
  var shortName: js.UndefOr[String] = js.undefined
  /**
    * OID, e.g. '1.2.840.113549.1.9.7'
    */
  var `type`: String
  /**
    * Attribute value
    */
  var value: js.Any
  /**
    * Attribute value data type
    */
  var valueTagClass: Double
}

object Attribute {
  @scala.inline
  def apply(
    name: String,
    `type`: String,
    value: js.Any,
    valueTagClass: Double,
    extensions: js.Array[_] = null,
    shortName: String = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(name = name, value = value, valueTagClass = valueTagClass)
    __obj.updateDynamic("type")(`type`)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (shortName != null) __obj.updateDynamic("shortName")(shortName)
    __obj.asInstanceOf[Attribute]
  }
}

