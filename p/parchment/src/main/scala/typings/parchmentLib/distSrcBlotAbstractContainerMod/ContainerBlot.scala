package typings
package parchmentLib.distSrcBlotAbstractContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- parchmentLib.distSrcBlotAbstractBlotMod.Parent because var conflicts: domNode, next, parent, prev, scroll. Inlined children, appendChild, descendant, descendant, descendants, descendants, insertBefore, insertBefore, moveChildren, moveChildren, path, path, removeChild, unwrap */ @js.native
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
  def descendant[T](`type`: parchmentLib.Anon_T[T], index: scala.Double): js.Tuple2[T, scala.Double] = js.native
  @JSName("descendant")
  def descendant_T[T](
    matcher: js.Function1[/* blot */ parchmentLib.distSrcBlotAbstractBlotMod.Blot, scala.Boolean],
    index: scala.Double
  ): js.Tuple2[T, scala.Double] = js.native
  def descendants(
    criteria: js.Function1[/* blot */ parchmentLib.distSrcBlotAbstractBlotMod.Blot, scala.Boolean],
    index: scala.Double,
    length: scala.Double
  ): js.Array[parchmentLib.distSrcBlotAbstractBlotMod.Blot] = js.native
  def descendants(criteria: parchmentLib.Anon_Blot, index: scala.Double, length: scala.Double): js.Array[parchmentLib.distSrcBlotAbstractBlotMod.Blot] = js.native
  def descendants[T](`type`: parchmentLib.Anon_T[T], index: scala.Double, length: scala.Double): js.Array[T] = js.native
  @JSName("descendants")
  def descendants_T[T](
    matcher: js.Function1[/* blot */ parchmentLib.distSrcBlotAbstractBlotMod.Blot, scala.Boolean],
    index: scala.Double,
    length: scala.Double
  ): js.Array[T] = js.native
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

