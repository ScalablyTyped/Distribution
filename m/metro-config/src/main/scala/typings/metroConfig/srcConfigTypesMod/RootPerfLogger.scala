package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.metroConfigStrings.CANCEL
import typings.metroConfig.metroConfigStrings.FAIL
import typings.metroConfig.metroConfigStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootPerfLogger
  extends StObject
     with PerfLogger {
  
  def end(status: SUCCESS | FAIL | CANCEL): Unit = js.native
  def end(status: SUCCESS | FAIL | CANCEL, opts: PerfLoggerPointOptions): Unit = js.native
  
  def start(): Unit = js.native
  def start(opts: PerfLoggerPointOptions): Unit = js.native
}
