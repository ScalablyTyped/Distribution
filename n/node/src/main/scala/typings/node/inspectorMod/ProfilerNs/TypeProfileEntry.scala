package typings.node.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source offset and types for a parameter or return value.
  * @experimental
  */
trait TypeProfileEntry extends js.Object {
  /**
    * Source offset of the parameter or end of function for return values.
    */
  var offset: Double
  /**
    * The types for this parameter or return value.
    */
  var types: js.Array[TypeObject]
}

object TypeProfileEntry {
  @scala.inline
  def apply(offset: Double, types: js.Array[TypeObject]): TypeProfileEntry = {
    val __obj = js.Dynamic.literal(offset = offset, types = types)
  
    __obj.asInstanceOf[TypeProfileEntry]
  }
}

