package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// NOTE - The names are not wrong, some are spelt wrong in the source
@js.native
trait CommandLineSwitches extends js.Object {
  
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
  implicit class CommandLineSwitchesOps[Self <: CommandLineSwitches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlternateStreamExtract(value: Boolean): Self = this.set("alternateStreamExtract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateStreamExtract: Self = this.set("alternateStreamExtract", js.undefined)
    
    @scala.inline
    def setAlternateStreamReplace(value: Boolean): Self = this.set("alternateStreamReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateStreamReplace: Self = this.set("alternateStreamReplace", js.undefined)
    
    @scala.inline
    def setAlternateStreamStore(value: Boolean): Self = this.set("alternateStreamStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateStreamStore: Self = this.set("alternateStreamStore", js.undefined)
    
    @scala.inline
    def setArchiveNameMode(value: String): Self = this.set("archiveNameMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveNameMode: Self = this.set("archiveNameMode", js.undefined)
    
    @scala.inline
    def setArchiveType(value: String): Self = this.set("archiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveType: Self = this.set("archiveType", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setCpuAffinity(value: String): Self = this.set("cpuAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuAffinity: Self = this.set("cpuAffinity", js.undefined)
    
    @scala.inline
    def setDeleteFilesAfter(value: Boolean): Self = this.set("deleteFilesAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteFilesAfter: Self = this.set("deleteFilesAfter", js.undefined)
    
    @scala.inline
    def setExcludeArchiveVarargs(value: String*): Self = this.set("excludeArchive", js.Array(value :_*))
    
    @scala.inline
    def setExcludeArchive(value: js.Array[String]): Self = this.set("excludeArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeArchive: Self = this.set("excludeArchive", js.undefined)
    
    @scala.inline
    def setExcludeArchiveType(value: String): Self = this.set("excludeArchiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeArchiveType: Self = this.set("excludeArchiveType", js.undefined)
    
    @scala.inline
    def setExludeVarargs(value: String*): Self = this.set("exlude", js.Array(value :_*))
    
    @scala.inline
    def setExlude(value: js.Array[String]): Self = this.set("exlude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExlude: Self = this.set("exlude", js.undefined)
    
    @scala.inline
    def setFromStdin(value: String): Self = this.set("fromStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromStdin: Self = this.set("fromStdin", js.undefined)
    
    @scala.inline
    def setFullyQualifiedPaths(value: Boolean): Self = this.set("fullyQualifiedPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyQualifiedPaths: Self = this.set("fullyQualifiedPaths", js.undefined)
    
    @scala.inline
    def setHardlinks(value: Boolean): Self = this.set("hardlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardlinks: Self = this.set("hardlinks", js.undefined)
    
    @scala.inline
    def setHashMethod(value: String): Self = this.set("hashMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashMethod: Self = this.set("hashMethod", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setIncludeArchiveVarargs(value: String*): Self = this.set("includeArchive", js.Array(value :_*))
    
    @scala.inline
    def setIncludeArchive(value: js.Array[String]): Self = this.set("includeArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeArchive: Self = this.set("includeArchive", js.undefined)
    
    @scala.inline
    def setLargePages(value: Boolean): Self = this.set("largePages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargePages: Self = this.set("largePages", js.undefined)
    
    @scala.inline
    def setLatestTimeStamp(value: Boolean): Self = this.set("latestTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestTimeStamp: Self = this.set("latestTimeStamp", js.undefined)
    
    @scala.inline
    def setListFileCharset(value: String): Self = this.set("listFileCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListFileCharset: Self = this.set("listFileCharset", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: String*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: js.Array[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMultiBlockSize(value: String): Self = this.set("multiBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiBlockSize: Self = this.set("multiBlockSize", js.undefined)
    
    @scala.inline
    def setNoArchiveOnFail(value: Boolean): Self = this.set("noArchiveOnFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoArchiveOnFail: Self = this.set("noArchiveOnFail", js.undefined)
    
    @scala.inline
    def setNoRootDuplication(value: Boolean): Self = this.set("noRootDuplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRootDuplication: Self = this.set("noRootDuplication", js.undefined)
    
    @scala.inline
    def setNoWildcards(value: Boolean): Self = this.set("noWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWildcards: Self = this.set("noWildcards", js.undefined)
    
    @scala.inline
    def setNtSecurity(value: Boolean): Self = this.set("ntSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNtSecurity: Self = this.set("ntSecurity", js.undefined)
    
    @scala.inline
    def setOpenFiles(value: Boolean): Self = this.set("openFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenFiles: Self = this.set("openFiles", js.undefined)
    
    @scala.inline
    def setOutputDir(value: String): Self = this.set("outputDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDir: Self = this.set("outputDir", js.undefined)
    
    @scala.inline
    def setOutputStreamsVarargs(value: String*): Self = this.set("outputStreams", js.Array(value :_*))
    
    @scala.inline
    def setOutputStreams(value: js.Array[String]): Self = this.set("outputStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputStreams: Self = this.set("outputStreams", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setSfx(value: String): Self = this.set("sfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSfx: Self = this.set("sfx", js.undefined)
    
    @scala.inline
    def setSortByType(value: Boolean): Self = this.set("sortByType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortByType: Self = this.set("sortByType", js.undefined)
    
    @scala.inline
    def setSymlinks(value: Boolean): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
    
    @scala.inline
    def setTechInfo(value: Boolean): Self = this.set("techInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechInfo: Self = this.set("techInfo", js.undefined)
    
    @scala.inline
    def setTimeStats(value: Boolean): Self = this.set("timeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStats: Self = this.set("timeStats", js.undefined)
    
    @scala.inline
    def setToStdout(value: Boolean): Self = this.set("toStdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToStdout: Self = this.set("toStdout", js.undefined)
    
    @scala.inline
    def setUpdateOptions(value: String): Self = this.set("updateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOptions: Self = this.set("updateOptions", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: String*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[String]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
    
    @scala.inline
    def setWorkingDir(value: String): Self = this.set("workingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDir: Self = this.set("workingDir", js.undefined)
    
    @scala.inline
    def setYes(value: Boolean): Self = this.set("yes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYes: Self = this.set("yes", js.undefined)
  }
}
