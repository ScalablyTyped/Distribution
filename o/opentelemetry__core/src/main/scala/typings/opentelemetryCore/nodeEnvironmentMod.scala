package typings.opentelemetryCore

import typings.opentelemetryCore.anon.RequiredENVIRONMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEnvironmentMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnv(): RequiredENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[RequiredENVIRONMENT]
}
