package typings.parchment

import org.scalablytyped.runtime.StringDictionary
import typings.parchment.distSrcBlotAbstractFormatMod.FormatBlot
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/format", JSImport.Namespace)
@js.native
object distSrcBlotAbstractFormatMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.parchment.distSrcCollectionLinkedDashNodeMod.LinkedNode because Already inherited
  - typings.parchment.distSrcBlotAbstractBlotMod.Blot because Already inherited
  - typings.parchment.distSrcBlotAbstractBlotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll. Inlined format, formats */ @js.native
  trait FormatBlot
    extends typings.parchment.distSrcBlotAbstractContainerMod.default {
    var attributes: typings.parchment.distSrcAttributorStoreMod.default = js.native
    def format(name: String, value: js.Any): Unit = js.native
    def formats(): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  class default protected () extends FormatBlot {
    def this(domNode: Node) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def formats(domNode: HTMLElement): js.Any = js.native
  }
  
}

