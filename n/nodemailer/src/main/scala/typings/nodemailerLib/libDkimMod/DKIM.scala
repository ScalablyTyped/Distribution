package typings
package nodemailerLib.libDkimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKIM extends js.Object {
  var keys: js.Array[java.lang.String | nodemailerLib.Anon_Key]
  var options: nodemailerLib.libDkimMod.DKIMNs.Options
}

object DKIM {
  @scala.inline
  def apply(
    keys: js.Array[java.lang.String | nodemailerLib.Anon_Key],
    options: nodemailerLib.libDkimMod.DKIMNs.Options
  ): DKIM = {
    val __obj = js.Dynamic.literal(keys = keys, options = options)
  
    __obj.asInstanceOf[DKIM]
  }
}

