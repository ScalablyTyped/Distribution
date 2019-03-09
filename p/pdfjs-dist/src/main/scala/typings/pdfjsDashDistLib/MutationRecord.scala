package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationRecord extends js.Object {
  val addedNodes: NodeList
  /**
    * Returns the local name of the
    * changed attribute, and null otherwise.
    */
  val attributeName: java.lang.String | scala.Null
  /**
    * Returns the namespace of the
    * changed attribute, and null otherwise.
    */
  val attributeNamespace: java.lang.String | scala.Null
  /**
    * Return the previous and next sibling respectively
    * of the added or removed nodes, and null otherwise.
    */
  val nextSibling: Node | scala.Null
  /**
    * The return value depends on type. For
    * "attributes", it is the value of the
    * changed attribute before the change.
    * For "characterData", it is the data of the changed node before the change. For
    * "childList", it is null.
    */
  val oldValue: java.lang.String | scala.Null
  val previousSibling: Node | scala.Null
  /**
    * Return the nodes added and removed
    * respectively.
    */
  val removedNodes: NodeList
  val target: Node
  /**
    * Returns "attributes" if it was an attribute mutation.
    * "characterData" if it was a mutation to a CharacterData node. And
    * "childList" if it was a mutation to the tree of nodes.
    */
  val `type`: MutationRecordType
}

@JSGlobal("MutationRecord")
@js.native
object MutationRecord
  extends org.scalablytyped.runtime.Instantiable0[MutationRecord]

