package typings.pg.mod

import typings.node.eventsMod.EventEmitter
import typings.pg.pgStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "Events")
@js.native
class Events () extends EventEmitter {
  
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ Error, /* client */ Client, Unit]): this.type = js.native
}
