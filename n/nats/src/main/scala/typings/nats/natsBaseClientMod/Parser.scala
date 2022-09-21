package typings.nats.natsBaseClientMod

import typings.nats.parserMod.ParserEvent
import typings.nats.queuedIteratorMod.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "Parser")
@js.native
open class Parser protected ()
  extends typings.nats.internalModMod.Parser {
  def this(dispatcher: Dispatcher[ParserEvent]) = this()
}
