package typings.node.anon

import typings.node.cryptoMod.KeyFormat
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format[PubF /* <: KeyFormat */] extends js.Object {
  var format: PubF = js.native
  var `type`: pkcs1 | spki = js.native
}

object Format {
  @scala.inline
  def apply[/* <: typings.node.cryptoMod.KeyFormat */ PubF](format: PubF, `type`: pkcs1 | spki): Format[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format[PubF]]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format[_], /* <: typings.node.cryptoMod.KeyFormat */ PubF] (val x: Self with Format[PubF]) extends AnyVal {
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
    def setFormat(value: PubF): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: pkcs1 | spki): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

