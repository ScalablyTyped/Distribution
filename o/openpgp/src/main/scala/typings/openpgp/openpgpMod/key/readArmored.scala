package typings.openpgp.openpgpMod.key

import typings.openpgp.openpgpMod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.readArmored")
@js.native
object readArmored extends js.Object {
  /**
    * Reads an OpenPGP armored text and returns one or multiple key objects
    * @param armoredText text to be parsed
    * @returns result object with key and error arrays
    */
  def apply(armoredText: String): js.Promise[KeyResult] = js.native
  def apply(armoredText: ReadableStream[String]): js.Promise[KeyResult] = js.native
}

