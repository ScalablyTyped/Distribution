package typings.node7z

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.childProcessMod.ChildProcess
import typings.node.streamMod.Stream
import typings.node7z.node7zStrings.data
import typings.node7z.node7zStrings.end
import typings.node7z.node7zStrings.error
import typings.node7z.node7zStrings.pause
import typings.node7z.node7zStrings.progress
import typings.node7z.node7zStrings.readable
import typings.node7z.node7zStrings.resume
import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-7z", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add files to an archive
    * @param archive Archive to create
    * @param source Source files to add to the archive
    * @param options Seven Zip Options
    */
  inline def add(archive: String, source: String): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(archive.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def add(archive: String, source: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(archive.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def add(archive: String, source: js.Array[String]): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(archive.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def add(archive: String, source: js.Array[String], options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(archive.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Delete files from an archive
    * @param archive Archive to target
    * @param output Target files to remove from the archive
    * @param options Seven Zip Options
    */
  inline def delete(archive: String, target: String): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(archive.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def delete(archive: String, target: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(archive.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def delete(archive: String, target: js.Array[String]): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(archive.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def delete(archive: String, target: js.Array[String], options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(archive.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Extracts files from an archive to the current directory or to the output directory. This command copies all extracted files to one directory.
    * @param archive Archive to extract files from
    * @param output Output directory
    * @param options Seven Zip Options
    */
  inline def extract(archive: String, output: String): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(archive.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def extract(archive: String, output: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(archive.asInstanceOf[js.Any], output.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Extracts files from an archive to the current directory or to the output directory.
    * @param archive Archive to extract files from
    * @param output Output directory
    * @param options Seven Zip Options
    */
  inline def extractFull(archive: String, output: String): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFull")(archive.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def extractFull(archive: String, output: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFull")(archive.asInstanceOf[js.Any], output.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Calculate hash values for files
    * @param target Target files to calculate the hash of
    * @param options Seven Zip Options
    */
  inline def hash(target: String): ZipStream = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(target.asInstanceOf[js.Any]).asInstanceOf[ZipStream]
  inline def hash(target: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def hash(target: js.Array[String]): ZipStream = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(target.asInstanceOf[js.Any]).asInstanceOf[ZipStream]
  inline def hash(target: js.Array[String], options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Lists contents of archive
    * @param archive Archive to list the contents from
    * @param options Seven Zip Options
    */
  inline def list(archive: String): ZipStream = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(archive.asInstanceOf[js.Any]).asInstanceOf[ZipStream]
  inline def list(archive: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(archive.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Registers the child process given by the $childProcess option.
    * Must be deferred with the $defer option during creation.
    * @param stream ZipStream to register listeners on
    */
  inline def listen(stream: ZipStream): ZipStream = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(stream.asInstanceOf[js.Any]).asInstanceOf[ZipStream]
  
  /**
    * Rename files in an archive
    * @param archive Archive to target
    * @param target Pairs of target names and new names to rename to
    * @param options Seven Zip Options
    */
  inline def rename(archive: String, target: js.Array[js.Array[String]]): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(archive.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def rename(archive: String, target: js.Array[js.Array[String]], options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(archive.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Tests archive files
    * @param archive Archive to test
    * @param options Seven Zip Options
    */
  inline def test(archive: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(archive.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  /**
    * Update older files in the archive and add files that are not already in the archiv
    * @param archive Archive to update
    * @param source Source files to update from the file-system to the archive
    * @param options Seven Zip Options
    */
  inline def update(archive: String, files: String): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(archive.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def update(archive: String, files: String, options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(archive.asInstanceOf[js.Any], files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def update(archive: String, files: js.Array[String]): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(archive.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  inline def update(archive: String, files: js.Array[String], options: SevenZipOptions): ZipStream = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(archive.asInstanceOf[js.Any], files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ZipStream]
  
  // NOTE - The names are not wrong, some are spelt wrong in the source
  trait CommandLineSwitches extends StObject {
    
    /** Extract file as alternate stream, if there is ':' character in name (-snc) */
    var alternateStreamExtract: js.UndefOr[Boolean] = js.undefined
    
    /** Replace ':' character to '_' character in paths of alternate streams (-snr) */
    var alternateStreamReplace: js.UndefOr[Boolean] = js.undefined
    
    /** Store NTFS alternate Streams (-sns) */
    var alternateStreamStore: js.UndefOr[Boolean] = js.undefined
    
    /** Set Archive name mode (-sa) */
    var archiveNameMode: js.UndefOr[String] = js.undefined
    
    /** Type of archive (-t) */
    var archiveType: js.UndefOr[String] = js.undefined
    
    /** Set Sensitive Case mode (-ssc) */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /** Set CPU thread affinity mask (hexadecimal number). (-stm) */
    var cpuAffinity: js.UndefOr[String] = js.undefined
    
    /** Delete files after compression (-sdel) */
    var deleteFilesAfter: js.UndefOr[Boolean] = js.undefined
    
    /** Exclude archive filenames (-ax) */
    var excludeArchive: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Exclude archive type (-stx) */
    var excludeArchiveType: js.UndefOr[String] = js.undefined
    
    /** Exclude filenames (-x) */
    var exlude: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Read data from StdIn (-si) */
    var fromStdin: js.UndefOr[String] = js.undefined
    
    /** Usefully qualified file paths (-spf) */
    var fullyQualifiedPaths: js.UndefOr[Boolean] = js.undefined
    
    /** Store hard links as links (WIM and TAR formats only) (-snh) */
    var hardlinks: js.UndefOr[Boolean] = js.undefined
    
    /** Set hash function (-scrc) */
    var hashMethod: js.UndefOr[String] = js.undefined
    
    /** Include filenames (-i) */
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Include archive filenames (-ai) */
    var includeArchive: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set Large Pages mode (-spl) */
    var largePages: js.UndefOr[Boolean] = js.undefined
    
    /** Set archive timestamp from the most recently modified file (-stl) */
    var latestTimeStamp: js.UndefOr[Boolean] = js.undefined
    
    /** Set charset for list files (-scs) */
    var listFileCharset: js.UndefOr[String] = js.undefined
    
    /** Set output log level (-bb) */
    var logLevel: js.UndefOr[String] = js.undefined
    
    /** Set Compression Method (-m) */
    var method: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Creates multi-block xz archives by default. Block size can be specified with [Size]{m|g} */
    var multiBlockSize: js.UndefOr[String] = js.undefined
    
    /** Stop archive creating, if 7-Zip can't open some input file.(-sse) */
    var noArchiveOnFail: js.UndefOr[Boolean] = js.undefined
    
    /** Eliminate duplication of root folder for extract command (-spe) */
    var noRootDuplication: js.UndefOr[Boolean] = js.undefined
    
    /** Disable wildcard matching for file names (-spd) */
    var noWildcards: js.UndefOr[Boolean] = js.undefined
    
    /** Store NT security (-sni) */
    var ntSecurity: js.UndefOr[Boolean] = js.undefined
    
    /** Compress files open for writing (-ssw) */
    var openFiles: js.UndefOr[Boolean] = js.undefined
    
    /** Set Output directory (-o) */
    var outputDir: js.UndefOr[String] = js.undefined
    
    /** Set output stream for output/error/progress (-bs) */
    var outputStreams: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set Password (-p) */
    var password: js.UndefOr[String] = js.undefined
    
    /** Recurse subdirectories. For -r0 usage use $raw (-r) */
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    /** Create SFX archive (-sfx) */
    var sfx: js.UndefOr[String] = js.undefined
    
    /** Sort files by type while adding to solid 7z archive (-mqs) */
    var sortByType: js.UndefOr[Boolean] = js.undefined
    
    /** Store symbolic links as links (WIM and TAR formats only) (-snl) */
    var symlinks: js.UndefOr[Boolean] = js.undefined
    
    /** Show technical information (-slt) */
    var techInfo: js.UndefOr[Boolean] = js.undefined
    
    /** Show execution time statistics (-bt) */
    var timeStats: js.UndefOr[Boolean] = js.undefined
    
    /** Write data to stdout (-so) */
    var toStdout: js.UndefOr[Boolean] = js.undefined
    
    /** Update options (-u) */
    var updateOptions: js.UndefOr[String] = js.undefined
    
    /** Create Volumes (v) */
    var volumes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set Working directory (-w) */
    var workingDir: js.UndefOr[String] = js.undefined
    
    /** Assume Yes on all queries (-y) */
    var yes: js.UndefOr[Boolean] = js.undefined
  }
  object CommandLineSwitches {
    
    inline def apply(): CommandLineSwitches = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandLineSwitches]
    }
    
    extension [Self <: CommandLineSwitches](x: Self) {
      
      inline def setAlternateStreamExtract(value: Boolean): Self = StObject.set(x, "alternateStreamExtract", value.asInstanceOf[js.Any])
      
      inline def setAlternateStreamExtractUndefined: Self = StObject.set(x, "alternateStreamExtract", js.undefined)
      
      inline def setAlternateStreamReplace(value: Boolean): Self = StObject.set(x, "alternateStreamReplace", value.asInstanceOf[js.Any])
      
      inline def setAlternateStreamReplaceUndefined: Self = StObject.set(x, "alternateStreamReplace", js.undefined)
      
      inline def setAlternateStreamStore(value: Boolean): Self = StObject.set(x, "alternateStreamStore", value.asInstanceOf[js.Any])
      
      inline def setAlternateStreamStoreUndefined: Self = StObject.set(x, "alternateStreamStore", js.undefined)
      
      inline def setArchiveNameMode(value: String): Self = StObject.set(x, "archiveNameMode", value.asInstanceOf[js.Any])
      
      inline def setArchiveNameModeUndefined: Self = StObject.set(x, "archiveNameMode", js.undefined)
      
      inline def setArchiveType(value: String): Self = StObject.set(x, "archiveType", value.asInstanceOf[js.Any])
      
      inline def setArchiveTypeUndefined: Self = StObject.set(x, "archiveType", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setCpuAffinity(value: String): Self = StObject.set(x, "cpuAffinity", value.asInstanceOf[js.Any])
      
      inline def setCpuAffinityUndefined: Self = StObject.set(x, "cpuAffinity", js.undefined)
      
      inline def setDeleteFilesAfter(value: Boolean): Self = StObject.set(x, "deleteFilesAfter", value.asInstanceOf[js.Any])
      
      inline def setDeleteFilesAfterUndefined: Self = StObject.set(x, "deleteFilesAfter", js.undefined)
      
      inline def setExcludeArchive(value: js.Array[String]): Self = StObject.set(x, "excludeArchive", value.asInstanceOf[js.Any])
      
      inline def setExcludeArchiveType(value: String): Self = StObject.set(x, "excludeArchiveType", value.asInstanceOf[js.Any])
      
      inline def setExcludeArchiveTypeUndefined: Self = StObject.set(x, "excludeArchiveType", js.undefined)
      
      inline def setExcludeArchiveUndefined: Self = StObject.set(x, "excludeArchive", js.undefined)
      
      inline def setExcludeArchiveVarargs(value: String*): Self = StObject.set(x, "excludeArchive", js.Array(value :_*))
      
      inline def setExlude(value: js.Array[String]): Self = StObject.set(x, "exlude", value.asInstanceOf[js.Any])
      
      inline def setExludeUndefined: Self = StObject.set(x, "exlude", js.undefined)
      
      inline def setExludeVarargs(value: String*): Self = StObject.set(x, "exlude", js.Array(value :_*))
      
      inline def setFromStdin(value: String): Self = StObject.set(x, "fromStdin", value.asInstanceOf[js.Any])
      
      inline def setFromStdinUndefined: Self = StObject.set(x, "fromStdin", js.undefined)
      
      inline def setFullyQualifiedPaths(value: Boolean): Self = StObject.set(x, "fullyQualifiedPaths", value.asInstanceOf[js.Any])
      
      inline def setFullyQualifiedPathsUndefined: Self = StObject.set(x, "fullyQualifiedPaths", js.undefined)
      
      inline def setHardlinks(value: Boolean): Self = StObject.set(x, "hardlinks", value.asInstanceOf[js.Any])
      
      inline def setHardlinksUndefined: Self = StObject.set(x, "hardlinks", js.undefined)
      
      inline def setHashMethod(value: String): Self = StObject.set(x, "hashMethod", value.asInstanceOf[js.Any])
      
      inline def setHashMethodUndefined: Self = StObject.set(x, "hashMethod", js.undefined)
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeArchive(value: js.Array[String]): Self = StObject.set(x, "includeArchive", value.asInstanceOf[js.Any])
      
      inline def setIncludeArchiveUndefined: Self = StObject.set(x, "includeArchive", js.undefined)
      
      inline def setIncludeArchiveVarargs(value: String*): Self = StObject.set(x, "includeArchive", js.Array(value :_*))
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setLargePages(value: Boolean): Self = StObject.set(x, "largePages", value.asInstanceOf[js.Any])
      
      inline def setLargePagesUndefined: Self = StObject.set(x, "largePages", js.undefined)
      
      inline def setLatestTimeStamp(value: Boolean): Self = StObject.set(x, "latestTimeStamp", value.asInstanceOf[js.Any])
      
      inline def setLatestTimeStampUndefined: Self = StObject.set(x, "latestTimeStamp", js.undefined)
      
      inline def setListFileCharset(value: String): Self = StObject.set(x, "listFileCharset", value.asInstanceOf[js.Any])
      
      inline def setListFileCharsetUndefined: Self = StObject.set(x, "listFileCharset", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      inline def setMultiBlockSize(value: String): Self = StObject.set(x, "multiBlockSize", value.asInstanceOf[js.Any])
      
      inline def setMultiBlockSizeUndefined: Self = StObject.set(x, "multiBlockSize", js.undefined)
      
      inline def setNoArchiveOnFail(value: Boolean): Self = StObject.set(x, "noArchiveOnFail", value.asInstanceOf[js.Any])
      
      inline def setNoArchiveOnFailUndefined: Self = StObject.set(x, "noArchiveOnFail", js.undefined)
      
      inline def setNoRootDuplication(value: Boolean): Self = StObject.set(x, "noRootDuplication", value.asInstanceOf[js.Any])
      
      inline def setNoRootDuplicationUndefined: Self = StObject.set(x, "noRootDuplication", js.undefined)
      
      inline def setNoWildcards(value: Boolean): Self = StObject.set(x, "noWildcards", value.asInstanceOf[js.Any])
      
      inline def setNoWildcardsUndefined: Self = StObject.set(x, "noWildcards", js.undefined)
      
      inline def setNtSecurity(value: Boolean): Self = StObject.set(x, "ntSecurity", value.asInstanceOf[js.Any])
      
      inline def setNtSecurityUndefined: Self = StObject.set(x, "ntSecurity", js.undefined)
      
      inline def setOpenFiles(value: Boolean): Self = StObject.set(x, "openFiles", value.asInstanceOf[js.Any])
      
      inline def setOpenFilesUndefined: Self = StObject.set(x, "openFiles", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setOutputStreams(value: js.Array[String]): Self = StObject.set(x, "outputStreams", value.asInstanceOf[js.Any])
      
      inline def setOutputStreamsUndefined: Self = StObject.set(x, "outputStreams", js.undefined)
      
      inline def setOutputStreamsVarargs(value: String*): Self = StObject.set(x, "outputStreams", js.Array(value :_*))
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setSfx(value: String): Self = StObject.set(x, "sfx", value.asInstanceOf[js.Any])
      
      inline def setSfxUndefined: Self = StObject.set(x, "sfx", js.undefined)
      
      inline def setSortByType(value: Boolean): Self = StObject.set(x, "sortByType", value.asInstanceOf[js.Any])
      
      inline def setSortByTypeUndefined: Self = StObject.set(x, "sortByType", js.undefined)
      
      inline def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
      
      inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
      
      inline def setTechInfo(value: Boolean): Self = StObject.set(x, "techInfo", value.asInstanceOf[js.Any])
      
      inline def setTechInfoUndefined: Self = StObject.set(x, "techInfo", js.undefined)
      
      inline def setTimeStats(value: Boolean): Self = StObject.set(x, "timeStats", value.asInstanceOf[js.Any])
      
      inline def setTimeStatsUndefined: Self = StObject.set(x, "timeStats", js.undefined)
      
      inline def setToStdout(value: Boolean): Self = StObject.set(x, "toStdout", value.asInstanceOf[js.Any])
      
      inline def setToStdoutUndefined: Self = StObject.set(x, "toStdout", js.undefined)
      
      inline def setUpdateOptions(value: String): Self = StObject.set(x, "updateOptions", value.asInstanceOf[js.Any])
      
      inline def setUpdateOptionsUndefined: Self = StObject.set(x, "updateOptions", js.undefined)
      
      inline def setVolumes(value: js.Array[String]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
      
      inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
      
      inline def setVolumesVarargs(value: String*): Self = StObject.set(x, "volumes", js.Array(value :_*))
      
      inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
      
      inline def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
      
      inline def setYes(value: Boolean): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      inline def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var file: String
    
    var hash: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sizeCompressed: js.UndefOr[Double] = js.undefined
    
    var status: String
  }
  object Data {
    
    inline def apply(file: String, status: String): Data = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeCompressed(value: Double): Self = StObject.set(x, "sizeCompressed", value.asInstanceOf[js.Any])
      
      inline def setSizeCompressedUndefined: Self = StObject.set(x, "sizeCompressed", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node7zOptions extends StObject {
    
    /** Path to an other 7-Zip binary. Default: 7z */
    @JSName("$bin")
    var $bin: js.UndefOr[String] = js.undefined
    
    /** Some commands accepts more specific targets. See https://github.com/quentinrossetti/node-7z#extract for an example. */
    @JSName("$cherryPick")
    var $cherryPick: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Attach an external child process to be parsed */
    @JSName("$childProcess")
    var $childProcess: js.UndefOr[ChildProcess] = js.undefined
    
    /** Create the stream but do not spawn child process */
    @JSName("$defer")
    var $defer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Progress percentage gets fired. Shortcut for { outputStreams: ['b1'] }
      * Use if you want access to the progress event. Has an impact on performances.
      */
    @JSName("$progress")
    var $progress: js.UndefOr[Boolean] = js.undefined
    
    /** Pass raw arguments to the child_process.spawn() command */
    @JSName("$raw")
    var $raw: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Pass options to the child_process.spawn() command */
    @JSName("$spawnOptions")
    var $spawnOptions: js.UndefOr[js.Object] = js.undefined
  }
  object Node7zOptions {
    
    inline def apply(): Node7zOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Node7zOptions]
    }
    
    extension [Self <: Node7zOptions](x: Self) {
      
      inline def set$bin(value: String): Self = StObject.set(x, "$bin", value.asInstanceOf[js.Any])
      
      inline def set$binUndefined: Self = StObject.set(x, "$bin", js.undefined)
      
      inline def set$cherryPick(value: js.Array[String]): Self = StObject.set(x, "$cherryPick", value.asInstanceOf[js.Any])
      
      inline def set$cherryPickUndefined: Self = StObject.set(x, "$cherryPick", js.undefined)
      
      inline def set$cherryPickVarargs(value: String*): Self = StObject.set(x, "$cherryPick", js.Array(value :_*))
      
      inline def set$childProcess(value: ChildProcess): Self = StObject.set(x, "$childProcess", value.asInstanceOf[js.Any])
      
      inline def set$childProcessUndefined: Self = StObject.set(x, "$childProcess", js.undefined)
      
      inline def set$defer(value: Boolean): Self = StObject.set(x, "$defer", value.asInstanceOf[js.Any])
      
      inline def set$deferUndefined: Self = StObject.set(x, "$defer", js.undefined)
      
      inline def set$progress(value: Boolean): Self = StObject.set(x, "$progress", value.asInstanceOf[js.Any])
      
      inline def set$progressUndefined: Self = StObject.set(x, "$progress", js.undefined)
      
      inline def set$raw(value: js.Array[String]): Self = StObject.set(x, "$raw", value.asInstanceOf[js.Any])
      
      inline def set$rawUndefined: Self = StObject.set(x, "$raw", js.undefined)
      
      inline def set$rawVarargs(value: String*): Self = StObject.set(x, "$raw", js.Array(value :_*))
      
      inline def set$spawnOptions(value: js.Object): Self = StObject.set(x, "$spawnOptions", value.asInstanceOf[js.Any])
      
      inline def set$spawnOptionsUndefined: Self = StObject.set(x, "$spawnOptions", js.undefined)
    }
  }
  
  trait Progress extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var fileCount: Double
    
    var percent: Double
  }
  object Progress {
    
    inline def apply(fileCount: Double, percent: Double): Progress = {
      val __obj = js.Dynamic.literal(fileCount = fileCount.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  trait SevenZipOptions
    extends StObject
       with Node7zOptions
       with CommandLineSwitches
  object SevenZipOptions {
    
    inline def apply(): SevenZipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SevenZipOptions]
    }
  }
  
  // Based off Readable from Streams, node-7z uses Readable but Typescript couldn't extend for Data and Progress typings
  @js.native
  trait ZipStream
    extends Stream
       with ReadableStream {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    // tslint:disable:unified-signatures
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_data(event: data, data: Data): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): this.type = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_progress(event: progress, progress: Progress): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    // tslint:enable:unified-signatures
    /** Populated from 7zip's response, wait for 'end' event. */
    var info: Map[String, String] = js.native
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_progress(event: progress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_progress(event: progress, listener: js.Function1[/* progress */ Progress, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  }
}
