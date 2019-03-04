package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiVarsReadResult extends js.Object {
   //Error Code
  var Data: nodeLib.Buffer
  var Result: scala.Double
}

object MultiVarsReadResult {
  @scala.inline
  def apply(Data: nodeLib.Buffer, Result: scala.Double): MultiVarsReadResult = {
    val __obj = js.Dynamic.literal(Data = Data, Result = Result)
  
    __obj.asInstanceOf[MultiVarsReadResult]
  }
}

