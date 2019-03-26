package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object childUnderscoreProcessMod {
  /* Rewritten from type alias, can be one of: 
    - nodeLib.nodeLibStrings.pipe
    - nodeLib.nodeLibStrings.ignore
    - nodeLib.nodeLibStrings.inherit
    - js.Array[
  js.UndefOr[
    nodeLib.nodeLibStrings.pipe | nodeLib.nodeLibStrings.ipc | nodeLib.nodeLibStrings.ignore | nodeLib.nodeLibStrings.inherit | nodeLib.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = _StdioOptions | (js.Array[
    js.UndefOr[
      nodeLib.nodeLibStrings.pipe | nodeLib.nodeLibStrings.ipc | nodeLib.nodeLibStrings.ignore | nodeLib.nodeLibStrings.inherit | nodeLib.streamMod.Stream | scala.Double | scala.Null
    ]
  ])
}
