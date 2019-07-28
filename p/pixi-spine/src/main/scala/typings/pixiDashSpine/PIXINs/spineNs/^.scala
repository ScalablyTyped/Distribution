package typings.pixiDashSpine.PIXINs.spineNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine")
@js.native
object ^ extends js.Object {
  def imageLoaderAdapter(loader: js.Any, namePrefix: js.Any, baseUrl: js.Any, imageOptions: js.Any): js.Function2[
    /* line */ String, 
    /* callback */ js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* baseTexture */ js.Any, 
      _
    ], 
    Unit
  ] = js.native
  def staticImageLoader(
    pages: StringDictionary[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any
    ]
  ): js.Function2[/* line */ js.Any, /* callback */ js.Any, Unit] = js.native
  def syncImageLoaderAdapter(baseUrl: js.Any, crossOrigin: js.Any): js.Function2[/* line */ js.Any, /* callback */ js.Any, Unit] = js.native
}

