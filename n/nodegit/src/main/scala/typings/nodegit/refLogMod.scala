package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refLogMod {
  
  @JSImport("nodegit/ref-log", "Reflog")
  @js.native
  class Reflog () extends StObject {
    
    def append(id: Oid, committer: Signature, msg: String): Double = js.native
    
    def drop(idx: Double, rewritePreviousEntry: Double): Double = js.native
    
    def entryByIndex(idx: Double): ReflogEntry = js.native
    
    def entrycount(): Double = js.native
    
    def free(): Unit = js.native
    
    def write(): Double = js.native
  }
  /* static members */
  object Reflog {
    
    @JSImport("nodegit/ref-log", "Reflog")
    @js.native
    val ^ : js.Any = js.native
    
    inline def delete(repo: Repository, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def read(repo: Repository, name: String): js.Promise[Reflog] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Reflog]]
    
    inline def rename(repo: Repository, oldName: String, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(repo.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("nodegit/ref-log", "ReflogEntry")
  @js.native
  class ReflogEntry () extends StObject {
    
    def committer(): Signature = js.native
    
    def idNew(): Oid = js.native
    
    def idOld(): Oid = js.native
    
    def message(): String = js.native
  }
}
