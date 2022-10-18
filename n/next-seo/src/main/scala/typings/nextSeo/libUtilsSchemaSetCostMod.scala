package typings.nextSeo

import typings.nextSeo.anon.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetCostMod {
  
  @JSImport("next-seo/lib/utils/schema/setCost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setCost(): js.UndefOr[Price] = ^.asInstanceOf[js.Dynamic].applyDynamic("setCost")().asInstanceOf[js.UndefOr[Price]]
  inline def setCost(
    cost: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriceSpecification */ Any
  ): js.UndefOr[Price] = ^.asInstanceOf[js.Dynamic].applyDynamic("setCost")(cost.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Price]]
}
