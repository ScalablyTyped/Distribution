package typings.nextSeo

import typings.nextSeo.anon.InteractionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetInteractionStatisticMod {
  
  @JSImport("next-seo/lib/utils/schema/setInteractionStatistic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setInteractionStatistic(): js.UndefOr[InteractionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("setInteractionStatistic")().asInstanceOf[js.UndefOr[InteractionType]]
  inline def setInteractionStatistic(watchCount: Double): js.UndefOr[InteractionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("setInteractionStatistic")(watchCount.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[InteractionType]]
}
