package typings.parchment.distSrcBlotAbstractBlotMod

import org.scalablytyped.runtime.StringDictionary
import typings.parchment.distSrcCollectionLinkedDashNodeMod.LinkedNode
import typings.std.MutationRecord
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blot extends LinkedNode {
  var domNode: Node = js.native
  @JSName("next")
  var next_Blot: Blot = js.native
  var parent: Parent = js.native
  @JSName("prev")
  var prev_Blot: Blot = js.native
  var scroll: Parent = js.native
  def attach(): Unit = js.native
  def deleteAt(index: Double, length: Double): Unit = js.native
  def detach(): Unit = js.native
  def formatAt(index: Double, length: Double, name: String, value: js.Any): Unit = js.native
  def insertAt(index: Double, value: String): Unit = js.native
  def insertAt(index: Double, value: String, `def`: js.Any): Unit = js.native
  def insertInto(parentBlot: Parent): Unit = js.native
  def insertInto(parentBlot: Parent, refBlot: Blot): Unit = js.native
  def isolate(index: Double, length: Double): Blot = js.native
  def offset(): Double = js.native
  def offset(root: Blot): Double = js.native
  def optimize(context: StringDictionary[js.Any]): Unit = js.native
  def optimize(mutations: js.Array[MutationRecord], context: StringDictionary[js.Any]): Unit = js.native
  def remove(): Unit = js.native
  def replace(target: Blot): Unit = js.native
  def replaceWith(name: String, value: js.Any): Blot = js.native
  def replaceWith(replacement: Blot): Blot = js.native
  def split(index: Double): Blot = js.native
  def split(index: Double, force: Boolean): Blot = js.native
  def update(mutations: js.Array[MutationRecord], context: StringDictionary[js.Any]): Unit = js.native
  def wrap(name: String, value: js.Any): Parent = js.native
  def wrap(wrapper: Parent): Parent = js.native
}

