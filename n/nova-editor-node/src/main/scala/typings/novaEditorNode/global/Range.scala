package typings.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/range/
@JSGlobal("Range")
@js.native
class Range protected ()
  extends typings.novaEditorNode.Range {
  def this(start: Double, end: Double) = this()
  /* CompleteClass */
  override var empty: Boolean = js.native
  /* CompleteClass */
  override var end: Double = js.native
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override var start: Double = js.native
  /* CompleteClass */
  override def compare(other: typings.novaEditorNode.Range): Double = js.native
  /* CompleteClass */
  override def containsIndex(index: Double): Boolean = js.native
  /* CompleteClass */
  override def containsRange(other: typings.novaEditorNode.Range): Boolean = js.native
  /* CompleteClass */
  override def intersection(other: typings.novaEditorNode.Range): typings.novaEditorNode.Range = js.native
  /* CompleteClass */
  override def intersectsRange(other: typings.novaEditorNode.Range): Boolean = js.native
  /* CompleteClass */
  override def isEqual(other: typings.novaEditorNode.Range): Boolean = js.native
  /* CompleteClass */
  override def union(other: typings.novaEditorNode.Range): typings.novaEditorNode.Range = js.native
}

