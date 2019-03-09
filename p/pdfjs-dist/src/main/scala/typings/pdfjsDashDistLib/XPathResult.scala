package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPathResult extends js.Object {
  val ANY_TYPE: scala.Double
  val ANY_UNORDERED_NODE_TYPE: scala.Double
  val BOOLEAN_TYPE: scala.Double
  val FIRST_ORDERED_NODE_TYPE: scala.Double
  val NUMBER_TYPE: scala.Double
  val ORDERED_NODE_ITERATOR_TYPE: scala.Double
  val ORDERED_NODE_SNAPSHOT_TYPE: scala.Double
  val STRING_TYPE: scala.Double
  val UNORDERED_NODE_ITERATOR_TYPE: scala.Double
  val UNORDERED_NODE_SNAPSHOT_TYPE: scala.Double
  val booleanValue: scala.Boolean
  val invalidIteratorState: scala.Boolean
  val numberValue: scala.Double
  val resultType: scala.Double
  val singleNodeValue: Node
  val snapshotLength: scala.Double
  val stringValue: java.lang.String
  def iterateNext(): Node
  def snapshotItem(index: scala.Double): Node
}

@JSGlobal("XPathResult")
@js.native
object XPathResult
  extends org.scalablytyped.runtime.Instantiable0[XPathResult] {
  val ANY_TYPE: scala.Double = js.native
  val ANY_UNORDERED_NODE_TYPE: scala.Double = js.native
  val BOOLEAN_TYPE: scala.Double = js.native
  val FIRST_ORDERED_NODE_TYPE: scala.Double = js.native
  val NUMBER_TYPE: scala.Double = js.native
  val ORDERED_NODE_ITERATOR_TYPE: scala.Double = js.native
  val ORDERED_NODE_SNAPSHOT_TYPE: scala.Double = js.native
  val STRING_TYPE: scala.Double = js.native
  val UNORDERED_NODE_ITERATOR_TYPE: scala.Double = js.native
  val UNORDERED_NODE_SNAPSHOT_TYPE: scala.Double = js.native
}

