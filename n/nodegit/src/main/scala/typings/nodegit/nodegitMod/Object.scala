package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Object")
@js.native
class Object ()
  extends typings.nodegit.objectMod.Object

/* static members */
@JSImport("nodegit", "Object")
@js.native
object Object extends js.Object {
  def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.oidMod.Oid,
    `type`: typings.nodegit.objectMod.Object.TYPE
  ): js.Promise[typings.nodegit.objectMod.Object] = js.native
  def lookupPrefix(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.oidMod.Oid,
    len: Double,
    `type`: typings.nodegit.objectMod.Object.TYPE
  ): js.Promise[typings.nodegit.objectMod.Object] = js.native
  def size(`type`: typings.nodegit.objectMod.Object.TYPE): Double = js.native
  def string2Type(str: String): typings.nodegit.objectMod.Object.TYPE = js.native
  def type2String(`type`: typings.nodegit.objectMod.Object.TYPE): String = js.native
  def typeisloose(`type`: typings.nodegit.objectMod.Object.TYPE): Double = js.native
  type TYPE = typings.nodegit.objectMod.Object.TYPE
}

