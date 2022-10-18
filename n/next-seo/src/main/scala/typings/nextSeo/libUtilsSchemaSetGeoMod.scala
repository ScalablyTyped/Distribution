package typings.nextSeo

import typings.nextSeo.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetGeoMod {
  
  @JSImport("next-seo/lib/utils/schema/setGeo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setGeo(): js.UndefOr[Latitude] = ^.asInstanceOf[js.Dynamic].applyDynamic("setGeo")().asInstanceOf[js.UndefOr[Latitude]]
  inline def setGeo(
    geo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Geo */ Any
  ): js.UndefOr[Latitude] = ^.asInstanceOf[js.Dynamic].applyDynamic("setGeo")(geo.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Latitude]]
}
