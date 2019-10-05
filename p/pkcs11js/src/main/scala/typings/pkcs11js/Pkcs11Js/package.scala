package typings.pkcs11js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Pkcs11Js {
  import typings.node.Buffer

  type Handle = Buffer
  type Template = js.Array[Attribute]
}
