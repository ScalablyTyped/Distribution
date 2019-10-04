package typings.preact.compatSrcInternalMod

import typings.preact.compatSrcSuspenseMod.SuspenseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspenseComponent
  extends typings.preact.srcInternalMod.Component[SuspenseProps, SuspenseState] {
  var _suspensions: js.Array[js.Promise[_]] = js.native
}

