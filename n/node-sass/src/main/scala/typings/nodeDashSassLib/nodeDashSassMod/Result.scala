package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var css: nodeLib.Buffer
  var map: nodeLib.Buffer
  var stats: nodeDashSassLib.Anon_Duration
}

object Result {
  @scala.inline
  def apply(css: nodeLib.Buffer, map: nodeLib.Buffer, stats: nodeDashSassLib.Anon_Duration): Result = {
    val __obj = js.Dynamic.literal(css = css, map = map, stats = stats)
  
    __obj.asInstanceOf[Result]
  }
}

