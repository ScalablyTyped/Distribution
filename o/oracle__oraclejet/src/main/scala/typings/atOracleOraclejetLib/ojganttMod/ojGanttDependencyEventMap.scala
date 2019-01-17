package typings
package atOracleOraclejetLib.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttDependencyEventMap
  extends stdLib.HTMLElementEventMap {
  var predecessorTaskIdChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var shortDescChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var successorTaskIdChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var svgClassNameChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var svgStyleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var typeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.finishStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.finishFinish | atOracleOraclejetLib.atOracleOraclejetLibStrings.startStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.startFinish
  ]
}

