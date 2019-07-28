package typings.pixiDotJs.PIXINs

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.PIXINs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadersNs {
  type OnCompleteSignal = js.Function1[/* loader */ Loader, Unit]
  type OnErrorSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  type OnLoadSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  type OnProgressSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  type OnStartSignal = js.Function1[/* loader */ Loader, Unit]
  type ResourceDictionary = StringDictionary[Resource]
  type TextureDictionary = StringDictionary[Texture]
}
