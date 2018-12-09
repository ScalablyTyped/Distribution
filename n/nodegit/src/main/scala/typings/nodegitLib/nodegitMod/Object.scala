package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Object")
@js.native
class Object ()
  extends nodegitLib.objectMod.Object

@JSImport("nodegit", "Object")
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

