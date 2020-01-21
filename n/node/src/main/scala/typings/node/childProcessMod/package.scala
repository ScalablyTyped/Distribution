package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object childProcessMod {
  type Serializable = java.lang.String | js.Object | scala.Double | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.pipe
    - typings.node.nodeStrings.ignore
    - typings.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    typings.node.nodeStrings.pipe | typings.node.nodeStrings.ipc | typings.node.nodeStrings.ignore | typings.node.nodeStrings.inherit | typings.node.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = typings.node.childProcessMod._StdioOptions | (js.Array[
    js.UndefOr[
      typings.node.nodeStrings.pipe | typings.node.nodeStrings.ipc | typings.node.nodeStrings.ignore | typings.node.nodeStrings.inherit | typings.node.streamMod.Stream | scala.Double | scala.Null
    ]
  ])
  type StdioPipe = js.UndefOr[scala.Null | typings.node.nodeStrings.pipe]
}
