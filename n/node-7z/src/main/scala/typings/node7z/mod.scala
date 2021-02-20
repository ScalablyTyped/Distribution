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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Add files to an archive
    * @param archive Archive to create
    * @param source Source files to add to the archive
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "add")
  @js.native
  def add(archive: String, source: String): ZipStream = js.native
  @JSImport("node-7z", "add")
  @js.native
  def add(archive: String, source: String, options: SevenZipOptions): ZipStream = js.native
  @JSImport("node-7z", "add")
  @js.native
  def add(archive: String, source: js.Array[String]): ZipStream = js.native
  @JSImport("node-7z", "add")
  @js.native
  def add(archive: String, source: js.Array[String], options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Delete files from an archive
    * @param archive Archive to target
    * @param output Target files to remove from the archive
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "delete")
  @js.native
  def delete(archive: String, target: String): ZipStream = js.native
  @JSImport("node-7z", "delete")
  @js.native
  def delete(archive: String, target: String, options: SevenZipOptions): ZipStream = js.native
  @JSImport("node-7z", "delete")
  @js.native
  def delete(archive: String, target: js.Array[String]): ZipStream = js.native
  @JSImport("node-7z", "delete")
  @js.native
  def delete(archive: String, target: js.Array[String], options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Extracts files from an archive to the current directory or to the output directory. This command copies all extracted files to one directory.
    * @param archive Archive to extract files from
    * @param output Output directory
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "extract")
  @js.native
  def extract(archive: String, output: String): ZipStream = js.native
  @JSImport("node-7z", "extract")
  @js.native
  def extract(archive: String, output: String, options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Extracts files from an archive to the current directory or to the output directory.
    * @param archive Archive to extract files from
    * @param output Output directory
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "extractFull")
  @js.native
  def extractFull(archive: String, output: String): ZipStream = js.native
  @JSImport("node-7z", "extractFull")
  @js.native
  def extractFull(archive: String, output: String, options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Calculate hash values for files
    * @param target Target files to calculate the hash of
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "hash")
  @js.native
  def hash(target: String): ZipStream = js.native
  @JSImport("node-7z", "hash")
  @js.native
  def hash(target: String, options: SevenZipOptions): ZipStream = js.native
  @JSImport("node-7z", "hash")
  @js.native
  def hash(target: js.Array[String]): ZipStream = js.native
  @JSImport("node-7z", "hash")
  @js.native
  def hash(target: js.Array[String], options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Lists contents of archive
    * @param archive Archive to list the contents from
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "list")
  @js.native
  def list(archive: String): ZipStream = js.native
  @JSImport("node-7z", "list")
  @js.native
  def list(archive: String, options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Registers the child process given by the $childProcess option.
    * Must be deferred with the $defer option during creation.
    * @param stream ZipStream to register listeners on
    */
  @JSImport("node-7z", "listen")
  @js.native
  def listen(stream: ZipStream): ZipStream = js.native
  
  /**
    * Rename files in an archive
    * @param archive Archive to target
    * @param target Pairs of target names and new names to rename to
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "rename")
  @js.native
  def rename(archive: String, target: js.Array[js.Array[String]]): ZipStream = js.native
  @JSImport("node-7z", "rename")
  @js.native
  def rename(archive: String, target: js.Array[js.Array[String]], options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Tests archive files
    * @param archive Archive to test
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "test")
  @js.native
  def test(archive: String, options: SevenZipOptions): ZipStream = js.native
  
  /**
    * Update older files in the archive and add files that are not already in the archiv
    * @param archive Archive to update
    * @param source Source files to update from the file-system to the archive
    * @param options Seven Zip Options
    */
  @JSImport("node-7z", "update")
  @js.native
  def update(archive: String, files: String): ZipStream = js.native
  @JSImport("node-7z", "update")
  @js.native
  def update(archive: String, files: String, options: SevenZipOptions): ZipStream = js.native
  @JSImport("node-7z", "update")
  @js.native
  def update(archive: String, files: js.Array[String]): ZipStream = js.native
  @JSImport("node-7z", "update")
  @js.native
  def update(archive: String, files: js.Array[String], options: SevenZipOptions): ZipStream = js.native
  
  // NOTE - The names are not wrong, some are spelt wrong in the source
  @js.native
  trait CommandLineSwitches extends StObject {
    
    /** Extract file as alternate stream, if there is ':' character in name (-snc) */
    var alternateStreamExtract: js.UndefOr[Boolean] = js.native
    
    /** Replace ':' character to '_' character in paths of alternate streams (-snr) */
    var alternateStreamReplace: js.UndefOr[Boolean] = js.native
    
    /** Store NTFS alternate Streams (-sns) */
    var alternateStreamStore: js.UndefOr[Boolean] = js.native
    
    /** Set Archive name mode (-sa) */
    var archiveNameMode: js.UndefOr[String] = js.native
    
    /** Type of archive (-t) */
    var archiveType: js.UndefOr[String] = js.native
    
    /** Set Sensitive Case mode (-ssc) */
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    /** Set CPU thread affinity mask (hexadecimal number). (-stm) */
    var cpuAffinity: js.UndefOr[String] = js.native
    
    /** Delete files after compression (-sdel) */
    var deleteFilesAfter: js.UndefOr[Boolean] = js.native
    
    /** Exclude archive filenames (-ax) */
    var excludeArchive: js.UndefOr[js.Array[String]] = js.native
    
    /** Exclude archive type (-stx) */
    var excludeArchiveType: js.UndefOr[String] = js.native
    
    /** Exclude filenames (-x) */
    var exlude: js.UndefOr[js.Array[String]] = js.native
    
    /** Read data from StdIn (-si) */
    var fromStdin: js.UndefOr[String] = js.native
    
    /** Usefully qualified file paths (-spf) */
    var fullyQualifiedPaths: js.UndefOr[Boolean] = js.native
    
    /** Store hard links as links (WIM and TAR formats only) (-snh) */
    var hardlinks: js.UndefOr[Boolean] = js.native
    
    /** Set hash function (-scrc) */
    var hashMethod: js.UndefOr[String] = js.native
    
    /** Include filenames (-i) */
    var include: js.UndefOr[js.Array[String]] = js.native
    
    /** Include archive filenames (-ai) */
    var includeArchive: js.UndefOr[js.Array[String]] = js.native
    
    /** Set Large Pages mode (-spl) */
    var largePages: js.UndefOr[Boolean] = js.native
    
    /** Set archive timestamp from the most recently modified file (-stl) */
    var latestTimeStamp: js.UndefOr[Boolean] = js.native
    
    /** Set charset for list files (-scs) */
    var listFileCharset: js.UndefOr[String] = js.native
    
    /** Set output log level (-bb) */
    var logLevel: js.UndefOr[String] = js.native
    
    /** Set Compression Method (-m) */
    var method: js.UndefOr[js.Array[String]] = js.native
    
    /** Creates multi-block xz archives by default. Block size can be specified with [Size]{m|g} */
    var multiBlockSize: js.UndefOr[String] = js.native
    
    /** Stop archive creating, if 7-Zip can't open some input file.(-sse) */
    var noArchiveOnFail: js.UndefOr[Boolean] = js.native
    
    /** Eliminate duplication of root folder for extract command (-spe) */
    var noRootDuplication: js.UndefOr[Boolean] = js.native
    
    /** Disable wildcard matching for file names (-spd) */
    var noWildcards: js.UndefOr[Boolean] = js.native
    
    /** Store NT security (-sni) */
    var ntSecurity: js.UndefOr[Boolean] = js.native
    
    /** Compress files open for writing (-ssw) */
    var openFiles: js.UndefOr[Boolean] = js.native
    
    /** Set Output directory (-o) */
    var outputDir: js.UndefOr[String] = js.native
    
    /** Set output stream for output/error/progress (-bs) */
    var outputStreams: js.UndefOr[js.Array[String]] = js.native
    
    /** Set Password (-p) */
    var password: js.UndefOr[String] = js.native
    
    /** Recurse subdirectories. For -r0 usage use $raw (-r) */
    var recursive: js.UndefOr[Boolean] = js.native
    
    /** Create SFX archive (-sfx) */
    var sfx: js.UndefOr[String] = js.native
    
    /** Sort files by type while adding to solid 7z archive (-mqs) */
    var sortByType: js.UndefOr[Boolean] = js.native
    
    /** Store symbolic links as links (WIM and TAR formats only) (-snl) */
    var symlinks: js.UndefOr[Boolean] = js.native
    
    /** Show technical information (-slt) */
    var techInfo: js.UndefOr[Boolean] = js.native
    
    /** Show execution time statistics (-bt) */
    var timeStats: js.UndefOr[Boolean] = js.native
    
    /** Write data to stdout (-so) */
    var toStdout: js.UndefOr[Boolean] = js.native
    
    /** Update options (-u) */
    var updateOptions: js.UndefOr[String] = js.native
    
    /** Create Volumes (v) */
    var volumes: js.UndefOr[js.Array[String]] = js.native
    
    /** Set Working directory (-w) */
    var workingDir: js.UndefOr[String] = js.native
    
    /** Assume Yes on all queries (-y) */
    var yes: js.UndefOr[Boolean] = js.native
  }
  object CommandLineSwitches {
    
    @scala.inline
    def apply(): CommandLineSwitches = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandLineSwitches]
    }
    
    @scala.inline
    implicit class CommandLineSwitchesMutableBuilder[Self <: CommandLineSwitches] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternateStreamExtract(value: Boolean): Self = StObject.set(x, "alternateStreamExtract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateStreamExtractUndefined: Self = StObject.set(x, "alternateStreamExtract", js.undefined)
      
      @scala.inline
      def setAlternateStreamReplace(value: Boolean): Self = StObject.set(x, "alternateStreamReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateStreamReplaceUndefined: Self = StObject.set(x, "alternateStreamReplace", js.undefined)
      
      @scala.inline
      def setAlternateStreamStore(value: Boolean): Self = StObject.set(x, "alternateStreamStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateStreamStoreUndefined: Self = StObject.set(x, "alternateStreamStore", js.undefined)
      
      @scala.inline
      def setArchiveNameMode(value: String): Self = StObject.set(x, "archiveNameMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveNameModeUndefined: Self = StObject.set(x, "archiveNameMode", js.undefined)
      
      @scala.inline
      def setArchiveType(value: String): Self = StObject.set(x, "archiveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveTypeUndefined: Self = StObject.set(x, "archiveType", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setCpuAffinity(value: String): Self = StObject.set(x, "cpuAffinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuAffinityUndefined: Self = StObject.set(x, "cpuAffinity", js.undefined)
      
      @scala.inline
      def setDeleteFilesAfter(value: Boolean): Self = StObject.set(x, "deleteFilesAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteFilesAfterUndefined: Self = StObject.set(x, "deleteFilesAfter", js.undefined)
      
      @scala.inline
      def setExcludeArchive(value: js.Array[String]): Self = StObject.set(x, "excludeArchive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeArchiveType(value: String): Self = StObject.set(x, "excludeArchiveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeArchiveTypeUndefined: Self = StObject.set(x, "excludeArchiveType", js.undefined)
      
      @scala.inline
      def setExcludeArchiveUndefined: Self = StObject.set(x, "excludeArchive", js.undefined)
      
      @scala.inline
      def setExcludeArchiveVarargs(value: String*): Self = StObject.set(x, "excludeArchive", js.Array(value :_*))
      
      @scala.inline
      def setExlude(value: js.Array[String]): Self = StObject.set(x, "exlude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExludeUndefined: Self = StObject.set(x, "exlude", js.undefined)
      
      @scala.inline
      def setExludeVarargs(value: String*): Self = StObject.set(x, "exlude", js.Array(value :_*))
      
      @scala.inline
      def setFromStdin(value: String): Self = StObject.set(x, "fromStdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromStdinUndefined: Self = StObject.set(x, "fromStdin", js.undefined)
      
      @scala.inline
      def setFullyQualifiedPaths(value: Boolean): Self = StObject.set(x, "fullyQualifiedPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullyQualifiedPathsUndefined: Self = StObject.set(x, "fullyQualifiedPaths", js.undefined)
      
      @scala.inline
      def setHardlinks(value: Boolean): Self = StObject.set(x, "hardlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardlinksUndefined: Self = StObject.set(x, "hardlinks", js.undefined)
      
      @scala.inline
      def setHashMethod(value: String): Self = StObject.set(x, "hashMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashMethodUndefined: Self = StObject.set(x, "hashMethod", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeArchive(value: js.Array[String]): Self = StObject.set(x, "includeArchive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeArchiveUndefined: Self = StObject.set(x, "includeArchive", js.undefined)
      
      @scala.inline
      def setIncludeArchiveVarargs(value: String*): Self = StObject.set(x, "includeArchive", js.Array(value :_*))
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setLargePages(value: Boolean): Self = StObject.set(x, "largePages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargePagesUndefined: Self = StObject.set(x, "largePages", js.undefined)
      
      @scala.inline
      def setLatestTimeStamp(value: Boolean): Self = StObject.set(x, "latestTimeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestTimeStampUndefined: Self = StObject.set(x, "latestTimeStamp", js.undefined)
      
      @scala.inline
      def setListFileCharset(value: String): Self = StObject.set(x, "listFileCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListFileCharsetUndefined: Self = StObject.set(x, "listFileCharset", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      @scala.inline
      def setMultiBlockSize(value: String): Self = StObject.set(x, "multiBlockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiBlockSizeUndefined: Self = StObject.set(x, "multiBlockSize", js.undefined)
      
      @scala.inline
      def setNoArchiveOnFail(value: Boolean): Self = StObject.set(x, "noArchiveOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoArchiveOnFailUndefined: Self = StObject.set(x, "noArchiveOnFail", js.undefined)
      
      @scala.inline
      def setNoRootDuplication(value: Boolean): Self = StObject.set(x, "noRootDuplication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRootDuplicationUndefined: Self = StObject.set(x, "noRootDuplication", js.undefined)
      
      @scala.inline
      def setNoWildcards(value: Boolean): Self = StObject.set(x, "noWildcards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWildcardsUndefined: Self = StObject.set(x, "noWildcards", js.undefined)
      
      @scala.inline
      def setNtSecurity(value: Boolean): Self = StObject.set(x, "ntSecurity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNtSecurityUndefined: Self = StObject.set(x, "ntSecurity", js.undefined)
      
      @scala.inline
      def setOpenFiles(value: Boolean): Self = StObject.set(x, "openFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenFilesUndefined: Self = StObject.set(x, "openFiles", js.undefined)
      
      @scala.inline
      def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      @scala.inline
      def setOutputStreams(value: js.Array[String]): Self = StObject.set(x, "outputStreams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputStreamsUndefined: Self = StObject.set(x, "outputStreams", js.undefined)
      
      @scala.inline
      def setOutputStreamsVarargs(value: String*): Self = StObject.set(x, "outputStreams", js.Array(value :_*))
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      @scala.inline
      def setSfx(value: String): Self = StObject.set(x, "sfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSfxUndefined: Self = StObject.set(x, "sfx", js.undefined)
      
      @scala.inline
      def setSortByType(value: Boolean): Self = StObject.set(x, "sortByType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortByTypeUndefined: Self = StObject.set(x, "sortByType", js.undefined)
      
      @scala.inline
      def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
      
      @scala.inline
      def setTechInfo(value: Boolean): Self = StObject.set(x, "techInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTechInfoUndefined: Self = StObject.set(x, "techInfo", js.undefined)
      
      @scala.inline
      def setTimeStats(value: Boolean): Self = StObject.set(x, "timeStats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStatsUndefined: Self = StObject.set(x, "timeStats", js.undefined)
      
      @scala.inline
      def setToStdout(value: Boolean): Self = StObject.set(x, "toStdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToStdoutUndefined: Self = StObject.set(x, "toStdout", js.undefined)
      
      @scala.inline
      def setUpdateOptions(value: String): Self = StObject.set(x, "updateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOptionsUndefined: Self = StObject.set(x, "updateOptions", js.undefined)
      
      @scala.inline
      def setVolumes(value: js.Array[String]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
      
      @scala.inline
      def setVolumesVarargs(value: String*): Self = StObject.set(x, "volumes", js.Array(value :_*))
      
      @scala.inline
      def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
      
      @scala.inline
      def setYes(value: Boolean): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var attributes: js.UndefOr[String] = js.native
    
    var file: String = js.native
    
    var hash: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var sizeCompressed: js.UndefOr[Double] = js.native
    
    var status: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(file: String, status: String): Data = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeCompressed(value: Double): Self = StObject.set(x, "sizeCompressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeCompressedUndefined: Self = StObject.set(x, "sizeCompressed", js.undefined)
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node7zOptions extends StObject {
    
    /** Path to an other 7-Zip binary. Default: 7z */
    @JSName("$bin")
    var $bin: js.UndefOr[String] = js.native
    
    /** Some commands accepts more specific targets. See https://github.com/quentinrossetti/node-7z#extract for an example. */
    @JSName("$cherryPick")
    var $cherryPick: js.UndefOr[js.Array[String]] = js.native
    
    /** Attach an external child process to be parsed */
    @JSName("$childProcess")
    var $childProcess: js.UndefOr[ChildProcess] = js.native
    
    /** Create the stream but do not spawn child process */
    @JSName("$defer")
    var $defer: js.UndefOr[Boolean] = js.native
    
    /**
      * Progress percentage gets fired. Shortcut for { outputStreams: ['b1'] }
      * Use if you want access to the progress event. Has an impact on performances.
      */
    @JSName("$progress")
    var $progress: js.UndefOr[Boolean] = js.native
    
    /** Pass raw arguments to the child_process.spawn() command */
    @JSName("$raw")
    var $raw: js.UndefOr[js.Array[String]] = js.native
    
    /** Pass options to the child_process.spawn() command */
    @JSName("$spawnOptions")
    var $spawnOptions: js.UndefOr[js.Object] = js.native
  }
  object Node7zOptions {
    
    @scala.inline
    def apply(): Node7zOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Node7zOptions]
    }
    
    @scala.inline
    implicit class Node7zOptionsMutableBuilder[Self <: Node7zOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$bin(value: String): Self = StObject.set(x, "$bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$binUndefined: Self = StObject.set(x, "$bin", js.undefined)
      
      @scala.inline
      def set$cherryPick(value: js.Array[String]): Self = StObject.set(x, "$cherryPick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$cherryPickUndefined: Self = StObject.set(x, "$cherryPick", js.undefined)
      
      @scala.inline
      def set$cherryPickVarargs(value: String*): Self = StObject.set(x, "$cherryPick", js.Array(value :_*))
      
      @scala.inline
      def set$childProcess(value: ChildProcess): Self = StObject.set(x, "$childProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$childProcessUndefined: Self = StObject.set(x, "$childProcess", js.undefined)
      
      @scala.inline
      def set$defer(value: Boolean): Self = StObject.set(x, "$defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$deferUndefined: Self = StObject.set(x, "$defer", js.undefined)
      
      @scala.inline
      def set$progress(value: Boolean): Self = StObject.set(x, "$progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$progressUndefined: Self = StObject.set(x, "$progress", js.undefined)
      
      @scala.inline
      def set$raw(value: js.Array[String]): Self = StObject.set(x, "$raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$rawUndefined: Self = StObject.set(x, "$raw", js.undefined)
      
      @scala.inline
      def set$rawVarargs(value: String*): Self = StObject.set(x, "$raw", js.Array(value :_*))
      
      @scala.inline
      def set$spawnOptions(value: js.Object): Self = StObject.set(x, "$spawnOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$spawnOptionsUndefined: Self = StObject.set(x, "$spawnOptions", js.undefined)
    }
  }
  
  @js.native
  trait Progress extends StObject {
    
    var file: js.UndefOr[String] = js.native
    
    var fileCount: Double = js.native
    
    var percent: Double = js.native
  }
  object Progress {
    
    @scala.inline
    def apply(fileCount: Double, percent: Double): Progress = {
      val __obj = js.Dynamic.literal(fileCount = fileCount.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  type SevenZipOptions = Node7zOptions with CommandLineSwitches
  
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
