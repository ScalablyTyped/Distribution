package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object httpsMod {
  
  type ServerOptions = typings.node.tlsMod.SecureContextOptions with typings.node.tlsMod.TlsOptions with typings.node.httpMod.ServerOptions
}
