package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfLogger extends StObject {
  
  def annotate(annotations: PerfAnnotations): Unit = js.native
  
  def point(name: String): Unit = js.native
  def point(name: String, opts: PerfLoggerPointOptions): Unit = js.native
  
  def subSpan(label: String): PerfLogger = js.native
}
