package typings.multibase.multibaseMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multibase", "decode")
@js.native
object decode extends js.Object {
  def apply(bufOrString: String): Buffer = js.native
  /**
    * Takes a buffer or string encoded with multibase header, decodes it and
    * returns the decoded buffer
    *
    * @param bufOrString The data to be decoded.
    *
    */
  def apply(bufOrString: Buffer): Buffer = js.native
}

