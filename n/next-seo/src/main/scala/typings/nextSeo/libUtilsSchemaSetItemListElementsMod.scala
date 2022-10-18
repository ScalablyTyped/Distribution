package typings.nextSeo

import typings.nextSeo.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetItemListElementsMod {
  
  @JSImport("next-seo/lib/utils/schema/setItemListElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setItemListElements(
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
    ]
  ): js.UndefOr[js.Array[Item]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setItemListElements")(items.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Item]]]
}
