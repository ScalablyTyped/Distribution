package typings.plist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlistObject
  extends /* x */ StringDictionary[PlistValue]
     with _PlistValue

object PlistObject {
  @scala.inline
  def apply(): PlistObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlistObject]
  }
}

