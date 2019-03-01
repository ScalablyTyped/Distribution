package typings
package mriLib.mriMod.mriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argv
  extends DictionaryObject[js.Any] {
  /** anything after `--` or between options */
  var `_`: js.Array[java.lang.String]
}

object Argv {
  @scala.inline
  def apply(`_`: js.Array[java.lang.String]): Argv = {
    val __obj = js.Dynamic.literal(`_` = `_`)
  
    __obj.asInstanceOf[Argv]
  }
}

