package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute members to search on; any one hit will return the attribute
  */
trait GetAttributeOpts extends js.Object {
  /**
    * Long name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Short name
    */
  var shortName: js.UndefOr[String] = js.undefined
  /**
    * OID
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object GetAttributeOpts {
  @scala.inline
  def apply(name: String = null, shortName: String = null, `type`: String = null): GetAttributeOpts = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributeOpts]
  }
}

