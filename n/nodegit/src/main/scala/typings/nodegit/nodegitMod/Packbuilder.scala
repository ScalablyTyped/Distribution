package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Packbuilder")
@js.native
class Packbuilder ()
  extends typings.nodegit.packDashBuilderMod.Packbuilder

/* static members */
@JSImport("nodegit", "Packbuilder")
@js.native
object Packbuilder extends js.Object {
  def create(repo: typings.nodegit.repositoryMod.Repository): typings.nodegit.packDashBuilderMod.Packbuilder = js.native
  type STAGE = typings.nodegit.packDashBuilderMod.Packbuilder.STAGE
}

