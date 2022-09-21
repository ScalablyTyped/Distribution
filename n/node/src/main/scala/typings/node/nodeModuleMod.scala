package typings.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.moduleMod.Module
import typings.node.moduleMod.SourceMapPayload
import typings.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeModuleMod extends Shortcut {
  
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
  inline def createRequire(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createRequire(path: URL): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * `path` is the resolved path for the file for which a corresponding source map
    * should be fetched.
    * @since v13.7.0, v12.17.0
    */
  inline def findSourceMap(path: String): typings.node.moduleMod.SourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.moduleMod.SourceMap]
  inline def findSourceMap(path: String, error: js.Error): typings.node.moduleMod.SourceMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.node.moduleMod.SourceMap]
  
  /* static member */
  inline def runMain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runMain")().asInstanceOf[Unit]
  
  /**
    * The `module.syncBuiltinESMExports()` method updates all the live bindings for
    * builtin `ES Modules` to match the properties of the `CommonJS` exports. It
    * does not add or remove exported names from the `ES Modules`.
    *
    * ```js
    * const fs = require('fs');
    * const assert = require('assert');
    * const { syncBuiltinESMExports } = require('module');
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
    * import('fs').then((esmFS) => {
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
  
  /* This means you don't have to write `^`, but can instead just say `nodeModuleMod.foo` */
  override def _to: js.Object & (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = ^
}
