package typings.metalsmith

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.Stats
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("metalsmith", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Metalsmith extends js.Object {
    /**
      * Perform the `build` with the current settings outputting to the destination directory.
      * @param fn - Optional Callback function.
      * @example
      * Perform the `build` with the current settings
      * Metalsmith(__dirname).build(
      * function (err: Error): any {
      *     if (err) {throw err;}
      * });
      * @link [API] https://github.com/segmentio/metalsmith#buildfn
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L184
      */
    def build(): js.Object = js.native
    def build(fn: Callback): js.Object = js.native
    /**
      * Get the flag on whether the destination directory will be `cleaned` before writing.
      * @example
      * Retrieve the `clean` flag indicating destination directory removal
      * var clean:boolean = Metalsmith(__dirname).clean();
      * @link [API] https://github.com/segmentio/metalsmith#cleanboolean
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L132
      */
    def clean(): Boolean = js.native
    /**
      * Set whether the destination directory will be `cleaned` before writing.
      * @param clean [clean=true] - Flag to `clean` destination directory.
      * @example
      * Set the flag to `clean` the destination directory to false
      * Metalsmith(__dirname).clean(false);
      * @link [API] https://github.com/segmentio/metalsmith#cleanboolean
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L132
      */
    def clean(clean: Boolean): Metalsmith = js.native
    /**
      * Get the `maximum` number of files to open at once.
      * @example
      * Retrieve the `maximum` number of files to open at once
      * var max:number = Metalsmith(__dirname).concurrency();
      * @link [API] https://github.com/segmentio/metalsmith#concurrencymax
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L118
      */
    def concurrency(): Double = js.native
    /**
      * Set the `maximum` number of files to open at once.
      * @param max [max=Infinity] - The `maximum` number of open files.
      * @example
      * Set the `maximum` number of files to open at once to 50
      * Metalsmith(__dirname).concurrency(50);
      * @link [API] https://github.com/segmentio/metalsmith#concurrencymax
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L118
      */
    def concurrency(max: Double): Metalsmith = js.native
    /**
      * Get the absolute path of the `destination` directory.
      * @example
      * Retrieve the absolute `destination` directory path
      * var dst:string = Metalsmith(__dirname).destination();
      * @link [API] https://github.com/segmentio/metalsmith#destinationpath
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L104
      */
    def destination(): String = js.native
    /**
      * Set the path of the `destination` directory.
      * @param path [path='build'] - Relative or absolute `destination` directory path.
      * @example
      * Set the relative `destination` directory to './build' (the default)
      * Metalsmith(__dirname).destination("build");
      * @example
      * Set the absolute `destination` directory to 'C:\Projects\Out\'
      * Metalsmith(__dirname).destination("C:\\\Projects\\\Out");
      * @link [API] https://github.com/segmentio/metalsmith#destinationpath
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L104
      */
    def destination(path: String): Metalsmith = js.native
    /**
      * Get the absolute path of the `working` directory
      * @example
      * Retrieve the absolute `working` directory path
      * var wrk:string = Metalsmith(__dirname).directory();
      * @link [API] https://github.com/segmentio/metalsmith#api
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L62
      */
    def directory(): String = js.native
    /**
      * Set the path of the `working` directory.
      * @param directory Relative or absolute `working` directory path.
      * @example
      * Set the relative `working` directory to './working'
      * Metalsmith(__dirname).directory("working");
      * @example
      * Set the absolute `working` directory to 'C:\Projects\Metalsmith\'
      * Metalsmith(__dirname).directory("C:\\\Projects\\\Metalsmith");
      * @link [API] https://github.com/segmentio/metalsmith#api
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L62
      */
    def directory(directory: String): Metalsmith = js.native
    /**
      * Get the flag on whether to parse YAML `frontmatter`
      * @example
      * Retrieve the `frontmatter` flag indicating YAML parsing
      * var parse:boolean = Metalsmith(__dirname).frontmatter();
      * @link [API] https://github.com/segmentio/metalsmith#frontmatterboolean
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L145
      */
    def frontmatter(): Boolean = js.native
    /**
      * Set the flag on whether to parse YAML `frontmatter`
      * @param frontmatter [frontmatter=true] - Flag to parse YAML `frontmatter`.
      * @example
      * Set the flag to parse YAML `frontmatter` to false
      * Metalsmith(__dirname).frontmatter(false);
      * @link [API] https://github.com/segmentio/metalsmith#frontmatterboolean
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L145
      */
    def frontmatter(frontmatter: Boolean): Metalsmith = js.native
    /**
      * Get the array of `Ignored` files/paths.
      * @example
      * Retrieve the `ignored` array of files in Metalsmith
      * var ingnored:string[] = Metalsmith(__dirname).ignore();
      * @link [API] https://github.com/segmentio/metalsmith#ignorepath
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L159
      */
    def ignore(): js.Array[String] = js.native
    /**
      * Set the `Ignore` files/paths from being loaded into Metalsmith.
      * @param files - The file(s) or directories to `ignore`.
      * @example
      * Add an `ignore` file to prevent load into Metalsmith
      * Metalsmith(__dirname).ignore("corrupted.html");
      * @example
      * Add an `ignore` function to prevent load into Metalsmith
      * Metalsmith(__dirname).ignore(ignore(function (filepath: string, stats: Stats) {
      *      return stats.isDirectory() && path.basename(filepath) === 'nested';
      * });
      * @link [API] https://github.com/segmentio/metalsmith#ignorepath
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L159
      */
    def ignore(files: String): Metalsmith = js.native
    def ignore(files: js.Array[Ignore | String]): Metalsmith = js.native
    def ignore(files: Ignore): Metalsmith = js.native
    /**
      * Get the global `metadata` object passed to templates.
      * @example
      * Retrieve the `metadata` object passed to templates
      * var meta:object = Metalsmith(__dirname).metadata();
      * @link [API] https://github.com/segmentio/metalsmith#metadatajson
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L76
      */
    def metadata(): js.Object = js.native
    /**
      * Set the global `metadata` object to pass to templates.
      * @param metadata - The global metadata (json).
      * @example
      * Add 'sitename' to the global `metadata` object
      * Metalsmith(__dirname).metadata({sitename: "My Static Site"});
      * @link [API] https://github.com/segmentio/metalsmith#metadatajson
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L76
      */
    def metadata(metadata: js.Object): Metalsmith = js.native
    /**
      * Resolve `paths` relative to the root directory.
      * @param paths - The `paths` to resolve.
      * @example
      * Retrieve the path after resolving sub-directies
      * var path:string = Metalsmith(__dirname).path("path-a", "path-b");
      * @link [API] https://github.com/segmentio/metalsmith#pathpaths
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L171
      */
    def path(paths: String*): String = js.native
    /**
      * `Process` files through plugins without writing out files.
      * @param fn - Optional Callback function.
      * @example
      * `Process` the files like `build` without writing any files
      * Metalsmith(__dirname).process(
      * function (err: Error): any {
      *     if (err) {throw err;}
      * });
      * @link [API] https://github.com/segmentio/metalsmith#processfn
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L200
      */
    def process(): js.Object = js.native
    def process(fn: Callback): js.Object = js.native
    /**
      * Read a dictionary of files from a `dir`, parsing frontmatter. If no directory
      * is provided, it will default to the source directory.
      * @param dir - Optional dictionary of files.
      * @example
      * Read a dictionary of files from a `dir`.
      * var files:object = Metalsmith(__dirname).read("subdir");
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L227
      */
    def read(dir: String): js.Object = js.native
    def read(dir: String, fn: Callback): js.Object = js.native
    /**
      * Read a dictionary of files from a `dir`, parsing frontmatter. If no directory
      * is provided, it will default to the source directory.
      * @param fn - Optional Callback function.
      * @example
      * Read a dictionary of files from a `dir`.
      * var files:object = Metalsmith(__dirname).read("subdir");
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L227
      */
    def read(fn: Callback): js.Object = js.native
    /**
      * Read a `file` by path. If the path is not absolute, it will be resolved
      * relative to the source directory.
      * @param file - The file path.
      * @example
      * Read a `file` by path.
      * var fileData:object = Metalsmith(__dirname).readFile("a.html");
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L261
      */
    def readFile(file: String): js.Object = js.native
    /**
      * `Run` a set of files through the plugins stack.
      * @param files - The dictionary of files.
      * @param fn - Optional Callback function.
      * @example
      * `Run` all of the middleware functions on a dictionary of files.
      * var callback:Metalsmith.Callback = (err: Error, files: object) => {if (err) {throw err;}};
      * Metalsmith(__dirname).run({fileA: "a.html"} , callback);
      * @link [API] https://github.com/segmentio/metalsmith#runfiles-fn
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L212
      */
    def run(files: js.Object): js.Object = js.native
    def run(files: js.Object, fn: Callback): js.Object = js.native
    /**
      * `Run` a set of files through the plugins stack.
      * @param files - The dictionary of files.
      * @param fn - Optional Callback function.
      * @example
      * `Run` all of the middleware functions on a dictionary of files.
      * var callback:Metalsmith.Callback = (err: Error, files: object) => {if (err) {throw err;}};
      * Metalsmith(__dirname).run({fileA: "a.html"} , callback);
      * @link [API] https://github.com/segmentio/metalsmith#runfiles-fn
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L212
      */
    def run(files: js.Object, plugins: js.Array[Plugin]): js.Object = js.native
    def run(files: js.Object, plugins: js.Array[Plugin], fn: Callback): js.Object = js.native
    /**
      * Get the absolute path of the `source` directory.
      * @example
      * Retrieve the absolute `source` directory path
      * var src:string = Metalsmith(__dirname).source();
      * @link [API] https://github.com/segmentio/metalsmith#sourcepath
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L90
      */
    def source(): String = js.native
    /**
      * Set the path of the `source` directory.
      * @param path [path='src'] - Relative or absolute `source` directory path.
      * @example
      * Set the relative `source` directory to './src' (the default)
      * Metalsmith(__dirname).source("src");
      * @example
      * Set the absolute `source` directory to 'C:\Projects\Site\'
      * Metalsmith(__dirname).source("C:\\\Projects\\\Site");
      * @link [API] https://github.com/segmentio/metalsmith#sourcepath
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L90
      */
    def source(path: String): Metalsmith = js.native
    def use(plugin: js.Array[Plugin]): Metalsmith = js.native
    /**
      * Add a `plugin` function to the stack.
      * @param plugin - The plugin to add.
      * @example
      * Add 'metalsmith-markdown' to the middleware stack
      * Metalsmith(__dirname).use(markdown());
      * @link [API] https://github.com/segmentio/metalsmith#useplugin
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L50
      */
    def use(plugin: Plugin): Metalsmith = js.native
    /**
      * Write a dictionary of `files` to a destination `dir`. If no directory is
      * provided, it will default to the destination directory.
      * @param files - Dictionary of files.
      * @param dir - Optional destination directory.
      * @param fn - Optional Callback function.
      * @example
      * Write a dictionary of `files` to a destination `dir`.
      * Metalsmith(__dirname).write({fileA: "a.html"} , "C:\\\OutDir");
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L308
      */
    def write(files: js.Object): Unit = js.native
    def write(files: js.Object, dir: String): Unit = js.native
    def write(files: js.Object, dir: String, fn: Callback): Unit = js.native
    /**
      * Write a dictionary of `files` to a destination `dir`. If no directory is
      * provided, it will default to the destination directory.
      * @param files - Dictionary of files.
      * @param dir - Optional destination directory.
      * @example
      * Write a dictionary of `files` to a destination `dir`.
      * Metalsmith(__dirname).write({fileA: "a.html"} , "C:\\\OutDir");
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L308
      */
    def write(files: js.Object, fn: Callback): Unit = js.native
    /**
      * Write a `file` by path with `data`. If the path is not absolute, it will be
      * resolved relative to the destination directory.
      * @param file - File path.
      * @param data - The file data.
      * @example
      * Write a `file` by path with `data`.
      * Metalsmith(__dirname).writeFile("test.html", {contents: "File Contents"});
      * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L336
      */
    def writeFile(file: String, data: js.Object): Unit = js.native
  }
  
  /**
    * Initialize a new `Metalsmith` builder with a working `directory`.
    * @param directory  - The working directory.
    * @example
    * initialize Metalsmith with the node.js working directory
    * Metalsmith(__dirname);
    * @link [Metalsmith] http://www.metalsmith.io/
    * @link [API] https://github.com/segmentio/metalsmith#new-metalsmithdir
    * @link [Source] https://github.com/segmentio/metalsmith/blob/00b2c7aaee13fbe0f7fb3be332929a303b2df51d/lib/index.js#L30
    */
  def apply(directory: String): Metalsmith = js.native
  type Callback = js.Function3[/* err */ Error | Null, /* files */ Files, /* metalsmith */ Metalsmith, Unit]
  type Files = StringDictionary[js.Any]
  type Ignore = js.Function2[/* path */ String, /* stat */ Stats, Unit]
  type Plugin = js.Function3[/* files */ Files, /* metalsmith */ Metalsmith, /* callback */ Callback, Unit]
}

