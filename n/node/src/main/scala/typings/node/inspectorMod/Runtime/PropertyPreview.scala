package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
trait PropertyPreview extends js.Object {
  /**
    * Property name.
    */
  var name: String
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[String] = js.undefined
  /**
    * Object type. Accessor means that the property itself is an accessor property.
    */
  var `type`: String
  /**
    * User-friendly property value string.
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * Nested value preview.
    */
  var valuePreview: js.UndefOr[ObjectPreview] = js.undefined
}

object PropertyPreview {
  @scala.inline
  def apply(
    name: String,
    `type`: String,
    subtype: String = null,
    value: String = null,
    valuePreview: ObjectPreview = null
  ): PropertyPreview = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valuePreview != null) __obj.updateDynamic("valuePreview")(valuePreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPreview]
  }
}

