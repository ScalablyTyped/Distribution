package typings
package pathjsLib.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDictionary[T]
  extends /* id */ org.scalablytyped.runtime.StringDictionary[T]

object IDictionary {
  @scala.inline
  def apply[T](StringDictionary: /* id */ org.scalablytyped.runtime.StringDictionary[T] = null): IDictionary[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IDictionary[T]]
  }
}

