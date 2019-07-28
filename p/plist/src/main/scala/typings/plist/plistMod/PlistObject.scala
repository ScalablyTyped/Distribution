package typings.plist.plistMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlistObject
  extends /* x */ StringDictionary[PlistValue]
     with _PlistValue

object PlistObject {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[PlistValue] = null): PlistObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PlistObject]
  }
}

