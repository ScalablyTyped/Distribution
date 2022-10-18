package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildGenerateBuildIdMod {
  
  @JSImport("next/dist/build/generate-build-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateBuildId(
    generate: js.Function0[String | Null | (js.Promise[String | Null])],
    fallback: js.Function0[String]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBuildId")(generate.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
