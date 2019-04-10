package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadersNs {
  type OnCompleteSignal = js.Function1[/* loader */ Loader, scala.Unit]
  type OnErrorSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, scala.Unit]
  type OnLoadSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, scala.Unit]
  type OnProgressSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, scala.Unit]
  type OnStartSignal = js.Function1[/* loader */ Loader, scala.Unit]
}
