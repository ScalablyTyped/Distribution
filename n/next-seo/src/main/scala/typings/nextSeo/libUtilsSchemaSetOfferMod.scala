package typings.nextSeo

import typings.nextSeo.anon.ItemOffered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetOfferMod {
  
  @JSImport("next-seo/lib/utils/schema/setOffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setOffer(): js.UndefOr[ItemOffered] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOffer")().asInstanceOf[js.UndefOr[ItemOffered]]
  inline def setOffer(
    offer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offer */ Any
  ): js.UndefOr[ItemOffered] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOffer")(offer.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ItemOffered]]
}
