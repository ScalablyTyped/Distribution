package typings.nodegit.objectMod.Object

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/object", "Object")
@js.native
object ^ extends js.Object {
  def lookup(repo: Repository, id: Oid, `type`: TYPE): js.Promise[typings.nodegit.objectMod.Object] = js.native
  def lookupPrefix(repo: Repository, id: Oid, len: Double, `type`: TYPE): js.Promise[typings.nodegit.objectMod.Object] = js.native
  def size(`type`: TYPE): Double = js.native
  def string2Type(str: String): TYPE = js.native
  def type2String(`type`: TYPE): String = js.native
  def typeisloose(`type`: TYPE): Double = js.native
}

