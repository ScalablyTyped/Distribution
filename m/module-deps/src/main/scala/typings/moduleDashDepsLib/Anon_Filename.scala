package typings
package moduleDashDepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var filename: java.lang.String
  var id: java.lang.String
}

object Anon_Filename {
  @scala.inline
  def apply(
    filename: java.lang.String,
    id: java.lang.String,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Filename = {
    val __obj = js.Dynamic.literal(filename = filename, id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Filename]
  }
}

