package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexEffect extends js.Object {
  def begin(skeleton: Skeleton): scala.Unit
  def end(): scala.Unit
  def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): scala.Unit
}

