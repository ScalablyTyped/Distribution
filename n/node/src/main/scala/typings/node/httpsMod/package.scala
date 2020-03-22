package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsMod {
  type ServerOptions = typings.node.tlsMod.SecureContextOptions with typings.node.tlsMod.TlsOptions with typings.node.httpMod.ServerOptions
}
