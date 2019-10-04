package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksSrcMod {
  type CreateHandle = js.Function0[js.Object]
  type EffectCallback = js.Function0[Unit | js.Function0[Unit]]
  type Inputs = js.Array[js.Any]
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  type StateUpdater[S] = js.Function1[/* value */ S | (js.Function1[/* prevState */ S, S]), Unit]
}
