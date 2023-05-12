package typings.metroFileMap

import typings.metroFileMap.metroFileMapStrings.`watch-project`
import typings.metroFileMap.metroFileMapStrings.error
import typings.metroFileMap.metroFileMapStrings.query
import typings.metroFileMap.metroFileMapStrings.success
import typings.metroFileMap.metroFileMapStrings.timeout
import typings.metroFileMap.metroFileMapStrings.watchman_slow_command
import typings.metroFileMap.metroFileMapStrings.watchman_slow_command_complete
import typings.metroFileMap.metroFileMapStrings.watchman_warning
import typings.metroFileMap.srcFlowTypesMod.ChangeEventMetadata
import typings.metroFileMap.srcFlowTypesMod.FileData
import typings.metroFileMap.srcFlowTypesMod.FileMetaData
import typings.metroFileMap.srcFlowTypesMod.Path
import typings.metroFileMap.srcFlowTypesMod.WatcherStatus
import typings.metroFileMap.srcFlowTypesMod.WatchmanClockSpec
import typings.metroFileMap.srcWatcherMod.HealthCheckResult
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Command
    extends StObject
       with WatcherStatus {
    
    var command: `watch-project` | query
    
    var timeElapsed: Double
    
    var `type`: watchman_slow_command
  }
  object Command {
    
    inline def apply(command: `watch-project` | query, timeElapsed: Double): Command = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], timeElapsed = timeElapsed.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("watchman_slow_command")
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: `watch-project` | query): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setTimeElapsed(value: Double): Self = StObject.set(x, "timeElapsed", value.asInstanceOf[js.Any])
      
      inline def setType(value: watchman_slow_command): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error
    extends StObject
       with HealthCheckResult {
    
    var error: js.Error
    
    var timeout: Double
    
    var `type`: error
    
    var watcher: String | Null
  }
  object Error {
    
    inline def apply(error: js.Error, timeout: Double): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], watcher = null)
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWatcher(value: String): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
      
      inline def setWatcherNull: Self = StObject.set(x, "watcher", null)
    }
  }
  
  trait FilePath extends StObject {
    
    var filePath: Path
    
    var metadata: js.UndefOr[ChangeEventMetadata | Null] = js.undefined
    
    var `type`: String
  }
  object FilePath {
    
    inline def apply(filePath: Path, `type`: String): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ChangeEventMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PauseReason
    extends StObject
       with HealthCheckResult {
    
    var pauseReason: String | Null
    
    var timeout: Double
    
    var `type`: timeout
    
    var watcher: String | Null
  }
  object PauseReason {
    
    inline def apply(timeout: Double): PauseReason = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], pauseReason = null, watcher = null)
      __obj.updateDynamic("type")("timeout")
      __obj.asInstanceOf[PauseReason]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PauseReason] (val x: Self) extends AnyVal {
      
      inline def setPauseReason(value: String): Self = StObject.set(x, "pauseReason", value.asInstanceOf[js.Any])
      
      inline def setPauseReasonNull: Self = StObject.set(x, "pauseReason", null)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setType(value: timeout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWatcher(value: String): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
      
      inline def setWatcherNull: Self = StObject.set(x, "watcher", null)
    }
  }
  
  /* Inlined std.Readonly<{  changed :metro-file-map.metro-file-map/src/flow-types.FileData,   removed :metro-file-map.metro-file-map/src/flow-types.FileData}> */
  trait ReadonlychangedFileDatare extends StObject {
    
    val changed: FileData
    
    val removed: FileData
  }
  object ReadonlychangedFileDatare {
    
    inline def apply(changed: FileData, removed: FileData): ReadonlychangedFileDatare = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlychangedFileDatare]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlychangedFileDatare] (val x: Self) extends AnyVal {
      
      inline def setChanged(value: FileData): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: FileData): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  clocks :std.ReadonlyMap<metro-file-map.metro-file-map/src/flow-types.Path, metro-file-map.metro-file-map/src/flow-types.WatchmanClockSpec>,   files :std.ReadonlyMap<metro-file-map.metro-file-map/src/flow-types.Path, metro-file-map.metro-file-map/src/flow-types.FileMetaData>}> */
  trait ReadonlyclocksReadonlyMap extends StObject {
    
    val clocks: ReadonlyMap[Path, WatchmanClockSpec]
    
    val files: ReadonlyMap[Path, FileMetaData]
  }
  object ReadonlyclocksReadonlyMap {
    
    inline def apply(clocks: ReadonlyMap[Path, WatchmanClockSpec], files: ReadonlyMap[Path, FileMetaData]): ReadonlyclocksReadonlyMap = {
      val __obj = js.Dynamic.literal(clocks = clocks.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyclocksReadonlyMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyclocksReadonlyMap] (val x: Self) extends AnyVal {
      
      inline def setClocks(value: ReadonlyMap[Path, WatchmanClockSpec]): Self = StObject.set(x, "clocks", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: ReadonlyMap[Path, FileMetaData]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  mergebase-with :string}> */
  trait Readonlymergebasewithstri extends StObject {
    
    val `mergebase-with`: String
  }
  object Readonlymergebasewithstri {
    
    inline def apply(`mergebase-with`: String): Readonlymergebasewithstri = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("mergebase-with")(`mergebase-with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readonlymergebasewithstri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Readonlymergebasewithstri] (val x: Self) extends AnyVal {
      
      inline def `setMergebase-with`(value: String): Self = StObject.set(x, "mergebase-with", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  recursive :boolean,   filter :std.RegExp}> */
  trait Readonlyrecursivebooleanf extends StObject {
    
    val filter: js.RegExp
    
    val recursive: Boolean
  }
  object Readonlyrecursivebooleanf {
    
    inline def apply(filter: js.RegExp, recursive: Boolean): Readonlyrecursivebooleanf = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readonlyrecursivebooleanf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Readonlyrecursivebooleanf] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  scm :std.Readonly<{  mergebase-with :string}>}> */
  trait ReadonlyscmReadonlymergeb extends StObject {
    
    val scm: Readonlymergebasewithstri
  }
  object ReadonlyscmReadonlymergeb {
    
    inline def apply(scm: Readonlymergebasewithstri): ReadonlyscmReadonlymergeb = {
      val __obj = js.Dynamic.literal(scm = scm.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyscmReadonlymergeb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyscmReadonlymergeb] (val x: Self) extends AnyVal {
      
      inline def setScm(value: Readonlymergebasewithstri): Self = StObject.set(x, "scm", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeElapsed
    extends StObject
       with HealthCheckResult {
    
    var timeElapsed: Double
    
    var timeout: Double
    
    var `type`: success
    
    var watcher: String | Null
  }
  object TimeElapsed {
    
    inline def apply(timeElapsed: Double, timeout: Double): TimeElapsed = {
      val __obj = js.Dynamic.literal(timeElapsed = timeElapsed.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], watcher = null)
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[TimeElapsed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeElapsed] (val x: Self) extends AnyVal {
      
      inline def setTimeElapsed(value: Double): Self = StObject.set(x, "timeElapsed", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWatcher(value: String): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
      
      inline def setWatcherNull: Self = StObject.set(x, "watcher", null)
    }
  }
  
  trait Type
    extends StObject
       with WatcherStatus {
    
    var command: `watch-project` | query
    
    var timeElapsed: Double
    
    var `type`: watchman_slow_command_complete
  }
  object Type {
    
    inline def apply(command: `watch-project` | query, timeElapsed: Double): Type = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], timeElapsed = timeElapsed.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("watchman_slow_command_complete")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: `watch-project` | query): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setTimeElapsed(value: Double): Self = StObject.set(x, "timeElapsed", value.asInstanceOf[js.Any])
      
      inline def setType(value: watchman_slow_command_complete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Warning
    extends StObject
       with WatcherStatus {
    
    var command: `watch-project` | query
    
    var `type`: watchman_warning
    
    var warning: Any
  }
  object Warning {
    
    inline def apply(command: `watch-project` | query, warning: Any): Warning = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("watchman_warning")
      __obj.asInstanceOf[Warning]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: `watch-project` | query): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setType(value: watchman_warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
