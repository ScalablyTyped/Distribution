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
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - nodeLib.Buffer
    - nodeLib.urlMod.URL
  */
  type PathLike = _PathLike | java.lang.String
  type WriteFileOptions = nodeLib.Anon_EncodingFlagMode | java.lang.String | scala.Null
}
