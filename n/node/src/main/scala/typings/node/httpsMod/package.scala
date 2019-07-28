package typings.node

import typings.node.Anon_RejectUnauthorized
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsMod {
  type RequestOptions = typings.node.httpMod.RequestOptions with SecureContextOptions with Anon_RejectUnauthorized
  type ServerOptions = SecureContextOptions with TlsOptions with typings.node.httpMod.ServerOptions
}
