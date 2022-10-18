package typings.nextSeo

import typings.nextSeo.anon.Author
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetReviewsMod {
  
  @JSImport("next-seo/lib/utils/schema/setReviews", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setReviews(): js.UndefOr[Author | js.Array[Author]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setReviews")().asInstanceOf[js.UndefOr[Author | js.Array[Author]]]
  inline def setReviews(
    reviews: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
    ]
  ): js.UndefOr[Author | js.Array[Author]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setReviews")(reviews.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Author | js.Array[Author]]]
  inline def setReviews(
    reviews: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
  ): js.UndefOr[Author | js.Array[Author]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setReviews")(reviews.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Author | js.Array[Author]]]
}
