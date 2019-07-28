package typings.nodeDashSass.nodeDashSassMod

import typings.node.Buffer
import typings.nodeDashSass.Anon_Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var css: Buffer
  var map: Buffer
  var stats: Anon_Duration
}

object Result {
  @scala.inline
  def apply(css: Buffer, map: Buffer, stats: Anon_Duration): Result = {
    val __obj = js.Dynamic.literal(css = css, map = map, stats = stats)
  
    __obj.asInstanceOf[Result]
  }
}

