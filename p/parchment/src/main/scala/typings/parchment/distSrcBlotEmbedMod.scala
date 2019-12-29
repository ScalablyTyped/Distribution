package typings.parchment

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/embed", JSImport.Namespace)
@js.native
object distSrcBlotEmbedMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.parchment.distSrcCollectionLinkedDashNodeMod.LinkedNode because Already inherited
  - typings.parchment.distSrcBlotAbstractBlotMod.Blot because Already inherited
  - typings.parchment.distSrcBlotAbstractBlotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll. Inlined format, formats */ @js.native
  trait EmbedBlot
    extends typings.parchment.distSrcBlotAbstractLeafMod.default {
    def format(name: String, value: js.Any): Unit = js.native
    def formats(): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  class default () extends EmbedBlot
  
  /* static members */
  @js.native
  object default extends js.Object {
    def formats(domNode: HTMLElement): js.Any = js.native
  }
  
}

