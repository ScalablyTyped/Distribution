package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticPlots extends js.Object {
  def resize(root: Root): scala.Unit
}

object StaticPlots {
  @scala.inline
  def apply(resize: Root => scala.Unit): StaticPlots = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction1(resize))
  
    __obj.asInstanceOf[StaticPlots]
  }
}

