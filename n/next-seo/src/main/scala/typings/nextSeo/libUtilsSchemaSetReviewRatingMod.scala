package typings.nextSeo

import typings.nextSeo.anon.RatingValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetReviewRatingMod {
  
  @JSImport("next-seo/lib/utils/schema/setReviewRating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setReviewRating(): js.UndefOr[RatingValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("setReviewRating")().asInstanceOf[js.UndefOr[RatingValue]]
  inline def setReviewRating(
    rating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReviewRating */ Any
  ): js.UndefOr[RatingValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("setReviewRating")(rating.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RatingValue]]
}
