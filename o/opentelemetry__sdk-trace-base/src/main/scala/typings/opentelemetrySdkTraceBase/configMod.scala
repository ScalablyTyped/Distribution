package typings.opentelemetrySdkTraceBase

import typings.opentelemetrySdkTraceBase.anon.ForceFlushTimeoutMillis
import typings.opentelemetrySdkTraceBase.anon.RequiredENVIRONMENT
import typings.opentelemetrySdkTraceBase.samplerMod.Sampler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildSamplerFromEnv(): Sampler = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSamplerFromEnv")().asInstanceOf[Sampler]
  inline def buildSamplerFromEnv(environment: RequiredENVIRONMENT): Sampler = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSamplerFromEnv")(environment.asInstanceOf[js.Any]).asInstanceOf[Sampler]
  
  inline def loadDefaultConfig(): ForceFlushTimeoutMillis = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDefaultConfig")().asInstanceOf[ForceFlushTimeoutMillis]
}
