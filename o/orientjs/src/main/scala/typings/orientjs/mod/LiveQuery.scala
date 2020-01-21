package typings.orientjs.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "LiveQuery")
@js.native
class LiveQuery () extends Readable {
  def unsubscribe(): js.Promise[_] = js.native
}

