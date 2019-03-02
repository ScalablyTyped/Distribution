package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  type CompressCallback = js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  type InputType = java.lang.String | nodeLib.Buffer | stdLib.DataView | stdLib.ArrayBuffer | nodeLib.NodeJSNs.TypedArray
}
