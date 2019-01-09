package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type BinaryData = nodeLib.Buffer | stdLib.DataView | nodeLib.NodeJSNs.TypedArray
  /**
    * Valid types for path values in "fs".
    */
  type PathLike = java.lang.String | nodeLib.Buffer | nodeLib.urlMod.URL
  type WriteFileOptions = nodeLib.Anon_EncodingFlagMode | java.lang.String | scala.Null
}
