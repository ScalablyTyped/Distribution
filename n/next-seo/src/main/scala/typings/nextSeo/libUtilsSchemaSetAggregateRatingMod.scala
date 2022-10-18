package typings.nextSeo

import typings.nextSeo.anon.BestRating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetAggregateRatingMod {
  
  @JSImport("next-seo/lib/utils/schema/setAggregateRating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setAggregateRating(): js.UndefOr[BestRating] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAggregateRating")().asInstanceOf[js.UndefOr[BestRating]]
  inline def setAggregateRating(
    aggregateRating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
  ): js.UndefOr[BestRating] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAggregateRating")(aggregateRating.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[BestRating]]
}
