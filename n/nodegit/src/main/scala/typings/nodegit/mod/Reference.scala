package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reference")
@js.native
open class Reference ()
  extends typings.nodegit.referenceMod.Reference
/* static members */
object Reference {
  
  @JSImport("nodegit", "Reference")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    id: typings.nodegit.oidMod.Oid,
    force: Double,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], force.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  inline def createMatching(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    id: typings.nodegit.oidMod.Oid,
    force: Double,
    currentId: typings.nodegit.oidMod.Oid,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatching")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], force.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  inline def dwim(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  inline def dwim(repo: typings.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  inline def dwim(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  inline def dwim(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  inline def ensureLog(repo: typings.nodegit.repositoryMod.Repository, refname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLog")(repo.asInstanceOf[js.Any], refname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasLog(repo: typings.nodegit.repositoryMod.Repository, refname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLog")(repo.asInstanceOf[js.Any], refname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isValidName(refname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(refname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.referenceMod.Reference): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  inline def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  inline def nameToId(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("nameToId")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
  
  inline def normalizeName(bufferOut: String, bufferSize: Double, name: String, flags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeName")(bufferOut.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], name.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove(repo: typings.nodegit.repositoryMod.Repository, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def symbolicCreate(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicCreate")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
  
  inline def symbolicCreateMatching(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    currentValue: String,
    logMessage: String
  ): js.Promise[typings.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicCreateMatching")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any], currentValue.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.referenceMod.Reference]]
}
