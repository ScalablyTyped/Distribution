package typings
package parchmentLib.distSrcBlotAbstractShadowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/shadow", JSImport.Default)
@js.native
class default protected () extends ShadowBlot {
  def this(domNode: stdLib.Node) = this()
  /* CompleteClass */
  override var next: parchmentLib.distSrcCollectionLinkedDashNodeMod.LinkedNode | scala.Null = js.native
  /* CompleteClass */
  override var prev: parchmentLib.distSrcCollectionLinkedDashNodeMod.LinkedNode | scala.Null = js.native
  /* CompleteClass */
  override def length(): scala.Double = js.native
}

@JSImport("parchment/dist/src/blot/abstract/shadow", JSImport.Default)
@js.native
object default extends js.Object {
  var blotName: java.lang.String = js.native
  var className: java.lang.String = js.native
  var scope: parchmentLib.distSrcRegistryMod.Scope = js.native
  var tagName: java.lang.String = js.native
  def create(value: js.Any): stdLib.Node = js.native
}

