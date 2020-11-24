package typings.nodegit.referenceMod.Reference

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/reference", "Reference")
@js.native
object ^ extends js.Object {
  
  def create(repo: Repository, name: String, id: Oid, force: Double, logMessage: String): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def createMatching(repo: Repository, name: String, id: Oid, force: Double, currentId: Oid, logMessage: String): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def dwim(repo: Repository, id: String): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def dwim(repo: Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def dwim(repo: Repository, id: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def dwim(repo: Repository, id: typings.nodegit.referenceMod.Reference, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def ensureLog(repo: Repository, refname: String): Double = js.native
  
  def hasLog(repo: Repository, refname: String): Double = js.native
  
  def isValidName(refname: String): Double = js.native
  
  def list(repo: Repository): js.Promise[js.Array[_]] = js.native
  
  def lookup(repo: Repository, id: String): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def lookup(repo: Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def lookup(repo: Repository, id: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  def lookup(repo: Repository, id: typings.nodegit.referenceMod.Reference, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def nameToId(repo: Repository, name: String): js.Promise[Oid] = js.native
  
  def normalizeName(bufferOut: String, bufferSize: Double, name: String, flags: Double): Double = js.native
  
  def remove(repo: Repository, name: String): Double = js.native
  
  def symbolicCreate(repo: Repository, name: String, target: String, force: Double, logMessage: String): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
  
  def symbolicCreateMatching(
    repo: Repository,
    name: String,
    target: String,
    force: Double,
    currentValue: String,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = js.native
}
