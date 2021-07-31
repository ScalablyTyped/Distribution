package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeEntryMod.TreeEntry
import typings.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeBuilderMod {
  
  @JSImport("nodegit/tree-builder", "Treebuilder")
  @js.native
  class Treebuilder () extends StObject {
    
    def clear(): Unit = js.native
    
    def entrycount(): Double = js.native
    
    def free(): Unit = js.native
    
    def get(filename: String): TreeEntry = js.native
    
    def insert(filename: String, id: Oid, filemode: Double): js.Promise[TreeEntry] = js.native
    
    def remove(filename: String): Double = js.native
    
    def write(): js.Promise[Oid] = js.native
  }
  /* static members */
  object Treebuilder {
    
    @JSImport("nodegit/tree-builder", "Treebuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(repo: Repository): js.Promise[Treebuilder] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Treebuilder]]
    @scala.inline
    def create(repo: Repository, source: Tree): js.Promise[Treebuilder] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Treebuilder]]
  }
}
