package typings.nodeDashSnap7.nodeDashSnap7Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiVarsReadResult extends js.Object {
   //Error Code
  var Data: Buffer
  var Result: Double
}

object MultiVarsReadResult {
  @scala.inline
  def apply(Data: Buffer, Result: Double): MultiVarsReadResult = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiVarsReadResult]
  }
}

