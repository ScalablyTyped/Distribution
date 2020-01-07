package typings.ol.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclutterItems extends js.Object {
  var items: js.Array[_]
  var opacity: Double
}

object DeclutterItems {
  @scala.inline
  def apply(items: js.Array[_], opacity: Double): DeclutterItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeclutterItems]
  }
}

