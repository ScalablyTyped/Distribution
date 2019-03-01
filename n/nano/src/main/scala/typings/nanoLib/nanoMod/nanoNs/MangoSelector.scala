package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#selector-syntax
trait MangoSelector
  extends /* key */ org.scalablytyped.runtime.StringDictionary[MangoSelector | MangoValue | js.Array[MangoValue]]

object MangoSelector {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[MangoSelector | MangoValue | js.Array[MangoValue]] = null
  ): MangoSelector = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MangoSelector]
  }
}

