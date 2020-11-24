package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends typings.nodegit.revParseMod.Revparse
/* static members */
@JSImport("nodegit", "Revparse")
@js.native
object Revparse extends js.Object {
  
  def ext(
    objectOut: typings.nodegit.objectMod.Object,
    referenceOut: typings.nodegit.referenceMod.Reference,
    repo: typings.nodegit.repositoryMod.Repository,
    spec: String
  ): Double = js.native
  
  def single(repo: typings.nodegit.repositoryMod.Repository, spec: String): js.Promise[typings.nodegit.objectMod.Object] = js.native
}
