package typings.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.Require
import typings.node.moduleMod.Module
import typings.node.moduleMod.SourceMapPayload
import typings.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonmoduleMod extends Shortcut {
  
  @JSImport("node:module", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typings.node.moduleMod.^ {
    def this(id: String) = this()
    def this(id: String, parent: Module) = this()
  }
  @JSImport("node:module", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = js.native
  
  /* static member */
  @JSImport("node:module", "Module")
  @js.native
  def Module: Instantiable2[
    /* id */ String, 
    /* parent */ js.UndefOr[typings.node.moduleMod.Module], 
    typings.node.moduleMod.Module
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:module", "Module")
  @js.native
  open class ModuleCls protected ()
    extends StObject
       with typings.node.NodeJS.Module {
    def this(id: String) = this()
    def this(id: String, parent: Module) = this()
    
    /* CompleteClass */
    var children: js.Array[typings.node.NodeJS.Module] = js.native
    
    /* CompleteClass */
    var exports: Any = js.native
    
    /* CompleteClass */
    var filename: String = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * `true` if the module is running during the Node.js preload
      */
    /* CompleteClass */
    var isPreloading: Boolean = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
    /**
      * @since v11.14.0
      *
      * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
      */
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var paths: js.Array[String] = js.native
    
    /* CompleteClass */
    override def require(id: String): Any = js.native
    /* CompleteClass */
    @JSName("require")
    var require_Original: Require = js.native
  }
  
  inline def Module_=(x: Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Module")(x.asInstanceOf[js.Any])
  
  /**
    * @since v13.7.0, v12.17.0
    */
  @JSImport("node:module", "SourceMap")
  @js.native
  open class SourceMap protected ()
    extends typings.node.moduleMod.SourceMap {
    def this(payload: SourceMapPayload) = this()
  }
  
  /* static member */
  @JSImport("node:module", "builtinModules")
  @js.native
  def builtinModules: js.Array[String] = js.native
  inline def builtinModules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinModules")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def createRequire(path: String): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  inline def createRequire(path: URL): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  
  /**
    * `path` is the resolved path for the file for which a corresponding source map
    * should be fetched.
    * @since v13.7.0, v12.17.0
    * @return Returns `module.SourceMap` if a source map is found, `undefined` otherwise.
    */
  inline def findSourceMap(path: String): typings.node.moduleMod.SourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.moduleMod.SourceMap]
  inline def findSourceMap(path: String, error: js.Error): typings.node.moduleMod.SourceMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.node.moduleMod.SourceMap]
  
  /* static member */
  inline def isBuiltin(moduleName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltin")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def runMain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runMain")().asInstanceOf[Unit]
  
  /**
    * The `module.syncBuiltinESMExports()` method updates all the live bindings for
    * builtin `ES Modules` to match the properties of the `CommonJS` exports. It
    * does not add or remove exported names from the `ES Modules`.
    *
    * ```js
    * const fs = require('node:fs');
    * const assert = require('node:assert');
    * const { syncBuiltinESMExports } = require('node:module');
    *
    * fs.readFile = newAPI;
    *
    * delete fs.readFileSync;
    *
    * function newAPI() {
    *   // ...
    * }
    *
    * fs.newAPI = newAPI;
    *
    * syncBuiltinESMExports();
    *
    * import('node:fs').then((esmFS) => {
    *   // It syncs the existing readFile property with the new value
    *   assert.strictEqual(esmFS.readFile, newAPI);
    *   // readFileSync has been deleted from the required fs
    *   assert.strictEqual('readFileSync' in fs, false);
    *   // syncBuiltinESMExports() does not remove readFileSync from esmFS
    *   assert.strictEqual('readFileSync' in esmFS, true);
    *   // syncBuiltinESMExports() does not add names
    *   assert.strictEqual(esmFS.newAPI, undefined);
    * });
    * ```
    * @since v12.12.0
    */
  inline def syncBuiltinESMExports(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncBuiltinESMExports")().asInstanceOf[Unit]
  
  /* static member */
  inline def wrap(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type _To = js.Object & (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module])
  
  /* This means you don't have to write `^`, but can instead just say `nodeColonmoduleMod.foo` */
  override def _to: js.Object & (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = ^
}
