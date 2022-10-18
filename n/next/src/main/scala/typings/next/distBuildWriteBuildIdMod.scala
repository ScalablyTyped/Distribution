package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWriteBuildIdMod {
  
  @JSImport("next/dist/build/write-build-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeBuildId(distDir: String, buildId: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBuildId")(distDir.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
