package typings.nextSeo

import typings.nextSeo.anon.AcceptedAnswer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetQuestionsMod {
  
  @JSImport("next-seo/lib/utils/schema/setQuestions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setQuestions(
    questions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
    ]
  ): js.UndefOr[js.Array[AcceptedAnswer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setQuestions")(questions.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[AcceptedAnswer]]]
}
