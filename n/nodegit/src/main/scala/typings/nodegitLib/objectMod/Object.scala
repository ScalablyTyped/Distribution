package typings
package nodegitLib.objectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/object", "Object")
@js.native
class Object () extends js.Object {
  def dup(): js.Promise[Object] = js.native
  def free(): scala.Unit = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
  def lookupByPath(path: java.lang.String, `type`: nodegitLib.objectMod.ObjectNs.TYPE): js.Promise[Object] = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  def peel(targetType: scala.Double): js.Promise[Object] = js.native
  def shortId(): js.Promise[nodegitLib.bufMod.Buf] = js.native
  def `type`(): scala.Double = js.native
}

/* static members */
@JSImport("nodegit/object", "Object")
@js.native
object Object extends js.Object {
  def lookup(
    repo: nodegitLib.repositoryMod.Repository,
    id: nodegitLib.oidMod.Oid,
    `type`: nodegitLib.objectMod.ObjectNs.TYPE
  ): js.Promise[nodegitLib.objectMod.Object] = js.native
  def lookupPrefix(
    repo: nodegitLib.repositoryMod.Repository,
    id: nodegitLib.oidMod.Oid,
    len: scala.Double,
    `type`: nodegitLib.objectMod.ObjectNs.TYPE
  ): js.Promise[nodegitLib.objectMod.Object] = js.native
  def size(`type`: nodegitLib.objectMod.ObjectNs.TYPE): scala.Double = js.native
  def string2Type(str: java.lang.String): nodegitLib.objectMod.ObjectNs.TYPE = js.native
  def type2String(`type`: nodegitLib.objectMod.ObjectNs.TYPE): java.lang.String = js.native
  def typeisloose(`type`: nodegitLib.objectMod.ObjectNs.TYPE): scala.Double = js.native
}

