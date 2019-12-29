package typings.mri.mriMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argv
  extends DictionaryObject[js.Any] {
  /** anything after `--` or between options */
  @JSName("_")
  var _underscore: js.Array[String]
}

object Argv {
  @scala.inline
  def apply(_underscore: js.Array[String], StringDictionary: StringDictionary[js.Any] = null): Argv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Argv]
  }
}

