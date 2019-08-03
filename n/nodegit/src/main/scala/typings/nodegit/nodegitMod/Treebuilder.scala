package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Treebuilder")
@js.native
class Treebuilder ()
  extends typings.nodegit.treeDashBuilderMod.Treebuilder

/* static members */
@JSImport("nodegit", "Treebuilder")
@js.native
object Treebuilder extends js.Object {
  def create(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.treeDashBuilderMod.Treebuilder] = js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, source: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.treeDashBuilderMod.Treebuilder] = js.native
}

