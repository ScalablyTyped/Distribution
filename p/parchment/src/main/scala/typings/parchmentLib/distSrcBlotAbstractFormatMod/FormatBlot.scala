package typings
package parchmentLib.distSrcBlotAbstractFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- parchmentLib.distSrcBlotAbstractBlotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll. Inlined format, formats */ @js.native
trait FormatBlot
  extends parchmentLib.distSrcBlotAbstractContainerMod.default {
  var attributes: parchmentLib.distSrcAttributorStoreMod.default = js.native
  def format(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def formats(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

