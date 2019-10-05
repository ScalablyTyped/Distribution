package typings.node.v8Mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", "getHeapSnapshot")
@js.native
object getHeapSnapshot extends js.Object {
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This conversation was marked as resolved by joyeecheung
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine, and may change from one version of V8 to the next.
    */
  def apply(): Readable = js.native
}

