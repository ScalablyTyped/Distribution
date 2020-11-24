package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reference")
@js.native
class Reference ()
  extends typings.nodegit.referenceMod.Reference
/* static members */
@JSImport("nodegit", "Reference")
@js.native
object Reference extends js.Object {
  
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    id: typings.nodegit.oidMod.Oid,
    force: Double,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def createMatching(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    id: typings.nodegit.oidMod.Oid,
    force: Double,
    currentId: typings.nodegit.oidMod.Oid,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def dwim(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def dwim(repo: typings.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def dwim(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def dwim(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def ensureLog(repo: typings.nodegit.repositoryMod.Repository, refname: String): Double = js.native
  
  def hasLog(repo: typings.nodegit.repositoryMod.Repository, refname: String): Double = js.native
  
  def isValidName(refname: String): Double = js.native
  
  def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def nameToId(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  def normalizeName(bufferOut: String, bufferSize: Double, name: String, flags: Double): Double = js.native
  
  def remove(repo: typings.nodegit.repositoryMod.Repository, name: String): Double = js.native
  
  def symbolicCreate(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def symbolicCreateMatching(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    currentValue: String,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
}
