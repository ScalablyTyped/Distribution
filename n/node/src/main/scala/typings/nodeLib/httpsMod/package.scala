package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsMod {
  type RequestOptions = nodeLib.httpMod.RequestOptions with nodeLib.tlsMod.SecureContextOptions with nodeLib.Anon_RejectUnauthorized
  type ServerOptions = nodeLib.tlsMod.SecureContextOptions with nodeLib.tlsMod.TlsOptions with nodeLib.httpMod.ServerOptions
}
