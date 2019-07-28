package typings.parchment.distSrcBlotEmbedMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.parchment.distSrcBlotAbstractBlotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll. Inlined format, formats */ @js.native
trait EmbedBlot
  extends typings.parchment.distSrcBlotAbstractLeafMod.default {
  def format(name: String, value: js.Any): Unit = js.native
  def formats(): StringDictionary[js.Any] = js.native
}

