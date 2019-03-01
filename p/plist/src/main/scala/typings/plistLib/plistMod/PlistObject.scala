package typings
package plistLib.plistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlistObject
  extends _PlistValue
     with /* x */ org.scalablytyped.runtime.StringDictionary[PlistValue]

object PlistObject {
  @scala.inline
  def apply(StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[PlistValue] = null): PlistObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PlistObject]
  }
}

