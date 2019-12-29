package typings.parchment

import typings.parchment.distSrcRegistryMod.Scope
import typings.std.HTMLDivElement
import typings.std.MutationObserver
import typings.std.MutationRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/scroll", JSImport.Namespace)
@js.native
object distSrcBlotScrollMod extends js.Object {
  @js.native
  trait ScrollBlot
    extends typings.parchment.distSrcBlotAbstractContainerMod.default {
    var observer: MutationObserver = js.native
    def update(): Unit = js.native
    def update(mutations: js.Array[MutationRecord]): Unit = js.native
  }
  
  @js.native
  class default protected () extends ScrollBlot {
    def this(node: HTMLDivElement) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var blotName: String = js.native
    var defaultChild: String = js.native
    var scope: Scope = js.native
    var tagName: String = js.native
  }
  
}

