package typings.nodeVagrant.anon

import typings.nodeVagrant.mod.ErrorArg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cb extends js.Object {
  
  def cb(err: ErrorArg): Unit = js.native
  def cb(err: ErrorArg, out: js.Any): Unit = js.native
  
  var command: String = js.native
}
