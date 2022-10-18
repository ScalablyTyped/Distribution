package typings.nextSeo

import typings.nextSeo.anon.ContentUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetVideoMod {
  
  @JSImport("next-seo/lib/utils/schema/setVideo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setVideo(): js.UndefOr[ContentUrl] = ^.asInstanceOf[js.Dynamic].applyDynamic("setVideo")().asInstanceOf[js.UndefOr[ContentUrl]]
  inline def setVideo(
    video: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any
  ): js.UndefOr[ContentUrl] = ^.asInstanceOf[js.Dynamic].applyDynamic("setVideo")(video.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ContentUrl]]
  inline def setVideo(
    video: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any,
    setContext: Boolean
  ): js.UndefOr[ContentUrl] = (^.asInstanceOf[js.Dynamic].applyDynamic("setVideo")(video.asInstanceOf[js.Any], setContext.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ContentUrl]]
  inline def setVideo(video: Unit, setContext: Boolean): js.UndefOr[ContentUrl] = (^.asInstanceOf[js.Dynamic].applyDynamic("setVideo")(video.asInstanceOf[js.Any], setContext.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ContentUrl]]
}
