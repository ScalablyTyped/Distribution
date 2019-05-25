package typings
package olLib.sourceCartoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartoDBLayerInfo extends js.Object {
  var cdn_url: org.scalablytyped.runtime.StringDictionary[js.Any]
  var layergroupid: java.lang.String
}

object CartoDBLayerInfo {
  @scala.inline
  def apply(cdn_url: org.scalablytyped.runtime.StringDictionary[js.Any], layergroupid: java.lang.String): CartoDBLayerInfo = {
    val __obj = js.Dynamic.literal(cdn_url = cdn_url, layergroupid = layergroupid)
  
    __obj.asInstanceOf[CartoDBLayerInfo]
  }
}

