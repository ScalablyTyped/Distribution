package typings
package placesLib.placesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacesOptions extends js.Object {
  var apiKey: java.lang.String
  var appId: java.lang.String
  var container: java.lang.String | stdLib.HTMLInputElement | stdLib.NodeList | stdLib.Element
}

object PlacesOptions {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    appId: java.lang.String,
    container: java.lang.String | stdLib.HTMLInputElement | stdLib.NodeList | stdLib.Element
  ): PlacesOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, appId = appId, container = container.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlacesOptions]
  }
}

