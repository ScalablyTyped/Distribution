package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing abbreviated remote object value.
  * @experimental
  */
trait ObjectPreview extends js.Object {
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * List of the entries. Specified for <code>map</code> and <code>set</code> subtype values only.
    */
  var entries: js.UndefOr[js.Array[EntryPreview]] = js.undefined
  /**
    * True iff some of the properties or entries of the original object did not fit.
    */
  var overflow: Boolean
  /**
    * List of the properties.
    */
  var properties: js.Array[PropertyPreview]
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[String] = js.undefined
  /**
    * Object type.
    */
  var `type`: String
}

object ObjectPreview {
  @scala.inline
  def apply(
    overflow: Boolean,
    properties: js.Array[PropertyPreview],
    `type`: String,
    description: String = null,
    entries: js.Array[EntryPreview] = null,
    subtype: String = null
  ): ObjectPreview = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPreview]
  }
}

