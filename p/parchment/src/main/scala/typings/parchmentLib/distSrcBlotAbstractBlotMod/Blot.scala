package typings
package parchmentLib.distSrcBlotAbstractBlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blot
  extends parchmentLib.distSrcCollectionLinkedDashNodeMod.LinkedNode {
  var domNode: stdLib.Node = js.native
  @JSName("next")
  var next_Blot: Blot = js.native
  var parent: Parent = js.native
  @JSName("prev")
  var prev_Blot: Blot = js.native
  var scroll: Parent = js.native
  def attach(): scala.Unit = js.native
  def deleteAt(index: scala.Double, length: scala.Double): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def formatAt(index: scala.Double, length: scala.Double, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def insertAt(index: scala.Double, value: java.lang.String): scala.Unit = js.native
  def insertAt(index: scala.Double, value: java.lang.String, `def`: js.Any): scala.Unit = js.native
  def insertInto(parentBlot: Parent): scala.Unit = js.native
  def insertInto(parentBlot: Parent, refBlot: Blot): scala.Unit = js.native
  def isolate(index: scala.Double, length: scala.Double): Blot = js.native
  def offset(): scala.Double = js.native
  def offset(root: Blot): scala.Double = js.native
  def optimize(context: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def optimize(
    mutations: js.Array[stdLib.MutationRecord],
    context: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def replace(target: Blot): scala.Unit = js.native
  def replaceWith(name: java.lang.String, value: js.Any): Blot = js.native
  def replaceWith(replacement: Blot): Blot = js.native
  def split(index: scala.Double): Blot = js.native
  def split(index: scala.Double, force: scala.Boolean): Blot = js.native
  def update(
    mutations: js.Array[stdLib.MutationRecord],
    context: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def wrap(name: java.lang.String, value: js.Any): Parent = js.native
  def wrap(wrapper: Parent): Parent = js.native
}

