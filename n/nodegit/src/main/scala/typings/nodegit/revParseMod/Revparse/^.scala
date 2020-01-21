package typings.nodegit.revParseMod.Revparse

import typings.nodegit.objectMod.Object
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/rev-parse", "Revparse")
@js.native
object ^ extends js.Object {
  def ext(objectOut: Object, referenceOut: Reference, repo: Repository, spec: String): Double = js.native
  def single(repo: Repository, spec: String): js.Promise[Object] = js.native
}

