package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherNameAndProtocol extends js.Object {
  /**
    * The cipher name.
    */
  var name: String = js.native
  /**
    * IETF name for the cipher suite.
    */
  var standardName: String = js.native
  /**
    * SSL/TLS protocol version.
    */
  var version: String = js.native
}

object CipherNameAndProtocol {
  @scala.inline
  def apply(name: String, standardName: String, version: String): CipherNameAndProtocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], standardName = standardName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherNameAndProtocol]
  }
  @scala.inline
  implicit class CipherNameAndProtocolOps[Self <: CipherNameAndProtocol] (val x: Self) extends AnyVal {
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
    def setStandardName(value: String): Self = this.set("standardName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

