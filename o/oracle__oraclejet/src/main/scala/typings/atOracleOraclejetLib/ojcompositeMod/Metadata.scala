package typings
package atOracleOraclejetLib.ojcompositeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var events: js.UndefOr[js.Object] = js.undefined
  var jetVersion: java.lang.String
  var methods: js.UndefOr[js.Object] = js.undefined
  var name: java.lang.String
  var properties: js.UndefOr[js.Object] = js.undefined
  var slots: js.UndefOr[js.Object] = js.undefined
  var version: java.lang.String
}

object Metadata {
  @scala.inline
  def apply(
    jetVersion: java.lang.String,
    name: java.lang.String,
    version: java.lang.String,
    events: js.Object = null,
    methods: js.Object = null,
    properties: js.Object = null,
    slots: js.Object = null
  ): Metadata = {
    val __obj = js.Dynamic.literal(jetVersion = jetVersion, name = name, version = version)
    if (events != null) __obj.updateDynamic("events")(events)
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (slots != null) __obj.updateDynamic("slots")(slots)
    __obj.asInstanceOf[Metadata]
  }
}

