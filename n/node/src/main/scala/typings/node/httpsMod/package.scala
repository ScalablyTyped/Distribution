package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsMod {
  type RequestOptions = typings.node.httpMod.RequestOptions with typings.node.tlsMod.SecureContextOptions with typings.node.AnonRejectUnauthorized
  type ServerOptions = typings.node.tlsMod.SecureContextOptions with typings.node.tlsMod.TlsOptions with typings.node.httpMod.ServerOptions
}
