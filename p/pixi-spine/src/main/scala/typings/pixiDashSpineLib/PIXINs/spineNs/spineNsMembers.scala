package typings
package pixiDashSpineLib.PIXINs.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine")
@js.native
object spineNsMembers extends js.Object {
  def atlasParser(): js.Function2[/* resource */ pixiDotJsLib.PIXINs.loadersNs.Resource, /* next */ js.Function0[_], _] = js.native
  def imageLoaderAdapter(loader: js.Any, namePrefix: js.Any, baseUrl: js.Any, imageOptions: js.Any): js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function1[/* baseTexture */ pixiDotJsLib.PIXINs.BaseTexture, _], 
    scala.Unit
  ] = js.native
  def staticImageLoader(
    pages: org.scalablytyped.runtime.StringDictionary[pixiDotJsLib.PIXINs.BaseTexture | pixiDotJsLib.PIXINs.Texture]
  ): js.Function2[/* line */ js.Any, /* callback */ js.Any, scala.Unit] = js.native
  def syncImageLoaderAdapter(baseUrl: js.Any, crossOrigin: js.Any): js.Function2[/* line */ js.Any, /* callback */ js.Any, scala.Unit] = js.native
}

