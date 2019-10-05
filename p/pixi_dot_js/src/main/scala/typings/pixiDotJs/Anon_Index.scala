package typings.pixiDotJs

import typings.pixiDotJs.PIXI.FilterDataStackItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: Double
  var stack: js.Array[FilterDataStackItem]
}

object Anon_Index {
  @scala.inline
  def apply(index: Double, stack: js.Array[FilterDataStackItem]): Anon_Index = {
    val __obj = js.Dynamic.literal(index = index, stack = stack)
  
    __obj.asInstanceOf[Anon_Index]
  }
}

