package typings.parchment.distSrcBlotAbstractFormatMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.parchment.distSrcBlotAbstractBlotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll. Inlined format, formats */ @js.native
trait FormatBlot
  extends typings.parchment.distSrcBlotAbstractContainerMod.default {
  var attributes: typings.parchment.distSrcAttributorStoreMod.default = js.native
  def format(name: String, value: js.Any): Unit = js.native
  def formats(): StringDictionary[js.Any] = js.native
}

