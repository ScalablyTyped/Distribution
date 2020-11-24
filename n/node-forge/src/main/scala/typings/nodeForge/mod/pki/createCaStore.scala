package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.createCaStore")
@js.native
object createCaStore extends js.Object {
  
  def apply(): CAStore = js.native
  def apply(certs: js.Array[Certificate | PEM]): CAStore = js.native
}
