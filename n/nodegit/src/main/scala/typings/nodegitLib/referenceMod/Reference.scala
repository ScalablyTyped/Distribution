package typings
package nodegitLib.referenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/reference", "Reference")
@js.native
class Reference () extends js.Object {
  def cmp(ref2: Reference): scala.Double = js.native
  def delete(): scala.Double = js.native
  def dup(): stdLib.Promise[Reference] = js.native
  def isBranch(): scala.Double = js.native
  def isConcrete(): scala.Boolean = js.native
  def isHead(): scala.Boolean = js.native
  def isNote(): scala.Double = js.native
  def isRemote(): scala.Double = js.native
  def isSymbolic(): scala.Boolean = js.native
  def isTag(): scala.Double = js.native
  def isValid(): scala.Boolean = js.native
  def name(): java.lang.String = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  def peel(`type`: nodegitLib.objectMod.ObjectNs.TYPE): stdLib.Promise[js.Object] = js.native
  def rename(newName: java.lang.String, force: scala.Double, logMessage: java.lang.String): stdLib.Promise[Reference] = js.native
  def resolve(): stdLib.Promise[Reference] = js.native
  def setTarget(id: nodegitLib.oidMod.Oid, logMessage: java.lang.String): stdLib.Promise[Reference] = js.native
  def shorthand(): java.lang.String = js.native
  def symbolicSetTarget(target: java.lang.String, logMessage: java.lang.String): stdLib.Promise[Reference] = js.native
  def symbolicTarget(): java.lang.String = js.native
  def target(): nodegitLib.oidMod.Oid = js.native
  def targetPeel(): nodegitLib.oidMod.Oid = js.native
  def `type`(): scala.Double = js.native
}

@JSImport("nodegit/reference", "Reference")
@js.native
object Reference extends js.Object {
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    id: nodegitLib.oidMod.Oid,
    force: scala.Double,
    logMessage: java.lang.String
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def createMatching(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    id: nodegitLib.oidMod.Oid,
    force: scala.Double,
    currentId: nodegitLib.oidMod.Oid,
    logMessage: java.lang.String
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String, callback: js.Function): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(
    repo: nodegitLib.repositoryMod.Repository,
    id: nodegitLib.referenceMod.Reference,
    callback: js.Function
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def ensureLog(repo: nodegitLib.repositoryMod.Repository, refname: java.lang.String): scala.Double = js.native
  def hasLog(repo: nodegitLib.repositoryMod.Repository, refname: java.lang.String): scala.Double = js.native
  def isValidName(refname: java.lang.String): scala.Double = js.native
  def list(repo: nodegitLib.repositoryMod.Repository): stdLib.Promise[js.Array[_]] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String, callback: js.Function): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def lookup(
    repo: nodegitLib.repositoryMod.Repository,
    id: nodegitLib.referenceMod.Reference,
    callback: js.Function
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def nameToId(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def normalizeName(bufferOut: java.lang.String, bufferSize: scala.Double, name: java.lang.String, flags: scala.Double): scala.Double = js.native
  def remove(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): scala.Double = js.native
  def symbolicCreate(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    target: java.lang.String,
    force: scala.Double,
    logMessage: java.lang.String
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def symbolicCreateMatching(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    target: java.lang.String,
    force: scala.Double,
    currentValue: java.lang.String,
    logMessage: java.lang.String
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
}

