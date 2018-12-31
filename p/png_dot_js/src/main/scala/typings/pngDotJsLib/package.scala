package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pngDotJsLib {
  type BitDepth = pngDotJsLib.pngDotJsLibNumbers.`2` | pngDotJsLib.pngDotJsLibNumbers.`4` | pngDotJsLib.pngDotJsLibNumbers.`8` | pngDotJsLib.pngDotJsLibNumbers.`16`
  type ColorType = pngDotJsLib.pngDotJsLibNumbers.`0` | pngDotJsLib.pngDotJsLibNumbers.`2` | pngDotJsLib.pngDotJsLibNumbers.`3` | pngDotJsLib.pngDotJsLibNumbers.`4` | pngDotJsLib.pngDotJsLibNumbers.`6`
  type ParseCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error], 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify PNG */ /* png */ js.Any, 
    scala.Unit
  ]
}
