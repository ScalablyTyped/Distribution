package typings.popmotionPopcorn.interpolateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@popmotion/popcorn/lib/utils/interpolate", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T](input: js.Array[Double], output: js.Array[T]): Mix[T | String | Double] = js.native
  def apply[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): Mix[T | String | Double] = js.native
}

