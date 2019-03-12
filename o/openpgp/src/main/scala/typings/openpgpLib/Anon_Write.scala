package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Write extends js.Object {
  def write(): stdLib.Uint8Array
}

object Anon_Write {
  @scala.inline
  def apply(write: () => stdLib.Uint8Array): Anon_Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
  
    __obj.asInstanceOf[Anon_Write]
  }
}

