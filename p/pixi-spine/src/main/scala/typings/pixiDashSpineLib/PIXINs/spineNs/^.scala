package typings
package pixiDashSpineLib.PIXINs.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine")
@js.native
object ^ extends js.Object {
  def imageLoaderAdapter(loader: js.Any, namePrefix: js.Any, baseUrl: js.Any, imageOptions: js.Any): js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* baseTexture */ js.Any, 
      _
    ], 
    scala.Unit
  ] = js.native
  def staticImageLoader(
    pages: org.scalablytyped.runtime.StringDictionary[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any
    ]
  ): js.Function2[/* line */ js.Any, /* callback */ js.Any, scala.Unit] = js.native
  def syncImageLoaderAdapter(baseUrl: js.Any, crossOrigin: js.Any): js.Function2[/* line */ js.Any, /* callback */ js.Any, scala.Unit] = js.native
}

