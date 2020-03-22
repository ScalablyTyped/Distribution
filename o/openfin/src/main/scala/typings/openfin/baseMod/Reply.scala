package typings.openfin.baseMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/base", "Reply")
@js.native
class Reply[TOPIC /* <: String */, TYPE /* <: String | Unit */] () extends Identity {
  var topic: TOPIC = js.native
  var `type`: TYPE = js.native
  /* CompleteClass */
  override var uuid: String = js.native
}

