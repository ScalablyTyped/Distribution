package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterManagerStackItem extends js.Object {
  var destinationFrame: Rectangle
  var filters: js.Array[Filter[_]]
  var renderTarget: RenderTarget
  var resolution: scala.Double
  var sourceFrame: Rectangle
  var target: js.Any
}

