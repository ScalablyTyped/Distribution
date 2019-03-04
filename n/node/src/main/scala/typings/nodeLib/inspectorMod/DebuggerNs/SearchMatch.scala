package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search match for resource.
  */
trait SearchMatch extends js.Object {
  /**
    * Line with match content.
    */
  var lineContent: java.lang.String
  /**
    * Line number in resource content.
    */
  var lineNumber: scala.Double
}

object SearchMatch {
  @scala.inline
  def apply(lineContent: java.lang.String, lineNumber: scala.Double): SearchMatch = {
    val __obj = js.Dynamic.literal(lineContent = lineContent, lineNumber = lineNumber)
  
    __obj.asInstanceOf[SearchMatch]
  }
}

