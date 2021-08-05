package typings.nodegit

import typings.nodegit.anon.EventEmitterstartvoid
import typings.nodegit.diffMod.Diff
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.objectMod.Object
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeBuilderMod.Treebuilder
import typings.nodegit.treeEntryMod.TreeEntry
import typings.nodegit.treeUpdateMod.TreeUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("nodegit/tree", "Tree")
  @js.native
  class Tree () extends StObject {
    
    def _entryByIndex(idx: Double): TreeEntry = js.native
    
    def _entryByName(filename: String): TreeEntry = js.native
    
    /**
      * Make builder. This is helpful for modifying trees.
      */
    def builder(): Treebuilder = js.native
    
    def createUpdated(repo: Repository, nUpdates: Double, updates: TreeUpdate): js.Promise[Oid] = js.native
    
    /**
      * Diff two trees
      */
    def diff(tree: Tree): js.Promise[Diff] = js.native
    def diff(tree: Tree, callback: js.Function): js.Promise[Diff] = js.native
    
    /**
      * Diff two trees with options
      */
    def diffWithOptions(tree: Tree): js.Promise[Diff] = js.native
    def diffWithOptions(tree: Tree, options: Unit, callback: js.Function): js.Promise[Diff] = js.native
    def diffWithOptions(tree: Tree, options: Object): js.Promise[Diff] = js.native
    def diffWithOptions(tree: Tree, options: Object, callback: js.Function): js.Promise[Diff] = js.native
    
    def dup(): js.Promise[Tree] = js.native
    
    /**
      * Return an array of the entries in this tree (excluding its children).
      */
    def entries(): js.Array[TreeEntry] = js.native
    
    def entryById(id: Oid): TreeEntry = js.native
    
    /**
      * Get an entry at the ith position.
      */
    def entryByIndex(i: Double): TreeEntry = js.native
    
    /**
      * Get an entry by name; if the tree is a directory, the name is the filename.
      */
    def entryByName(name: String): TreeEntry = js.native
    
    def entryByPath(path: String): js.Promise[TreeEntry] = js.native
    
    def entryCount(): Double = js.native
    
    def free(): Unit = js.native
    
    /**
      * Get an entry at a path. Unlike by name, this takes a fully qualified path, like /foo/bar/baz.javascript
      */
    def getEntry(filePath: String): js.Promise[TreeEntry] = js.native
    
    def id(): Oid = js.native
    
    def owner(): Repository = js.native
    
    /**
      * Return the path of this tree, like /lib/foo/bar
      *
      *
      */
    def path(): String = js.native
    
    /**
      * Recursively walk the tree in breadth-first order. Fires an event for each entry.
      */
    def walk(): EventEmitterstartvoid = js.native
    def walk(blobsOnly: Boolean): EventEmitterstartvoid = js.native
  }
  /* static members */
  object Tree {
    
    @JSImport("nodegit/tree", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def entryCmp(tree1: TreeEntry, tree2: TreeEntry): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("entryCmp")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def entryDup(dest: TreeEntry, source: TreeEntry): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("entryDup")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Retrieves the tree pointed to by the oid
      */
    inline def lookup(repo: Repository, id: String): js.Promise[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tree]]
    inline def lookup(repo: Repository, id: String, callback: js.Function): js.Promise[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tree]]
    inline def lookup(repo: Repository, id: Oid): js.Promise[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tree]]
    inline def lookup(repo: Repository, id: Oid, callback: js.Function): js.Promise[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tree]]
    inline def lookup(repo: Repository, id: Tree): js.Promise[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tree]]
    inline def lookup(repo: Repository, id: Tree, callback: js.Function): js.Promise[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tree]]
    
    inline def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tree]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
    */
    trait WALK_MODE extends StObject
    object WALK_MODE {
      
      inline def WALK_POST: `1` = 1.asInstanceOf[`1`]
      
      inline def WALK_PRE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
