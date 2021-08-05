package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tree")
@js.native
class Tree ()
  extends typings.nodegit.treeMod.Tree
/* static members */
object Tree {
  
  @JSImport("nodegit", "Tree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def entryCmp(tree1: typings.nodegit.treeEntryMod.TreeEntry, tree2: typings.nodegit.treeEntryMod.TreeEntry): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("entryCmp")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def entryDup(dest: typings.nodegit.treeEntryMod.TreeEntry, source: typings.nodegit.treeEntryMod.TreeEntry): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("entryDup")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Retrieves the tree pointed to by the oid
    */
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.treeMod.Tree]]
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.treeMod.Tree]]
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.treeMod.Tree]]
  inline def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.oidMod.Oid,
    callback: js.Function
  ): js.Promise[typings.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.treeMod.Tree]]
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.treeMod.Tree]]
  inline def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.treeMod.Tree,
    callback: js.Function
  ): js.Promise[typings.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.treeMod.Tree]]
  
  inline def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.treeMod.Tree]]
}
