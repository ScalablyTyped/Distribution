package typings
package parchmentLib.distSrcBlotAbstractFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(parchmentLib.distSrcBlotAbstractBlotMod.Formattable because Would inherit conflicting mutable fields List(prev, next, parent, scroll, domNode))*/
@js.native
trait FormatBlot
  extends parchmentLib.distSrcBlotAbstractContainerMod.default {
  var attributes: parchmentLib.distSrcAttributorStoreMod.default = js.native
  def format(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def formats(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

