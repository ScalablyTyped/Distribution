package typings.opentelemetryCore

import typings.node.NodeJS.Timer
import typings.node.perfHooksMod.Performance_
import typings.opentelemetryCore.anon.RequiredENVIRONMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  @JSImport("@opentelemetry/core/build/src/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform", "BasePlugin")
  @js.native
  abstract class BasePlugin[T] protected ()
    extends typings.opentelemetryCore.nodeMod.BasePlugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
  }
  
  @JSImport("@opentelemetry/core/build/src/platform", "RandomIdGenerator")
  @js.native
  class RandomIdGenerator ()
    extends typings.opentelemetryCore.nodeMod.RandomIdGenerator
  
  object SDK_INFO {
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    inline def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.NAME")
    @js.native
    def NAME: String = js.native
    inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.RUNTIME")
    @js.native
    def RUNTIME: String = js.native
    inline def RUNTIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  inline def getEnv(): RequiredENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[RequiredENVIRONMENT]
  
  inline def hexToBase64(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBase64")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def invokeGlobalShutdown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_invokeGlobalShutdown")().asInstanceOf[Unit]
  
  inline def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyOnGlobalShutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@opentelemetry/core/build/src/platform", "otperformance")
  @js.native
  val otperformance: Performance_ = js.native
  
  inline def unrefTimer(timer: Timer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefTimer")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
