package typings.minio.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "NotificationPoller")
@js.native
open class NotificationPoller () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  // must to be public?
  def checkForChanges(): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
