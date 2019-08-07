package typings.node.inspectorMod.RuntimeNs

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
  var description: js.UndefOr[java.lang.String] = js.undefined
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
  var subtype: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Object type.
    */
  var `type`: java.lang.String
}

object ObjectPreview {
  @scala.inline
  def apply(
    overflow: Boolean,
    properties: js.Array[PropertyPreview],
    `type`: java.lang.String,
    description: java.lang.String = null,
    entries: js.Array[EntryPreview] = null,
    subtype: java.lang.String = null
  ): ObjectPreview = {
    val __obj = js.Dynamic.literal(overflow = overflow, properties = properties)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (subtype != null) __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[ObjectPreview]
  }
}

