package typings.nodegit.referenceMod

import typings.nodegit.objectMod.Object
import typings.nodegit.objectMod.Object.TYPE
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/reference", "Reference")
@js.native
class Reference_ () extends js.Object {
  def cmp(ref2: Reference): Double = js.native
  def delete(): Double = js.native
  def dup(): js.Promise[Reference] = js.native
  def isBranch(): Double = js.native
  def isConcrete(): Boolean = js.native
  def isHead(): Boolean = js.native
  def isNote(): Double = js.native
  def isRemote(): Double = js.native
  def isSymbolic(): Boolean = js.native
  def isTag(): Double = js.native
  def isValid(): Boolean = js.native
  def name(): String = js.native
  def owner(): Repository = js.native
  def peel(`type`: TYPE): js.Promise[Object] = js.native
  def rename(newName: String, force: Double, logMessage: String): js.Promise[Reference] = js.native
  def resolve(): js.Promise[Reference] = js.native
  def setTarget(id: Oid, logMessage: String): js.Promise[Reference] = js.native
  def shorthand(): String = js.native
  def symbolicSetTarget(target: String, logMessage: String): js.Promise[Reference] = js.native
  def symbolicTarget(): String = js.native
  def target(): Oid = js.native
  def targetPeel(): Oid = js.native
  def `type`(): Double = js.native
}

