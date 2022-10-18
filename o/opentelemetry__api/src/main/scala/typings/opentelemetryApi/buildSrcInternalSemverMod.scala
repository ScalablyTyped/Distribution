package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInternalSemverMod {
  
  @JSImport("@opentelemetry/api/build/src/internal/semver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCompatible(globalVersion: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompatible")(globalVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeCompatibilityCheck(ownVersion: String): js.Function1[/* globalVersion */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("_makeCompatibilityCheck")(ownVersion.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* globalVersion */ String, Boolean]]
}
