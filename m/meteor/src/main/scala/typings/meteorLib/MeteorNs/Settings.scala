package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global props **/
/** Settings **/
trait Settings
  extends /* id */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var public: /* import warning: ImportType.apply Failed type conversion: {[id: string] : any, [id: string] : any} */ js.Any
}

object Settings {
  @scala.inline
  def apply(
    public: /* import warning: ImportType.apply Failed type conversion: {[id: string] : any, [id: string] : any} */ js.Any,
    StringDictionary: /* id */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("public")(public)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Settings]
  }
}

