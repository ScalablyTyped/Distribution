package typings.moji.mojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moji", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(moji: String): Moji = js.native
  def addMojisyu(`type`: String, mojisyu: MojisyuRange): Unit = js.native
  def addMojisyu(`type`: String, mojisyu: MojisyuRegExp): Unit = js.native
}

