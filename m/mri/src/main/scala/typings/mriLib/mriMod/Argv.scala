package typings
package mriLib.mriMod

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
  def apply(
    `_`: js.Array[java.lang.String],
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Argv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Argv]
  }
}

