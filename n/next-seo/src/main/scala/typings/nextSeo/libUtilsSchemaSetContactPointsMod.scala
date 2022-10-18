package typings.nextSeo

import typings.nextSeo.anon.AvailableLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetContactPointsMod {
  
  @JSImport("next-seo/lib/utils/schema/setContactPoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setContactPoints(): js.UndefOr[js.Array[AvailableLanguage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContactPoints")().asInstanceOf[js.UndefOr[js.Array[AvailableLanguage]]]
  inline def setContactPoints(
    contactPoint: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
    ]
  ): js.UndefOr[js.Array[AvailableLanguage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setContactPoints")(contactPoint.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[AvailableLanguage]]]
}
