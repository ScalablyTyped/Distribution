package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reference")
@js.native
class Reference ()
  extends nodegitLib.referenceMod.Reference

@JSImport("nodegit", "Reference")
@js.native
object Reference extends js.Object {
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    id: nodegitLib.oidMod.Oid,
    force: scala.Double,
    logMessage: java.lang.String
  ): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def createMatching(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    id: nodegitLib.oidMod.Oid,
    force: scala.Double,
    currentId: nodegitLib.oidMod.Oid,
    logMessage: java.lang.String
  ): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String, callback: js.Function): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.referenceMod.Reference): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def dwim(
    repo: nodegitLib.repositoryMod.Repository,
    id: nodegitLib.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def ensureLog(repo: nodegitLib.repositoryMod.Repository, refname: java.lang.String): scala.Double = js.native
  def hasLog(repo: nodegitLib.repositoryMod.Repository, refname: java.lang.String): scala.Double = js.native
  def isValidName(refname: java.lang.String): scala.Double = js.native
  def list(repo: nodegitLib.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String, callback: js.Function): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.referenceMod.Reference): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def lookup(
    repo: nodegitLib.repositoryMod.Repository,
    id: nodegitLib.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def nameToId(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def normalizeName(bufferOut: java.lang.String, bufferSize: scala.Double, name: java.lang.String, flags: scala.Double): scala.Double = js.native
  def remove(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): scala.Double = js.native
  def symbolicCreate(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    target: java.lang.String,
    force: scala.Double,
    logMessage: java.lang.String
  ): js.Promise[nodegitLib.referenceMod.Reference] = js.native
  def symbolicCreateMatching(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    target: java.lang.String,
    force: scala.Double,
    currentValue: java.lang.String,
    logMessage: java.lang.String
  ): js.Promise[nodegitLib.referenceMod.Reference] = js.native
}

