package typings.nextSeo

import typings.nextSeo.anon.Availability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetOffersMod {
  
  @JSImport("next-seo/lib/utils/schema/setOffers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setOffers(): js.UndefOr[Availability | js.Array[Availability]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOffers")().asInstanceOf[js.UndefOr[Availability | js.Array[Availability]]]
  inline def setOffers(
    offers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
    ]
  ): js.UndefOr[Availability | js.Array[Availability]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOffers")(offers.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Availability | js.Array[Availability]]]
  inline def setOffers(
    offers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
  ): js.UndefOr[Availability | js.Array[Availability]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOffers")(offers.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Availability | js.Array[Availability]]]
}
