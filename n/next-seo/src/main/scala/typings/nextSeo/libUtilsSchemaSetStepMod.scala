package typings.nextSeo

import typings.nextSeo.anon.ItemListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetStepMod {
  
  @JSImport("next-seo/lib/utils/schema/setStep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setStep(): js.UndefOr[js.Array[ItemListElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setStep")().asInstanceOf[js.UndefOr[js.Array[ItemListElement]]]
  inline def setStep(
    step: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Step */ Any
    ]
  ): js.UndefOr[js.Array[ItemListElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setStep")(step.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[ItemListElement]]]
}
