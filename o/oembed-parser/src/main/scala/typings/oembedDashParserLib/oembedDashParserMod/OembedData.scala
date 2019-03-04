package typings
package oembedDashParserLib.oembedDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OembedData extends js.Object {
  var html: java.lang.String
  var provider_name: java.lang.String
  var provider_url: java.lang.String
  var `type`: java.lang.String
  var version: java.lang.String
}

object OembedData {
  @scala.inline
  def apply(
    html: java.lang.String,
    provider_name: java.lang.String,
    provider_url: java.lang.String,
    `type`: java.lang.String,
    version: java.lang.String
  ): OembedData = {
    val __obj = js.Dynamic.literal(html = html, provider_name = provider_name, provider_url = provider_url, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OembedData]
  }
}

