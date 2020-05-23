package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fuzzyFactory extends js.Object {
  var lookuptable: js.Any
  var multiplier: Double
  def lookupOrCreate(els: js.Any, creatorCallback: js.Any): js.Any
}

object fuzzyFactory {
  @scala.inline
  def apply(lookupOrCreate: (js.Any, js.Any) => js.Any, lookuptable: js.Any, multiplier: Double): fuzzyFactory = {
    val __obj = js.Dynamic.literal(lookupOrCreate = js.Any.fromFunction2(lookupOrCreate), lookuptable = lookuptable.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyFactory]
  }
}

