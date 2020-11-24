package typings.opentelemetryCore

import typings.node.NodeJS.Timer
import typings.node.perfHooksMod.Performance_
import typings.opentelemetryCore.anon.RequiredENVIRONMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  
  def getEnv(): RequiredENVIRONMENT = js.native
  
  def hexToBase64(hexStr: String): String = js.native
  
  @JSName("_invokeGlobalShutdown")
  def invokeGlobalShutdown(): Unit = js.native
  
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  val otperformance: Performance_ = js.native
  
  def unrefTimer(timer: Timer): Unit = js.native
  
  @js.native
  abstract class BasePlugin[T] ()
    extends typings.opentelemetryCore.nodeBasePluginMod.BasePlugin[T]
  
  @js.native
  class RandomIdGenerator ()
    extends typings.opentelemetryCore.nodeRandomIdGeneratorMod.RandomIdGenerator
  
  @js.native
  object SDK_INFO extends js.Object {
    
    var LANGUAGE: String = js.native
    
    var NAME: String = js.native
    
    var RUNTIME: String = js.native
    
    var VERSION: String = js.native
  }
}
