package typings.node.domainMod

import typings.node.NodeJS.Timer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object NodeJS extends js.Object {
    @js.native
    trait Domain extends EventEmitter {
      def add(emitter: Timer): Unit = js.native
      def add(emitter: EventEmitter): Unit = js.native
      def bind[T /* <: js.Function */](cb: T): T = js.native
      def intercept[T /* <: js.Function */](cb: T): T = js.native
      def remove(emitter: Timer): Unit = js.native
      def remove(emitter: EventEmitter): Unit = js.native
      def run[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
    }
    
  }
  
}

