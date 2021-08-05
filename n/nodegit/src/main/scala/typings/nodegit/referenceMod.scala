package typings.nodegit

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.objectMod.Object
import typings.nodegit.objectMod.Object.TYPE
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("nodegit/reference", "Reference")
  @js.native
  class Reference () extends StObject {
    
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
  /* static members */
  object Reference {
    
    @JSImport("nodegit/reference", "Reference")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(repo: Repository, name: String, id: Oid, force: Double, logMessage: String): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], force.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def createMatching(repo: Repository, name: String, id: Oid, force: Double, currentId: Oid, logMessage: String): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatching")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], force.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def dwim(repo: Repository, id: String): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    inline def dwim(repo: Repository, id: String, callback: js.Function): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    inline def dwim(repo: Repository, id: Reference): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    inline def dwim(repo: Repository, id: Reference, callback: js.Function): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def ensureLog(repo: Repository, refname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLog")(repo.asInstanceOf[js.Any], refname.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def hasLog(repo: Repository, refname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLog")(repo.asInstanceOf[js.Any], refname.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isValidName(refname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(refname.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def list(repo: Repository): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
    
    inline def lookup(repo: Repository, id: String): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    inline def lookup(repo: Repository, id: String, callback: js.Function): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    inline def lookup(repo: Repository, id: Reference): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    inline def lookup(repo: Repository, id: Reference, callback: js.Function): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def nameToId(repo: Repository, name: String): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("nameToId")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def normalizeName(bufferOut: String, bufferSize: Double, name: String, flags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeName")(bufferOut.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], name.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def remove(repo: Repository, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def symbolicCreate(repo: Repository, name: String, target: String, force: Double, logMessage: String): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicCreate")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    inline def symbolicCreateMatching(
      repo: Repository,
      name: String,
      target: String,
      force: Double,
      currentValue: String,
      logMessage: String
    ): js.Promise[Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicCreateMatching")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any], currentValue.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reference]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait NORMALIZE extends StObject
    object NORMALIZE {
      
      inline def REF_FORMAT_ALLOW_ONELEVEL: `1` = 1.asInstanceOf[`1`]
      
      inline def REF_FORMAT_NORMAL: `0` = 0.asInstanceOf[`0`]
      
      inline def REF_FORMAT_REFSPEC_PATTERN: `2` = 2.asInstanceOf[`2`]
      
      inline def REF_FORMAT_REFSPEC_SHORTHAND: `4` = 4.asInstanceOf[`4`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait TYPE extends StObject
    object TYPE {
      
      inline def INVALID: `0` = 0.asInstanceOf[`0`]
      
      inline def LISTALL: `3` = 3.asInstanceOf[`3`]
      
      inline def OID: `1` = 1.asInstanceOf[`1`]
      
      inline def SYMBOLIC: `2` = 2.asInstanceOf[`2`]
    }
  }
}
