package typings
package mojiLib.mojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moji", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(moji: java.lang.String): Moji = js.native
  def addMojisyu(`type`: java.lang.String, mojisyu: MojisyuRange): scala.Unit = js.native
  def addMojisyu(`type`: java.lang.String, mojisyu: MojisyuRegExp): scala.Unit = js.native
}

