package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends typings.nodegit.revDashParseMod.Revparse

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
  type MODE = typings.nodegit.revDashParseMod.Revparse.MODE
}

