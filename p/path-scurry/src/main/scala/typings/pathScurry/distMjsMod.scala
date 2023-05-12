package typings.pathScurry

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.StringDictionary
import typings.minipass.mod.Minipass
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Dirent
import typings.node.fsMod.Stats
import typings.pathScurry.anon.Dictk
import typings.pathScurry.anon.Lstat
import typings.pathScurry.anon.WithFileTypes
import typings.pathScurry.anon.WithFileTypesBoolean
import typings.pathScurry.anon.`0`
import typings.pathScurry.pathScurryBooleans.`false`
import typings.pathScurry.pathScurryBooleans.`true`
import typings.pathScurry.pathScurryStrings.Slash
import typings.std.Array
import typings.std.AsyncGenerator
import typings.std.Generator
import typings.std.InstanceType
import typings.std.Set
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LRUCache<PathBase, Children> * / any */ @JSImport("path-scurry/dist/mjs", "ChildrenCache")
  @js.native
  open class ChildrenCache () extends StObject {
    def this(maxSize: Double) = this()
  }
  
  @JSImport("path-scurry/dist/mjs", "Path")
  @js.native
  val Path: Instantiable7[
    /* name */ String, 
    js.UndefOr[Double], 
    js.UndefOr[PathBase], 
    /* roots */ StringDictionary[PathBase], 
    /* nocase */ Boolean, 
    /* children */ ChildrenCache, 
    /* opts */ PathOpts, 
    PathPosix | PathWin32
  ] = js.native
  type Path = PathBase | (InstanceType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof PathWin32 */ js.Any
  ])
  
  /* note: abstract class */ @JSImport("path-scurry/dist/mjs", "PathBase")
  @js.native
  open class PathBase protected () extends Dirent {
    def this(
      name: String,
      `type`: Double,
      root: Unit,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    /**
      * Do not create new Path objects directly.  They should always be accessed
      * via the PathScurry class or other methods on the Path class.
      *
      * @internal
      */
    def this(
      name: String,
      `type`: Double,
      root: PathBase,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    def this(
      name: String,
      `type`: Unit,
      root: Unit,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    def this(
      name: String,
      `type`: Unit,
      root: PathBase,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    
    def atime: js.UndefOr[js.Date] = js.native
    
    def atimeMs: js.UndefOr[Double] = js.native
    
    def birthtime: js.UndefOr[js.Date] = js.native
    
    def birthtimeMs: js.UndefOr[Double] = js.native
    
    def blksize: js.UndefOr[Double] = js.native
    
    def blocks: js.UndefOr[Double] = js.native
    
    /**
      * Return true if readdir has previously been successfully called on this
      * path, indicating that cachedReaddir() is likely valid.
      */
    def calledReaddir(): Boolean = js.native
    
    def canReaddir(): Boolean = js.native
    
    /**
      * Return true if it's worth trying to readlink.  Ie, we don't (yet) have
      * any indication that readlink will definitely fail.
      *
      * Returns false if the path is known to not be a symlink, if a previous
      * readlink failed, or if the entry does not exist.
      */
    def canReadlink(): Boolean = js.native
    
    /**
      * Resolves a path portion and returns or creates the child Path.
      *
      * Returns `this` if pathPart is `''` or `'.'`, or `parent` if pathPart is
      * `'..'`.
      *
      * This should not be called directly.  If `pathPart` contains any path
      * separators, it will lead to unsafe undefined behavior.
      *
      * Use `Path.resolve()` instead.
      *
      * @internal
      */
    def child(pathPart: String): PathBase = js.native
    def child(pathPart: String, opts: PathOpts): PathBase = js.native
    
    /**
      * Returns the cached children Path objects, if still available.  If they
      * have fallen out of the cache, then returns an empty array, and resets the
      * READDIR_CALLED bit, so that future calls to readdir() will require an fs
      * lookup.
      *
      * @internal
      */
    def children(): Children = js.native
    
    /**
      * @internal
      */
    def childrenCache(): ChildrenCache = js.native
    
    def ctime: js.UndefOr[js.Date] = js.native
    
    def ctimeMs: js.UndefOr[Double] = js.native
    
    /**
      * Returns the depth of the Path object from its root.
      *
      * For example, a path at `/foo/bar` would have a depth of 2.
      */
    def depth(): Double = js.native
    
    def dev: js.UndefOr[Double] = js.native
    
    /**
      * The fully resolved path string for this Path entry
      */
    def fullpath(): String = js.native
    
    /**
      * On platforms other than windows, this is identical to fullpath.
      *
      * On windows, this is overridden to return the forward-slash form of the
      * full UNC path.
      */
    def fullpathPosix(): String = js.native
    
    /**
      * @internal
      */
    def getRoot(rootPath: String): PathBase = js.native
    
    /**
      * @internal
      */
    def getRootString(path: String): String = js.native
    
    def gid: js.UndefOr[Double] = js.native
    
    def ino: js.UndefOr[Double] = js.native
    
    /**
      * Returns true if the path is known to not exist. That is, a previous lstat
      * or readdir failed to verify its existence when that would have been
      * expected, or a parent entry was marked either enoent or enotdir.
      */
    def isENOENT(): Boolean = js.native
    
    /**
      * Return true if the path is a match for the given path name.  This handles
      * case sensitivity and unicode normalization.
      *
      * Note: even on case-sensitive systems, it is **not** safe to test the
      * equality of the `.name` property to determine whether a given pathname
      * matches, due to unicode normalization mismatches.
      *
      * Always use this method instead of testing the `path.name` property
      * directly.
      */
    def isNamed(n: String): Boolean = js.native
    
    /**
      * Is the Path of an unknown type?
      *
      * Note that we might know *something* about it if there has been a previous
      * filesystem operation, for example that it does not exist, or is not a
      * link, or whether it has child entries.
      */
    def isUnknown(): Boolean = js.native
    
    /**
      * Call lstat() on this Path, and update all known information that can be
      * determined.
      *
      * Note that unlike `fs.lstat()`, the returned value does not contain some
      * information, such as `mode`, `dev`, `nlink`, and `ino`.  If that
      * information is required, you will need to call `fs.lstat` yourself.
      *
      * If the Path refers to a nonexistent file, or if the lstat call fails for
      * any reason, `undefined` is returned.  Otherwise the updated Path object is
      * returned.
      *
      * Results are cached, and thus may be out of date if the filesystem is
      * mutated.
      */
    def lstat(): js.Promise[js.UndefOr[PathBase]] = js.native
    
    /**
      * Return the entry if it has been subject of a successful lstat, or
      * undefined otherwise.
      *
      * Does not read the filesystem, so an undefined result *could* simply
      * mean that we haven't called lstat on it.
      */
    def lstatCached(): js.UndefOr[PathBase] = js.native
    
    /**
      * synchronous {@link PathBase.lstat}
      */
    def lstatSync(): js.UndefOr[PathBase] = js.native
    
    def mode: js.UndefOr[Double] = js.native
    
    def mtime: js.UndefOr[js.Date] = js.native
    
    def mtimeMs: js.UndefOr[Double] = js.native
    
    /**
      * @internal
      */
    def newChild(name: String): PathBase = js.native
    def newChild(name: String, `type`: Double): PathBase = js.native
    def newChild(name: String, `type`: Double, opts: PathOpts): PathBase = js.native
    def newChild(name: String, `type`: Unit, opts: PathOpts): PathBase = js.native
    
    def nlink: js.UndefOr[Double] = js.native
    
    /**
      * boolean indicating whether paths are compared case-insensitively
      * @internal
      */
    var nocase: Boolean = js.native
    
    /**
      * a reference to the parent path, or undefined in the case of root entries
      *
      * @internal
      */
    var parent: js.UndefOr[PathBase] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def rdev: js.UndefOr[Double] = js.native
    
    /**
      * Return an array of known child entries.
      *
      * If the Path cannot or does not contain any children, then an empty array
      * is returned.
      *
      * Results are cached, and thus may be out of date if the filesystem is
      * mutated.
      */
    def readdir(): js.Promise[js.Array[PathBase]] = js.native
    
    /**
      * Standard node-style callback interface to get list of directory entries.
      *
      * If the Path cannot or does not contain any children, then an empty array
      * is returned.
      *
      * Results are cached, and thus may be out of date if the filesystem is
      * mutated.
      *
      * @param cb The callback called with (er, entries).  Note that the `er`
      * param is somewhat extraneous, as all readdir() errors are handled and
      * simply result in an empty set of entries being returned.
      * @param allowZalgo Boolean indicating that immediately known results should
      * *not* be deferred with `queueMicrotask`. Defaults to `false`. Release
      * zalgo at your peril, the dark pony lord is devious and unforgiving.
      */
    def readdirCB(cb: js.Function2[/* er */ ErrnoException | Null, /* entries */ js.Array[this.type], Any]): Unit = js.native
    def readdirCB(
      cb: js.Function2[/* er */ ErrnoException | Null, /* entries */ js.Array[this.type], Any],
      allowZalgo: Boolean
    ): Unit = js.native
    
    /**
      * Returns the cached child Path entries array if the entry has been the
      * subject of a successful readdir(), or [] otherwise.
      *
      * Does not read the filesystem, so an empty array *could* just mean we
      * don't have any cached data. Only use it if you are very sure that a
      * readdir() has been called recently enough to still be valid.
      */
    def readdirCached(): js.Array[PathBase] = js.native
    
    /**
      * synchronous {@link PathBase.readdir}
      */
    def readdirSync(): js.Array[PathBase] = js.native
    
    /**
      * Return the Path object corresponding to the target of a symbolic link.
      *
      * If the Path is not a symbolic link, or if the readlink call fails for any
      * reason, `undefined` is returned.
      *
      * Result is cached, and thus may be outdated if the filesystem is mutated.
      */
    def readlink(): js.Promise[js.UndefOr[PathBase]] = js.native
    
    /**
      * Return the cached link target if the entry has been the subject of a
      * successful readlink, or undefined otherwise.
      *
      * Does not read the filesystem, so an undefined result *could* just mean we
      * don't have any cached data. Only use it if you are very sure that a
      * readlink() has been called at some point.
      */
    def readlinkCached(): js.UndefOr[PathBase] = js.native
    
    /**
      * Synchronous {@link PathBase.readlink}
      */
    def readlinkSync(): js.UndefOr[PathBase] = js.native
    
    /**
      * Return the Path object corresponding to path as resolved
      * by realpath(3).
      *
      * If the realpath call fails for any reason, `undefined` is returned.
      *
      * Result is cached, and thus may be outdated if the filesystem is mutated.
      * On success, returns a Path object.
      */
    def realpath(): js.Promise[js.UndefOr[PathBase]] = js.native
    
    /**
      * Returns the cached realpath target if the entry has been the subject
      * of a successful realpath, or undefined otherwise.
      *
      * Does not read the filesystem, so an undefined result *could* just mean we
      * don't have any cached data. Only use it if you are very sure that a
      * realpath() has been called at some point.
      */
    def realpathCached(): js.UndefOr[PathBase] = js.native
    
    /**
      * Synchronous {@link realpath}
      */
    def realpathSync(): js.UndefOr[PathBase] = js.native
    
    /**
      * The relative path from the cwd. If it does not share an ancestor with
      * the cwd, then this ends up being equivalent to the fullpath()
      */
    def relative(): String = js.native
    
    /**
      * The relative path from the cwd, using / as the path separator.
      * If it does not share an ancestor with
      * the cwd, then this ends up being equivalent to the fullpathPosix()
      * On posix systems, this is identical to relative().
      */
    def relativePosix(): String = js.native
    
    /**
      * Get the Path object referenced by the string path, resolved from this Path
      */
    def resolve(): PathBase = js.native
    def resolve(path: String): PathBase = js.native
    
    /**
      * the Path entry corresponding to the path root.
      *
      * @internal
      */
    var root: PathBase = js.native
    
    /**
      * All roots found within the current PathScurry family
      *
      * @internal
      */
    var roots: StringDictionary[PathBase] = js.native
    
    /**
      * The path separator string to use when joining paths
      */
    var sep: String = js.native
    
    def shouldWalk(dirs: Set[js.UndefOr[PathBase]]): Boolean = js.native
    def shouldWalk(dirs: Set[js.UndefOr[PathBase]], walkFilter: js.Function1[/* e */ this.type, Boolean]): Boolean = js.native
    
    def size: js.UndefOr[Double] = js.native
    
    /**
      * the string or regexp used to split paths. On posix, it is `'/'`, and on
      * windows it is a RegExp matching either `'/'` or `'\\'`
      */
    var splitSep: String | js.RegExp = js.native
    
    def uid: js.UndefOr[Double] = js.native
  }
  
  @JSImport("path-scurry/dist/mjs", "PathPosix")
  @js.native
  open class PathPosix protected () extends PathBase {
    def this(
      name: String,
      `type`: Double,
      root: Unit,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    /**
      * Do not create new Path objects directly.  They should always be accessed
      * via the PathScurry class or other methods on the Path class.
      *
      * @internal
      */
    def this(
      name: String,
      `type`: Double,
      root: PathBase,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    def this(
      name: String,
      `type`: Unit,
      root: Unit,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    def this(
      name: String,
      `type`: Unit,
      root: PathBase,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    
    /**
      * separator for generating path strings
      */
    @JSName("sep")
    var sep_PathPosix: Slash = js.native
    
    /**
      * separator for parsing path strings
      */
    @JSName("splitSep")
    var splitSep_PathPosix: Slash = js.native
  }
  
  @JSImport("path-scurry/dist/mjs", "PathScurry")
  @js.native
  val PathScurry: Instantiable2[
    js.UndefOr[String | URL], 
    js.UndefOr[PathScurryOpts], 
    PathScurryDarwin | PathScurryPosix | PathScurryWin32
  ] = js.native
  type PathScurry = PathScurryBase | (InstanceType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof PathScurryWin32 */ js.Any
  ])
  
  /* note: abstract class */ @JSImport("path-scurry/dist/mjs", "PathScurryBase")
  @js.native
  open class PathScurryBase protected () extends StObject {
    /**
      * This class should not be instantiated directly.
      *
      * Use PathScurryWin32, PathScurryDarwin, PathScurryPosix, or PathScurry
      *
      * @internal
      */
    def this(
      cwd: String,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: String
    ) = this()
    def this(
      cwd: String,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: js.RegExp
    ) = this()
    def this(
      cwd: Unit,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: String
    ) = this()
    def this(
      cwd: Unit,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: js.RegExp
    ) = this()
    def this(
      cwd: URL,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: String
    ) = this()
    def this(
      cwd: URL,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: js.RegExp
    ) = this()
    def this(
      cwd: String,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: String,
      param3: PathScurryOpts
    ) = this()
    def this(
      cwd: String,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: js.RegExp,
      param3: PathScurryOpts
    ) = this()
    def this(
      cwd: Unit,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: String,
      param3: PathScurryOpts
    ) = this()
    def this(
      cwd: Unit,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: js.RegExp,
      param3: PathScurryOpts
    ) = this()
    def this(
      cwd: URL,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: String,
      param3: PathScurryOpts
    ) = this()
    def this(
      cwd: URL,
      pathImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof win32 */ Any,
      sep: js.RegExp,
      param3: PathScurryOpts
    ) = this()
    
    /**
      * Return the basename for the provided string or Path object
      */
    def basename(): String = js.native
    def basename(entry: String): String = js.native
    def basename(entry: PathBase): String = js.native
    
    def chdir(): Unit = js.native
    def chdir(path: String): Unit = js.native
    def chdir(path: typings.pathScurry.distMjsMod.Path): Unit = js.native
    
    /**
      * Return the cache of child entries.  Exposed so subclasses can create
      * child Path objects in a platform-specific way.
      *
      * @internal
      */
    def childrenCache(): ChildrenCache = js.native
    
    /**
      * The Path entry corresponding to this PathScurry's current working directory.
      */
    var cwd: PathBase = js.native
    
    /**
      * Get the depth of a provided path, string, or the cwd
      */
    def depth(): Double = js.native
    def depth(path: String): Double = js.native
    def depth(path: typings.pathScurry.distMjsMod.Path): Double = js.native
    
    /**
      * Return the dirname for the provided string or Path object
      */
    def dirname(): String = js.native
    def dirname(entry: String): String = js.native
    def dirname(entry: PathBase): String = js.native
    
    /**
      * Determine whether a given path string is absolute
      */
    def isAbsolute(p: String): Boolean = js.native
    
    /**
      * Async generator form of {@link PathScurryBase.walk}
      *
      * Note: As of Node 19, this is very slow, compared to other methods of
      * walking, especially if most/all of the directory tree has been previously
      * walked.  Consider using {@link PathScurryBase.stream} if memory overhead
      * and backpressure are concerns, or {@link PathScurryBase.walk} if not.
      */
    def iterate(): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(entry: String): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(entry: String, opts: WalkOptions): AsyncGenerator[PathBase | String, Unit, Unit] = js.native
    def iterate(entry: String, opts: WalkOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(entry: String, opts: WalkOptionsWithFileTypesTrue): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(entry: String, opts: WalkOptionsWithFileTypesUnset): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(entry: PathBase): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(entry: PathBase, opts: WalkOptions): AsyncGenerator[PathBase | String, Unit, Unit] = js.native
    def iterate(entry: PathBase, opts: WalkOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(entry: PathBase, opts: WalkOptionsWithFileTypesTrue): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(entry: PathBase, opts: WalkOptionsWithFileTypesUnset): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(opts: WalkOptions): AsyncGenerator[String | PathBase, Unit, Unit] = js.native
    def iterate(opts: WalkOptionsWithFileTypesFalse): AsyncGenerator[String, Unit, Unit] = js.native
    def iterate(opts: WalkOptionsWithFileTypesTrue): AsyncGenerator[PathBase, Unit, Unit] = js.native
    def iterate(opts: WalkOptionsWithFileTypesUnset): AsyncGenerator[PathBase, Unit, Unit] = js.native
    
    def iterateSync(): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(entry: String): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(entry: String, opts: WalkOptions): Generator[PathBase | String, Unit, Unit] = js.native
    def iterateSync(entry: String, opts: WalkOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def iterateSync(entry: String, opts: WalkOptionsWithFileTypesTrue): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(entry: String, opts: WalkOptionsWithFileTypesUnset): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(entry: PathBase): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(entry: PathBase, opts: WalkOptions): Generator[PathBase | String, Unit, Unit] = js.native
    def iterateSync(entry: PathBase, opts: WalkOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def iterateSync(entry: PathBase, opts: WalkOptionsWithFileTypesTrue): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(entry: PathBase, opts: WalkOptionsWithFileTypesUnset): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(opts: WalkOptions): Generator[String | PathBase, Unit, Unit] = js.native
    def iterateSync(opts: WalkOptionsWithFileTypesFalse): Generator[String, Unit, Unit] = js.native
    def iterateSync(opts: WalkOptionsWithFileTypesTrue): Generator[PathBase, Unit, Unit] = js.native
    def iterateSync(opts: WalkOptionsWithFileTypesUnset): Generator[PathBase, Unit, Unit] = js.native
    
    /**
      * Iterating over a PathScurry performs a synchronous walk.
      *
      * Alias for {@link PathScurryBase.iterateSync}
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[PathBase, Unit, Unit]] = js.native
    
    /**
      * Call lstat() on the string or Path object, and update all known
      * information that can be determined.
      *
      * Note that unlike `fs.lstat()`, the returned value does not contain some
      * information, such as `mode`, `dev`, `nlink`, and `ino`.  If that
      * information is required, you will need to call `fs.lstat` yourself.
      *
      * If the Path refers to a nonexistent file, or if the lstat call fails for
      * any reason, `undefined` is returned.  Otherwise the updated Path object is
      * returned.
      *
      * Results are cached, and thus may be out of date if the filesystem is
      * mutated.
      */
    def lstat(): js.Promise[js.UndefOr[PathBase]] = js.native
    def lstat(entry: String): js.Promise[js.UndefOr[PathBase]] = js.native
    def lstat(entry: PathBase): js.Promise[js.UndefOr[PathBase]] = js.native
    
    /**
      * synchronous {@link PathScurryBase.lstat}
      */
    def lstatSync(): js.UndefOr[PathBase] = js.native
    def lstatSync(entry: String): js.UndefOr[PathBase] = js.native
    def lstatSync(entry: PathBase): js.UndefOr[PathBase] = js.native
    
    /**
      * create a new Path to use as root during construction.
      *
      * @internal
      */
    def newRoot(fs: FSValue): PathBase = js.native
    
    /**
      * Perform path comparisons case-insensitively.
      *
      * Defaults true on Darwin and Windows systems, false elsewhere.
      */
    var nocase: Boolean = js.native
    
    /**
      * Parse the root portion of a path string
      *
      * @internal
      */
    def parseRootPath(dir: String): String = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Return an array of known child entries.
      *
      * First argument may be either a string, or a Path object.
      *
      * If the Path cannot or does not contain any children, then an empty array
      * is returned.
      *
      * Results are cached, and thus may be out of date if the filesystem is
      * mutated.
      *
      * Unlike `fs.readdir()`, the `withFileTypes` option defaults to `true`. Set
      * `{ withFileTypes: false }` to return strings.
      */
    def readdir(): js.Promise[js.Array[PathBase]] = js.native
    def readdir(entry: String): js.Promise[js.Array[PathBase]] = js.native
    def readdir(entry: String, opts: WithFileTypes): js.Promise[js.Array[PathBase]] = js.native
    def readdir(entry: String, opts: WithFileTypesBoolean): js.Promise[js.Array[PathBase | String]] = js.native
    def readdir(entry: String, opts: `0`): js.Promise[js.Array[String]] = js.native
    def readdir(entry: PathBase): js.Promise[js.Array[PathBase]] = js.native
    def readdir(entry: PathBase, opts: WithFileTypes): js.Promise[js.Array[PathBase]] = js.native
    def readdir(entry: PathBase, opts: WithFileTypesBoolean): js.Promise[js.Array[PathBase | String]] = js.native
    def readdir(entry: PathBase, opts: `0`): js.Promise[js.Array[String]] = js.native
    def readdir(opts: WithFileTypes): js.Promise[js.Array[PathBase]] = js.native
    def readdir(opts: WithFileTypesBoolean): js.Promise[js.Array[PathBase | String]] = js.native
    def readdir(opts: `0`): js.Promise[js.Array[String]] = js.native
    
    /**
      * synchronous {@link PathScurryBase.readdir}
      */
    def readdirSync(): js.Array[PathBase] = js.native
    def readdirSync(entry: String): js.Array[PathBase] = js.native
    def readdirSync(entry: String, opts: WithFileTypes): js.Array[PathBase] = js.native
    def readdirSync(entry: String, opts: WithFileTypesBoolean): js.Array[PathBase | String] = js.native
    def readdirSync(entry: String, opts: `0`): js.Array[String] = js.native
    def readdirSync(entry: PathBase): js.Array[PathBase] = js.native
    def readdirSync(entry: PathBase, opts: WithFileTypes): js.Array[PathBase] = js.native
    def readdirSync(entry: PathBase, opts: WithFileTypesBoolean): js.Array[PathBase | String] = js.native
    def readdirSync(entry: PathBase, opts: `0`): js.Array[String] = js.native
    def readdirSync(opts: WithFileTypes): js.Array[PathBase] = js.native
    def readdirSync(opts: WithFileTypesBoolean): js.Array[PathBase | String] = js.native
    def readdirSync(opts: `0`): js.Array[String] = js.native
    
    /**
      * Return the Path object or string path corresponding to the target of a
      * symbolic link.
      *
      * If the path is not a symbolic link, or if the readlink call fails for any
      * reason, `undefined` is returned.
      *
      * Result is cached, and thus may be outdated if the filesystem is mutated.
      *
      * `{withFileTypes}` option defaults to `false`.
      *
      * On success, returns a Path object if `withFileTypes` option is true,
      * otherwise a string.
      */
    def readlink(): js.Promise[js.UndefOr[String]] = js.native
    def readlink(entry: String): js.Promise[js.UndefOr[String]] = js.native
    def readlink(entry: String, opt: WithFileTypes): js.Promise[js.UndefOr[PathBase]] = js.native
    def readlink(entry: String, opt: WithFileTypesBoolean): js.Promise[js.UndefOr[String | PathBase]] = js.native
    def readlink(entry: String, opt: `0`): js.Promise[js.UndefOr[String]] = js.native
    def readlink(entry: PathBase): js.Promise[js.UndefOr[String]] = js.native
    def readlink(entry: PathBase, opt: WithFileTypes): js.Promise[js.UndefOr[PathBase]] = js.native
    def readlink(entry: PathBase, opt: WithFileTypesBoolean): js.Promise[js.UndefOr[String | PathBase]] = js.native
    def readlink(entry: PathBase, opt: `0`): js.Promise[js.UndefOr[String]] = js.native
    def readlink(opt: WithFileTypes): js.Promise[js.UndefOr[PathBase]] = js.native
    def readlink(opt: WithFileTypesBoolean): js.Promise[js.UndefOr[PathBase | String]] = js.native
    def readlink(opt: `0`): js.Promise[js.UndefOr[String]] = js.native
    
    /**
      * synchronous {@link PathScurryBase.readlink}
      */
    def readlinkSync(): js.UndefOr[String] = js.native
    def readlinkSync(entry: String): js.UndefOr[String] = js.native
    def readlinkSync(entry: String, opt: WithFileTypes): js.UndefOr[PathBase] = js.native
    def readlinkSync(entry: String, opt: WithFileTypesBoolean): js.UndefOr[String | PathBase] = js.native
    def readlinkSync(entry: String, opt: `0`): js.UndefOr[String] = js.native
    def readlinkSync(entry: PathBase): js.UndefOr[String] = js.native
    def readlinkSync(entry: PathBase, opt: WithFileTypes): js.UndefOr[PathBase] = js.native
    def readlinkSync(entry: PathBase, opt: WithFileTypesBoolean): js.UndefOr[String | PathBase] = js.native
    def readlinkSync(entry: PathBase, opt: `0`): js.UndefOr[String] = js.native
    def readlinkSync(opt: WithFileTypes): js.UndefOr[PathBase] = js.native
    def readlinkSync(opt: WithFileTypesBoolean): js.UndefOr[PathBase | String] = js.native
    def readlinkSync(opt: `0`): js.UndefOr[String] = js.native
    
    /**
      * Return the Path object or string path corresponding to path as resolved
      * by realpath(3).
      *
      * If the realpath call fails for any reason, `undefined` is returned.
      *
      * Result is cached, and thus may be outdated if the filesystem is mutated.
      *
      * `{withFileTypes}` option defaults to `false`.
      *
      * On success, returns a Path object if `withFileTypes` option is true,
      * otherwise a string.
      */
    def realpath(): js.Promise[js.UndefOr[String]] = js.native
    def realpath(entry: String): js.Promise[js.UndefOr[String]] = js.native
    def realpath(entry: String, opt: WithFileTypes): js.Promise[js.UndefOr[PathBase]] = js.native
    def realpath(entry: String, opt: WithFileTypesBoolean): js.Promise[js.UndefOr[String | PathBase]] = js.native
    def realpath(entry: String, opt: `0`): js.Promise[js.UndefOr[String]] = js.native
    def realpath(entry: PathBase): js.Promise[js.UndefOr[String]] = js.native
    def realpath(entry: PathBase, opt: WithFileTypes): js.Promise[js.UndefOr[PathBase]] = js.native
    def realpath(entry: PathBase, opt: WithFileTypesBoolean): js.Promise[js.UndefOr[String | PathBase]] = js.native
    def realpath(entry: PathBase, opt: `0`): js.Promise[js.UndefOr[String]] = js.native
    def realpath(opt: WithFileTypes): js.Promise[js.UndefOr[PathBase]] = js.native
    def realpath(opt: WithFileTypesBoolean): js.Promise[js.UndefOr[PathBase | String]] = js.native
    def realpath(opt: `0`): js.Promise[js.UndefOr[String]] = js.native
    
    def realpathSync(): js.UndefOr[String] = js.native
    def realpathSync(entry: String): js.UndefOr[String] = js.native
    def realpathSync(entry: String, opt: WithFileTypes): js.UndefOr[PathBase] = js.native
    def realpathSync(entry: String, opt: WithFileTypesBoolean): js.UndefOr[String | PathBase] = js.native
    def realpathSync(entry: String, opt: `0`): js.UndefOr[String] = js.native
    def realpathSync(entry: PathBase): js.UndefOr[String] = js.native
    def realpathSync(entry: PathBase, opt: WithFileTypes): js.UndefOr[PathBase] = js.native
    def realpathSync(entry: PathBase, opt: WithFileTypesBoolean): js.UndefOr[String | PathBase] = js.native
    def realpathSync(entry: PathBase, opt: `0`): js.UndefOr[String] = js.native
    def realpathSync(opt: WithFileTypes): js.UndefOr[PathBase] = js.native
    def realpathSync(opt: WithFileTypesBoolean): js.UndefOr[PathBase | String] = js.native
    def realpathSync(opt: `0`): js.UndefOr[String] = js.native
    
    /**
      * find the relative path from the cwd to the supplied path string or entry
      */
    def relative(): String = js.native
    def relative(entry: String): String = js.native
    def relative(entry: PathBase): String = js.native
    
    /**
      * find the relative path from the cwd to the supplied path string or
      * entry, using / as the path delimiter, even on Windows.
      */
    def relativePosix(): String = js.native
    def relativePosix(entry: String): String = js.native
    def relativePosix(entry: PathBase): String = js.native
    
    /**
      * Resolve one or more path strings to a resolved string
      *
      * Same interface as require('path').resolve.
      *
      * Much faster than path.resolve() when called multiple times for the same
      * path, because the resolved Path objects are cached.  Much slower
      * otherwise.
      */
    def resolve(paths: String*): String = js.native
    
    /**
      * Resolve one or more path strings to a resolved string, returning
      * the posix path.  Identical to .resolve() on posix systems, but on
      * windows will return a forward-slash separated UNC path.
      *
      * Same interface as require('path').resolve.
      *
      * Much faster than path.resolve() when called multiple times for the same
      * path, because the resolved Path objects are cached.  Much slower
      * otherwise.
      */
    def resolvePosix(paths: String*): String = js.native
    
    /**
      * The root Path entry for the current working directory of this Scurry
      */
    var root: PathBase = js.native
    
    /**
      * The string path for the root of this Scurry's current working directory
      */
    var rootPath: String = js.native
    
    /**
      * A collection of all roots encountered, referenced by rootPath
      */
    var roots: StringDictionary[PathBase] = js.native
    
    /**
      * The path separator used for parsing paths
      *
      * `'/'` on Posix systems, either `'/'` or `'\\'` on Windows
      */
    var sep: String | js.RegExp = js.native
    
    /**
      * Stream form of {@link PathScurryBase.walk}
      *
      * Returns a Minipass stream that emits {@link PathBase} objects by default,
      * or strings if `{ withFileTypes: false }` is set in the options.
      */
    def stream(): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(entry: String): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(entry: String, opts: WalkOptions): Minipass[
        PathBase | String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def stream(entry: String, opts: WalkOptionsWithFileTypesFalse): Minipass[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def stream(entry: String, opts: WalkOptionsWithFileTypesTrue): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(entry: String, opts: WalkOptionsWithFileTypesUnset): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(entry: PathBase): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(entry: PathBase, opts: WalkOptions): Minipass[
        PathBase | String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def stream(entry: PathBase, opts: WalkOptionsWithFileTypesFalse): Minipass[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def stream(entry: PathBase, opts: WalkOptionsWithFileTypesTrue): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(entry: PathBase, opts: WalkOptionsWithFileTypesUnset): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(opts: WalkOptions): Minipass[
        String | PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: string | path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string | path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(opts: WalkOptionsWithFileTypesFalse): Minipass[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def stream(opts: WalkOptionsWithFileTypesTrue): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def stream(opts: WalkOptionsWithFileTypesUnset): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    
    /**
      * Synchronous form of {@link PathScurryBase.stream}
      *
      * Returns a Minipass stream that emits {@link PathBase} objects by default,
      * or strings if `{ withFileTypes: false }` is set in the options.
      *
      * Will complete the walk in a single tick if the stream is consumed fully.
      * Otherwise, will pause as needed for stream backpressure.
      */
    def streamSync(): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(entry: String): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(entry: String, opts: WalkOptions): Minipass[
        PathBase | String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def streamSync(entry: String, opts: WalkOptionsWithFileTypesFalse): Minipass[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def streamSync(entry: String, opts: WalkOptionsWithFileTypesTrue): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(entry: String, opts: WalkOptionsWithFileTypesUnset): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(entry: PathBase): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(entry: PathBase, opts: WalkOptions): Minipass[
        PathBase | String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def streamSync(entry: PathBase, opts: WalkOptionsWithFileTypesFalse): Minipass[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def streamSync(entry: PathBase, opts: WalkOptionsWithFileTypesTrue): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(entry: PathBase, opts: WalkOptionsWithFileTypesUnset): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(opts: WalkOptions): Minipass[
        String | PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: string | path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string | path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(opts: WalkOptionsWithFileTypesFalse): Minipass[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: string extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : string */ js.Any
      ] = js.native
    def streamSync(opts: WalkOptionsWithFileTypesTrue): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    def streamSync(opts: WalkOptionsWithFileTypesUnset): Minipass[
        PathBase, 
        /* import warning: importer.ImportType#apply Failed type conversion: path-scurry.path-scurry/dist/mjs.PathBase extends minipass.minipass.Minipass.BufferOrString ? minipass.minipass.Minipass.ContiguousData : path-scurry.path-scurry/dist/mjs.PathBase */ js.Any
      ] = js.native
    
    /**
      * Asynchronously walk the directory tree, returning an array of
      * all path strings or Path objects found.
      *
      * Note that this will be extremely memory-hungry on large filesystems.
      * In such cases, it may be better to use the stream or async iterator
      * walk implementation.
      */
    def walk(): js.Promise[js.Array[PathBase]] = js.native
    def walk(entry: String): js.Promise[js.Array[PathBase]] = js.native
    def walk(entry: String, opts: WalkOptions): js.Promise[js.Array[PathBase | String]] = js.native
    def walk(entry: String, opts: WalkOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = js.native
    def walk(entry: String, opts: WalkOptionsWithFileTypesTrue): js.Promise[js.Array[PathBase]] = js.native
    def walk(entry: String, opts: WalkOptionsWithFileTypesUnset): js.Promise[js.Array[PathBase]] = js.native
    def walk(entry: PathBase): js.Promise[js.Array[PathBase]] = js.native
    def walk(entry: PathBase, opts: WalkOptions): js.Promise[js.Array[PathBase | String]] = js.native
    def walk(entry: PathBase, opts: WalkOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = js.native
    def walk(entry: PathBase, opts: WalkOptionsWithFileTypesTrue): js.Promise[js.Array[PathBase]] = js.native
    def walk(entry: PathBase, opts: WalkOptionsWithFileTypesUnset): js.Promise[js.Array[PathBase]] = js.native
    def walk(opts: WalkOptions): js.Promise[js.Array[PathBase | String]] = js.native
    def walk(opts: WalkOptionsWithFileTypesFalse): js.Promise[js.Array[String]] = js.native
    def walk(opts: WalkOptionsWithFileTypesTrue): js.Promise[js.Array[PathBase]] = js.native
    def walk(opts: WalkOptionsWithFileTypesUnset): js.Promise[js.Array[PathBase]] = js.native
    
    /**
      * Synchronously walk the directory tree, returning an array of
      * all path strings or Path objects found.
      *
      * Note that this will be extremely memory-hungry on large filesystems.
      * In such cases, it may be better to use the stream or async iterator
      * walk implementation.
      */
    def walkSync(): js.Array[PathBase] = js.native
    def walkSync(entry: String): js.Array[PathBase] = js.native
    def walkSync(entry: String, opts: WalkOptions): js.Array[PathBase | String] = js.native
    def walkSync(entry: String, opts: WalkOptionsWithFileTypesFalse): js.Array[String] = js.native
    def walkSync(entry: String, opts: WalkOptionsWithFileTypesTrue): js.Array[PathBase] = js.native
    def walkSync(entry: String, opts: WalkOptionsWithFileTypesUnset): js.Array[PathBase] = js.native
    def walkSync(entry: PathBase): js.Array[PathBase] = js.native
    def walkSync(entry: PathBase, opts: WalkOptions): js.Array[PathBase | String] = js.native
    def walkSync(entry: PathBase, opts: WalkOptionsWithFileTypesFalse): js.Array[String] = js.native
    def walkSync(entry: PathBase, opts: WalkOptionsWithFileTypesTrue): js.Array[PathBase] = js.native
    def walkSync(entry: PathBase, opts: WalkOptionsWithFileTypesUnset): js.Array[PathBase] = js.native
    def walkSync(opts: WalkOptions): js.Array[PathBase | String] = js.native
    def walkSync(opts: WalkOptionsWithFileTypesFalse): js.Array[String] = js.native
    def walkSync(opts: WalkOptionsWithFileTypesTrue): js.Array[PathBase] = js.native
    def walkSync(opts: WalkOptionsWithFileTypesUnset): js.Array[PathBase] = js.native
  }
  
  @JSImport("path-scurry/dist/mjs", "PathScurryDarwin")
  @js.native
  open class PathScurryDarwin () extends PathScurryPosix {
    def this(cwd: String) = this()
    def this(cwd: URL) = this()
    def this(cwd: String, opts: PathScurryOpts) = this()
    def this(cwd: Unit, opts: PathScurryOpts) = this()
    def this(cwd: URL, opts: PathScurryOpts) = this()
  }
  
  @JSImport("path-scurry/dist/mjs", "PathScurryPosix")
  @js.native
  open class PathScurryPosix () extends PathScurryBase {
    def this(cwd: String) = this()
    def this(cwd: URL) = this()
    def this(cwd: String, opts: PathScurryOpts) = this()
    def this(cwd: Unit, opts: PathScurryOpts) = this()
    def this(cwd: URL, opts: PathScurryOpts) = this()
    
    /**
      * separator for generating path strings
      */
    @JSName("sep")
    var sep_PathScurryPosix: Slash = js.native
  }
  
  @JSImport("path-scurry/dist/mjs", "PathScurryWin32")
  @js.native
  open class PathScurryWin32 () extends PathScurryBase {
    def this(cwd: String) = this()
    def this(cwd: URL) = this()
    def this(cwd: String, opts: PathScurryOpts) = this()
    def this(cwd: Unit, opts: PathScurryOpts) = this()
    def this(cwd: URL, opts: PathScurryOpts) = this()
    
    /**
      * separator for generating path strings
      */
    @JSName("sep")
    var sep_PathScurryWin32: /* \ */ String = js.native
  }
  
  @JSImport("path-scurry/dist/mjs", "PathWin32")
  @js.native
  open class PathWin32 protected () extends PathBase {
    def this(
      name: String,
      `type`: Double,
      root: Unit,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    /**
      * Do not create new Path objects directly.  They should always be accessed
      * via the PathScurry class or other methods on the Path class.
      *
      * @internal
      */
    def this(
      name: String,
      `type`: Double,
      root: PathBase,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    def this(
      name: String,
      `type`: Unit,
      root: Unit,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    def this(
      name: String,
      `type`: Unit,
      root: PathBase,
      roots: StringDictionary[PathBase],
      nocase: Boolean,
      children: ChildrenCache,
      opts: PathOpts
    ) = this()
    
    /**
      * @internal
      */
    def sameRoot(rootPath: String): Boolean = js.native
    def sameRoot(rootPath: String, compare: String): Boolean = js.native
    
    /**
      * Separator for parsing path strings.
      */
    @JSName("splitSep")
    var splitSep_PathWin32: js.RegExp = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LRUCache<string, string> * / any */ @JSImport("path-scurry/dist/mjs", "ResolveCache")
  @js.native
  open class ResolveCache () extends StObject
  
  @js.native
  trait Children
    extends StObject
       with Array[PathBase] {
    
    var provisional: Double = js.native
  }
  
  trait FSOption
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var lstatSync: js.UndefOr[js.Function1[/* path */ String, Stats]] = js.undefined
    
    var promises: js.UndefOr[Dictk] = js.undefined
    
    var readdir: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* options */ WithFileTypes, 
          /* cb */ js.Function2[/* er */ ErrnoException | Null, /* entries */ js.UndefOr[js.Array[Dirent]], Any], 
          Unit
        ]
      ] = js.undefined
    
    var readdirSync: js.UndefOr[js.Function2[/* path */ String, /* options */ WithFileTypes, js.Array[Dirent]]] = js.undefined
    
    var readlinkSync: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
    
    var realpathSync: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  }
  object FSOption {
    
    inline def apply(): FSOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FSOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FSOption] (val x: Self) extends AnyVal {
      
      inline def setLstatSync(value: /* path */ String => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      inline def setPromises(value: Dictk): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
      
      inline def setPromisesUndefined: Self = StObject.set(x, "promises", js.undefined)
      
      inline def setReaddir(
        value: (/* path */ String, /* options */ WithFileTypes, /* cb */ js.Function2[/* er */ ErrnoException | Null, /* entries */ js.UndefOr[js.Array[Dirent]], Any]) => Unit
      ): Self = StObject.set(x, "readdir", js.Any.fromFunction3(value))
      
      inline def setReaddirSync(value: (/* path */ String, /* options */ WithFileTypes) => js.Array[Dirent]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction2(value))
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setReadlinkSync(value: /* path */ String => String): Self = StObject.set(x, "readlinkSync", js.Any.fromFunction1(value))
      
      inline def setReadlinkSyncUndefined: Self = StObject.set(x, "readlinkSync", js.undefined)
      
      inline def setRealpathSync(value: /* path */ String => String): Self = StObject.set(x, "realpathSync", js.Any.fromFunction1(value))
      
      inline def setRealpathSyncUndefined: Self = StObject.set(x, "realpathSync", js.undefined)
    }
  }
  
  trait FSValue
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    def lstatSync(path: String): Stats
    
    var promises: Lstat
    
    def readdir(
      path: String,
      options: WithFileTypes,
      cb: js.Function2[/* er */ ErrnoException | Null, /* entries */ js.UndefOr[js.Array[Dirent]], Any]
    ): Unit
    
    def readdirSync(path: String, options: WithFileTypes): js.Array[Dirent]
    
    def readlinkSync(path: String): String
    
    def realpathSync(path: String): String
  }
  object FSValue {
    
    inline def apply(
      lstatSync: String => Stats,
      promises: Lstat,
      readdir: (String, WithFileTypes, js.Function2[/* er */ ErrnoException | Null, /* entries */ js.UndefOr[js.Array[Dirent]], Any]) => Unit,
      readdirSync: (String, WithFileTypes) => js.Array[Dirent],
      readlinkSync: String => String,
      realpathSync: String => String
    ): FSValue = {
      val __obj = js.Dynamic.literal(lstatSync = js.Any.fromFunction1(lstatSync), promises = promises.asInstanceOf[js.Any], readdir = js.Any.fromFunction3(readdir), readdirSync = js.Any.fromFunction2(readdirSync), readlinkSync = js.Any.fromFunction1(readlinkSync), realpathSync = js.Any.fromFunction1(realpathSync))
      __obj.asInstanceOf[FSValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FSValue] (val x: Self) extends AnyVal {
      
      inline def setLstatSync(value: String => Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setPromises(value: Lstat): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
      
      inline def setReaddir(
        value: (String, WithFileTypes, js.Function2[/* er */ ErrnoException | Null, /* entries */ js.UndefOr[js.Array[Dirent]], Any]) => Unit
      ): Self = StObject.set(x, "readdir", js.Any.fromFunction3(value))
      
      inline def setReaddirSync(value: (String, WithFileTypes) => js.Array[Dirent]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction2(value))
      
      inline def setReadlinkSync(value: String => String): Self = StObject.set(x, "readlinkSync", js.Any.fromFunction1(value))
      
      inline def setRealpathSync(value: String => String): Self = StObject.set(x, "realpathSync", js.Any.fromFunction1(value))
    }
  }
  
  trait PathOpts extends StObject {
    
    /**
      * See {@link FSOption}
      */
    var fs: js.UndefOr[FSOption] = js.undefined
    
    var fullpath: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[PathBase] = js.undefined
    
    var relative: js.UndefOr[String] = js.undefined
    
    var relativePosix: js.UndefOr[String] = js.undefined
  }
  object PathOpts {
    
    inline def apply(): PathOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathOpts] (val x: Self) extends AnyVal {
      
      inline def setFs(value: FSOption): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setFullpath(value: String): Self = StObject.set(x, "fullpath", value.asInstanceOf[js.Any])
      
      inline def setFullpathUndefined: Self = StObject.set(x, "fullpath", js.undefined)
      
      inline def setParent(value: PathBase): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativePosix(value: String): Self = StObject.set(x, "relativePosix", value.asInstanceOf[js.Any])
      
      inline def setRelativePosixUndefined: Self = StObject.set(x, "relativePosix", js.undefined)
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  trait PathScurryOpts extends StObject {
    
    /**
      * Number of Path entries to keep in the cache of Path child references.
      *
      * Setting this higher than 65536 will dramatically increase the data
      * consumption and construction time overhead of each PathScurry.
      *
      * Setting this value to 256 or lower will significantly reduce the data
      * consumption and construction time overhead, but may also reduce resolve()
      * and readdir() performance on large filesystems.
      *
      * Default `16384`.
      */
    var childrenCacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * An object that overrides the built-in functions from the fs and
      * fs/promises modules.
      *
      * See {@link FSOption}
      */
    var fs: js.UndefOr[FSOption] = js.undefined
    
    /**
      * perform case-insensitive path matching. Default based on platform
      * subclass.
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
  }
  object PathScurryOpts {
    
    inline def apply(): PathScurryOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathScurryOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathScurryOpts] (val x: Self) extends AnyVal {
      
      inline def setChildrenCacheSize(value: Double): Self = StObject.set(x, "childrenCacheSize", value.asInstanceOf[js.Any])
      
      inline def setChildrenCacheSizeUndefined: Self = StObject.set(x, "childrenCacheSize", js.undefined)
      
      inline def setFs(value: FSOption): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
    }
  }
  
  trait WalkOptions extends StObject {
    
    /**
      * Only return entries where the provided function returns true.
      *
      * This will not prevent directories from being traversed, even if they do
      * not pass the filter, though it will prevent directories themselves from
      * being included in the result set.  See {@link walkFilter}
      *
      * Asynchronous functions are not supported here.
      *
      * By default, if no filter is provided, all entries and traversed
      * directories are included.
      */
    var filter: js.UndefOr[js.Function1[/* entry */ PathBase, Boolean]] = js.undefined
    
    /**
      *  Attempt to read directory entries from symbolic links. Otherwise, only
      *  actual directories are traversed. Regardless of this setting, a given
      *  target path will only ever be walked once, meaning that a symbolic link
      *  to a previously traversed directory will never be followed.
      *
      *  Setting this imposes a slight performance penalty, because `readlink`
      *  must be called on all symbolic links encountered, in order to avoid
      *  infinite cycles.
      * @default false
      */
    var follow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only traverse directories (and in the case of {@link follow} being set to
      * true, symbolic links to directories) if the provided function returns
      * true.
      *
      * This will not prevent directories from being included in the result set,
      * even if they do not pass the supplied filter function.  See {@link filter}
      * to do that.
      *
      * Asynchronous functions are not supported here.
      */
    var walkFilter: js.UndefOr[js.Function1[/* entry */ PathBase, Boolean]] = js.undefined
    
    /**
      * Return results as {@link PathBase} objects rather than strings.
      * When set to false, results are fully resolved paths, as returned by
      * {@link PathBase.fullpath}.
      * @default true
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object WalkOptions {
    
    inline def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: /* entry */ PathBase => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setWalkFilter(value: /* entry */ PathBase => Boolean): Self = StObject.set(x, "walkFilter", js.Any.fromFunction1(value))
      
      inline def setWalkFilterUndefined: Self = StObject.set(x, "walkFilter", js.undefined)
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  trait WalkOptionsWithFileTypesFalse
    extends StObject
       with WalkOptions {
    
    @JSName("withFileTypes")
    var withFileTypes_WalkOptionsWithFileTypesFalse: `false`
  }
  object WalkOptionsWithFileTypesFalse {
    
    inline def apply(): WalkOptionsWithFileTypesFalse = {
      val __obj = js.Dynamic.literal(withFileTypes = false)
      __obj.asInstanceOf[WalkOptionsWithFileTypesFalse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkOptionsWithFileTypesFalse] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait WalkOptionsWithFileTypesTrue
    extends StObject
       with WalkOptions {
    
    @JSName("withFileTypes")
    var withFileTypes_WalkOptionsWithFileTypesTrue: `true`
  }
  object WalkOptionsWithFileTypesTrue {
    
    inline def apply(): WalkOptionsWithFileTypesTrue = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[WalkOptionsWithFileTypesTrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkOptionsWithFileTypesTrue] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait WalkOptionsWithFileTypesUnset
    extends StObject
       with WalkOptions {
    
    @JSName("withFileTypes")
    var withFileTypes_WalkOptionsWithFileTypesUnset: Unit
  }
  object WalkOptionsWithFileTypesUnset {
    
    inline def apply(withFileTypes: Unit): WalkOptionsWithFileTypesUnset = {
      val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkOptionsWithFileTypesUnset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkOptionsWithFileTypesUnset] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: Unit): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
}
