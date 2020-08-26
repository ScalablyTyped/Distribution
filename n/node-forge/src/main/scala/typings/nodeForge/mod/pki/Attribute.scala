package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  /**
    * Extensions
    */
  var extensions: js.UndefOr[js.Array[_]] = js.native
  /**
    * e.g. challengePassword
    */
  var name: String = js.native
  /**
    * Short name, if available (e.g. 'CN' for 'commonName')
    */
  var shortName: js.UndefOr[String] = js.native
  /**
    * OID, e.g. '1.2.840.113549.1.9.7'
    */
  var `type`: String = js.native
  /**
    * Attribute value
    */
  var value: js.Any = js.native
  /**
    * Attribute value data type
    */
  var valueTagClass: Double = js.native
}

object Attribute {
  @scala.inline
  def apply(name: String, `type`: String, value: js.Any, valueTagClass: Double): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueTagClass = valueTagClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueTagClass(value: Double): Self = this.set("valueTagClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: js.Any*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[_]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
  }
  
}

