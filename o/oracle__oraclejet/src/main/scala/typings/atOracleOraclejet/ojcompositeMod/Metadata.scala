package typings.atOracleOraclejet.ojcompositeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var events: js.UndefOr[js.Object] = js.undefined
  var jetVersion: String
  var methods: js.UndefOr[js.Object] = js.undefined
  var name: String
  var properties: js.UndefOr[js.Object] = js.undefined
  var slots: js.UndefOr[js.Object] = js.undefined
  var version: String
}

object Metadata {
  @scala.inline
  def apply(
    jetVersion: String,
    name: String,
    version: String,
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

