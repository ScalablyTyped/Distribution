package typings.postcssImport.mod

import typings.postcss.mod.AcceptedPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtImportOptions extends js.Object {
  /**
    * An array of folder names to add to Node's resolver. Values will be appended to the default resolve directories: `["node_modules", "web_modules"]`.
    *
    * This option is only for adding additional directories to default resolver. If you provide your own resolver via the `resolve` configuration option above, then this value will be ignored.
    */
  var addModulesDirectories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * You can overwrite the default loading way by setting this option. This function gets `(filename, importOptions)` arguments and returns content or promised content.
    */
  var load: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* importOptions */ AtImportOptions, 
      String | js.Promise[String]
    ]
  ] = js.undefined
  /**
    * A string or an array of paths in where to look for files.
    */
  var path: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * An array of plugins to be applied on each imported files.
    */
  var plugins: js.UndefOr[js.Array[AcceptedPlugin]] = js.undefined
  /**
    * You can provide a custom path resolver with this option. This function gets `(id, basedir, importOptions)` arguments and should return a path, an array of paths or a promise resolving to
    * the path(s). If you do not return an absolute path, your path will be resolved to an absolute path using the default resolver. You can use
    * [resolve](https://github.com/substack/node-resolve) for this.
    */
  var resolve: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* basedir */ String, 
      /* importOptions */ AtImportOptions, 
      String | js.Array[String] | (js.Thenable[String | js.Array[String]])
    ]
  ] = js.undefined
  /**
    * Define the root where to resolve path (eg: place where `node_modules` are). Should not be used that much.
    *
    * _Note: nested @import will additionally benefit of the relative dirname of imported files._
    *
    * Default: `process.cwd()` or dirname of [the postcss from](https://github.com/postcss/postcss#node-source)
    */
  var root: js.UndefOr[String] = js.undefined
  /**
    * By default, similar files (based on the same content) are being skipped. It's to optimize output and skip similar files like `normalize.css` for example. If this behavior is not what you
    * want, just set this option to false to disable it.
    *
    * @default true
    */
  var skipDuplicates: js.UndefOr[Boolean] = js.undefined
}

object AtImportOptions {
  @scala.inline
  def apply(
    addModulesDirectories: js.Array[String] = null,
    load: (/* filename */ String, /* importOptions */ AtImportOptions) => String | js.Promise[String] = null,
    path: String | js.Array[String] = null,
    plugins: js.Array[AcceptedPlugin] = null,
    resolve: (/* id */ String, /* basedir */ String, /* importOptions */ AtImportOptions) => String | js.Array[String] | (js.Thenable[String | js.Array[String]]) = null,
    root: String = null,
    skipDuplicates: js.UndefOr[Boolean] = js.undefined
  ): AtImportOptions = {
    val __obj = js.Dynamic.literal()
    if (addModulesDirectories != null) __obj.updateDynamic("addModulesDirectories")(addModulesDirectories.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2(load))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction3(resolve))
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(skipDuplicates)) __obj.updateDynamic("skipDuplicates")(skipDuplicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtImportOptions]
  }
}

