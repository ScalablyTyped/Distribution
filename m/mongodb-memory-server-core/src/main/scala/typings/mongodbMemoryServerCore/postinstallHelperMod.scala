package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postinstallHelperMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/postinstallHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def postInstallEnsureBinary(): js.Promise[scala.Nothing | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("postInstallEnsureBinary")().asInstanceOf[js.Promise[scala.Nothing | Unit]]
  inline def postInstallEnsureBinary(version: String): js.Promise[scala.Nothing | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("postInstallEnsureBinary")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Nothing | Unit]]
  inline def postInstallEnsureBinary(version: String, local: Boolean): js.Promise[scala.Nothing | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("postInstallEnsureBinary")(version.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing | Unit]]
  inline def postInstallEnsureBinary(version: Unit, local: Boolean): js.Promise[scala.Nothing | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("postInstallEnsureBinary")(version.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Nothing | Unit]]
}
