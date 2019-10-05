package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loaders {
  import org.scalablytyped.runtime.StringDictionary
  import typings.pixiDotJs.PIXI.Texture

  type OnCompleteSignal = js.Function1[/* loader */ Loader, Unit]
  type OnErrorSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  type OnLoadSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  type OnProgressSignal = js.Function2[/* loader */ Loader, /* resource */ Resource, Unit]
  type OnStartSignal = js.Function1[/* loader */ Loader, Unit]
  type Resource = Resource_
  type ResourceDictionary = StringDictionary[Resource]
  type TextureDictionary = StringDictionary[Texture]
}
