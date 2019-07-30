package typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProblemArguments extends js.Object {
  var keys: js.Array[String]
  var values: js.Array[String]
}

object IProblemArguments {
  @scala.inline
  def apply(keys: js.Array[String], values: js.Array[String]): IProblemArguments = {
    val __obj = js.Dynamic.literal(keys = keys, values = values)
  
    __obj.asInstanceOf[IProblemArguments]
  }
}

