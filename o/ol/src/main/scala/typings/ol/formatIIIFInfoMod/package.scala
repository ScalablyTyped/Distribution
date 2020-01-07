package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatIIIFInfoMod {
  import org.scalablytyped.runtime.StringDictionary

  type ImageInformationResponse = StringDictionary[
    String | Double | (js.Array[Double | String | IiifProfile]) | StringDictionary[Double] | TileInfo
  ]
}
