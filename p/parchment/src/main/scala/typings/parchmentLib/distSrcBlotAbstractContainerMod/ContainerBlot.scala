package typings
package parchmentLib.distSrcBlotAbstractContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(parchmentLib.distSrcBlotAbstractBlotMod.Parent because Would inherit conflicting mutable fields List(domNode, next, parent, prev, scroll))*/
@js.native
trait ContainerBlot
  extends parchmentLib.distSrcBlotAbstractShadowMod.default {
  var children: parchmentLib.distSrcCollectionLinkedDashListMod.default[parchmentLib.distSrcBlotAbstractBlotMod.Blot] = js.native
  @JSName("domNode")
  var domNode_ContainerBlot: stdLib.HTMLElement = js.native
  def appendChild(other: parchmentLib.distSrcBlotAbstractBlotMod.Blot): scala.Unit = js.native
  def build(): scala.Unit = js.native
  def descendant(
    criteria: js.Function1[/* blot */ parchmentLib.distSrcBlotAbstractBlotMod.Blot, scala.Boolean],
    index: scala.Double
  ): js.Tuple2[parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null, scala.Double] = js.native
  def descendant(criteria: parchmentLib.Anon_Blot, index: scala.Double): js.Tuple2[parchmentLib.distSrcBlotAbstractBlotMod.Blot | scala.Null, scala.Double] = js.native
  def descendants(
    criteria: js.Function1[/* blot */ parchmentLib.distSrcBlotAbstractBlotMod.Blot, scala.Boolean],
    index: scala.Double,
    length: scala.Double
  ): js.Array[parchmentLib.distSrcBlotAbstractBlotMod.Blot] = js.native
  def descendants(criteria: parchmentLib.Anon_Blot, index: scala.Double, length: scala.Double): js.Array[parchmentLib.distSrcBlotAbstractBlotMod.Blot] = js.native
  def insertBefore(childBlot: parchmentLib.distSrcBlotAbstractBlotMod.Blot): scala.Unit = js.native
  def insertBefore(
    childBlot: parchmentLib.distSrcBlotAbstractBlotMod.Blot,
    refBlot: parchmentLib.distSrcBlotAbstractBlotMod.Blot
  ): scala.Unit = js.native
  def moveChildren(targetParent: parchmentLib.distSrcBlotAbstractBlotMod.Parent): scala.Unit = js.native
  def moveChildren(
    targetParent: parchmentLib.distSrcBlotAbstractBlotMod.Parent,
    refNode: parchmentLib.distSrcBlotAbstractBlotMod.Blot
  ): scala.Unit = js.native
  def path(index: scala.Double): js.Array[js.Tuple2[parchmentLib.distSrcBlotAbstractBlotMod.Blot, scala.Double]] = js.native
  def path(index: scala.Double, inclusive: scala.Boolean): js.Array[js.Tuple2[parchmentLib.distSrcBlotAbstractBlotMod.Blot, scala.Double]] = js.native
  def removeChild(child: parchmentLib.distSrcBlotAbstractBlotMod.Blot): scala.Unit = js.native
  def unwrap(): scala.Unit = js.native
}

