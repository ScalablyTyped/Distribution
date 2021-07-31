package typings.opentelemetryCore

import typings.node.NodeJS.Timer
import typings.node.perfHooksMod.Performance_
import typings.opentelemetryCore.anon.RequiredENVIRONMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/node", "BasePlugin")
  @js.native
  abstract class BasePlugin[T] protected ()
    extends typings.opentelemetryCore.nodeBasePluginMod.BasePlugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
  }
  
  @JSImport("@opentelemetry/core/build/src/platform/node", "RandomIdGenerator")
  @js.native
  class RandomIdGenerator ()
    extends typings.opentelemetryCore.nodeRandomIdGeneratorMod.RandomIdGenerator
  
  object SDK_INFO {
    
    @JSImport("@opentelemetry/core/build/src/platform/node", "SDK_INFO")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core/build/src/platform/node", "SDK_INFO.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    @scala.inline
    def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/node", "SDK_INFO.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/node", "SDK_INFO.RUNTIME")
    @js.native
    def RUNTIME: String = js.native
    @scala.inline
    def RUNTIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/node", "SDK_INFO.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getEnv(): RequiredENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[RequiredENVIRONMENT]
  
  @scala.inline
  def hexToBase64(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBase64")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def invokeGlobalShutdown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_invokeGlobalShutdown")().asInstanceOf[Unit]
  
  @scala.inline
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyOnGlobalShutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@opentelemetry/core/build/src/platform/node", "otperformance")
  @js.native
  val otperformance: Performance_ = js.native
  
  @scala.inline
  def unrefTimer(timer: Timer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefTimer")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
