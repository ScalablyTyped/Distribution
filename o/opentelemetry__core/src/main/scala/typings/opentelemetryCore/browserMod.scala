package typings.opentelemetryCore

import typings.opentelemetryCore.anon.RequiredENVIRONMENT
import typings.std.Performance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/platform/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  def getEnv(): RequiredENVIRONMENT = js.native
  
  def hexToBase64(hexStr: String): String = js.native
  
  @JSName("_invokeGlobalShutdown")
  def invokeGlobalShutdown(): Unit = js.native
  
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  val otperformance: Performance = js.native
  
  def unrefTimer(timer: Double): Unit = js.native
  
  @js.native
  abstract class BasePlugin[T] ()
    extends typings.opentelemetryCore.basePluginMod.BasePlugin[T]
  
  @js.native
  class RandomIdGenerator ()
    extends typings.opentelemetryCore.randomIdGeneratorMod.RandomIdGenerator
  
  @js.native
  object SDK_INFO extends js.Object {
    
    var LANGUAGE: String = js.native
    
    var NAME: String = js.native
    
    var RUNTIME: String = js.native
    
    var VERSION: String = js.native
  }
}
