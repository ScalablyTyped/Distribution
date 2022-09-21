package typings.nats.internalModMod

import typings.nats.parserMod.ParserEvent
import typings.nats.queuedIteratorMod.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "Parser")
@js.native
open class Parser protected ()
  extends typings.nats.parserMod.Parser {
  def this(dispatcher: Dispatcher[ParserEvent]) = this()
}
