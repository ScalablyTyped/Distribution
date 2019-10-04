package typings.preact.compatSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/compat/src", "PureComponent")
@js.native
abstract class PureComponent[P, S] ()
  extends typings.preact.srcMod.Component[P, S] {
  var isPureReactComponent: Boolean = js.native
}

