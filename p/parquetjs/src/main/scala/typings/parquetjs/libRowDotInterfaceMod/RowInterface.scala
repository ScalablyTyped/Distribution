package typings.parquetjs.libRowDotInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowInterface
  extends /* key */ StringDictionary[ScalarType | ArrayType | RowInterface | js.Array[RowInterface]]

object RowInterface {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[ScalarType | ArrayType | RowInterface | js.Array[RowInterface]] = null
  ): RowInterface = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RowInterface]
  }
}

