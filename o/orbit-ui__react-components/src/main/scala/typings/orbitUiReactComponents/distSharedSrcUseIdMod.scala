package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseIdMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  inline def useId(userId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(userId: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useId(userId: Unit, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
}
