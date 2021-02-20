package typings.opentelemetryCore

import typings.opentelemetryCore.anon.RequiredENVIRONMENT
import typings.std.Performance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "BasePlugin")
  @js.native
  abstract class BasePlugin[T] protected ()
    extends typings.opentelemetryCore.basePluginMod.BasePlugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
  }
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "RandomIdGenerator")
  @js.native
  class RandomIdGenerator ()
    extends typings.opentelemetryCore.randomIdGeneratorMod.RandomIdGenerator
  
  object SDK_INFO {
    
    @JSImport("@opentelemetry/core/build/src/platform/browser", "SDK_INFO")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core/build/src/platform/browser", "SDK_INFO.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    @scala.inline
    def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/browser", "SDK_INFO.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/browser", "SDK_INFO.RUNTIME")
    @js.native
    def RUNTIME: String = js.native
    @scala.inline
    def RUNTIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/browser", "SDK_INFO.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "getEnv")
  @js.native
  def getEnv(): RequiredENVIRONMENT = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "hexToBase64")
  @js.native
  def hexToBase64(hexStr: String): String = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "_invokeGlobalShutdown")
  @js.native
  def invokeGlobalShutdown(): Unit = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "notifyOnGlobalShutdown")
  @js.native
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "otperformance")
  @js.native
  val otperformance: Performance = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "unrefTimer")
  @js.native
  def unrefTimer(timer: Double): Unit = js.native
}
