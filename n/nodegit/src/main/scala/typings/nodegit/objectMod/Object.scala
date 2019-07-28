package typings.nodegit.objectMod

import typings.nodegit.bufMod.Buf
import typings.nodegit.objectMod.ObjectNs.TYPE
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/object", "Object")
@js.native
class Object () extends js.Object {
  def dup(): js.Promise[Object] = js.native
  def free(): Unit = js.native
  def id(): Oid = js.native
  def lookupByPath(path: String, `type`: TYPE): js.Promise[Object] = js.native
  def owner(): Repository = js.native
  def peel(targetType: Double): js.Promise[Object] = js.native
  def shortId(): js.Promise[Buf] = js.native
  def `type`(): Double = js.native
}

/* static members */
@JSImport("nodegit/object", "Object")
@js.native
object Object extends js.Object {
  def lookup(repo: Repository, id: Oid, `type`: TYPE): js.Promise[Object] = js.native
  def lookupPrefix(repo: Repository, id: Oid, len: Double, `type`: TYPE): js.Promise[Object] = js.native
  def size(`type`: TYPE): Double = js.native
  def string2Type(str: String): TYPE = js.native
  def type2String(`type`: TYPE): String = js.native
  def typeisloose(`type`: TYPE): Double = js.native
}

