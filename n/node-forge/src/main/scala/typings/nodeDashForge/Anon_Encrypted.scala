package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pkcs12Ns.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encrypted extends js.Object {
  var encrypted: Boolean
  var safeBags: js.Array[Bag]
}

object Anon_Encrypted {
  @scala.inline
  def apply(encrypted: Boolean, safeBags: js.Array[Bag]): Anon_Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted, safeBags = safeBags)
  
    __obj.asInstanceOf[Anon_Encrypted]
  }
}

