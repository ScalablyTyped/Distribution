package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date
  extends meteorLib.MongoNs.CurrentDateModifier
     with meteorLib.mongoMod.MongoNs.CurrentDateModifier {
  @JSName("$type")
  var $type: meteorLib.meteorLibStrings.timestamp | meteorLib.meteorLibStrings.date
}

object Anon_Date {
  @scala.inline
  def apply($type: meteorLib.meteorLibStrings.timestamp | meteorLib.meteorLibStrings.date): Anon_Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

