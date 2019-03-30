package typings
package atNivoSankeyLib.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyDataLink extends js.Object {
  var source: java.lang.String | scala.Double
  var target: java.lang.String | scala.Double
}

object SankeyDataLink {
  @scala.inline
  def apply(source: java.lang.String | scala.Double, target: java.lang.String | scala.Double): SankeyDataLink = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SankeyDataLink]
  }
}

