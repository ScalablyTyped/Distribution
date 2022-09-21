package typings.pg.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.pg.pgStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "Events")
@js.native
open class Events () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* client */ Client, Unit]): this.type = js.native
}
