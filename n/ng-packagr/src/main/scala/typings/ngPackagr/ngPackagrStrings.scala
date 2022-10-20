package typings.ngPackagr

import typings.ngPackagr.libFileSystemFileWatcherMod.AllFileWatchEvents
import typings.ngPackagr.libFileSystemFileWatcherMod.FileWatchEvent
import typings.ngPackagr.libGraphNodeMod.NodeState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngPackagrStrings {
  
  @js.native
  sealed trait AbsoluteFsPath extends StObject
  inline def AbsoluteFsPath: AbsoluteFsPath = "AbsoluteFsPath".asInstanceOf[AbsoluteFsPath]
  
  @js.native
  sealed trait DIR extends StObject
  inline def DIR: DIR = "DIR".asInstanceOf[DIR]
  
  @js.native
  sealed trait FILE extends StObject
  inline def FILE: FILE = "FILE".asInstanceOf[FILE]
  
  @js.native
  sealed trait PathSegment extends StObject
  inline def PathSegment: PathSegment = "PathSegment".asInstanceOf[PathSegment]
  
  @js.native
  sealed trait _empty
    extends StObject
       with NodeState
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait add
    extends StObject
       with AllFileWatchEvents
       with FileWatchEvent
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait addDir
    extends StObject
       with AllFileWatchEvents
  inline def addDir: addDir = "addDir".asInstanceOf[addDir]
  
  @js.native
  sealed trait analysis extends StObject
  inline def analysis: analysis = "analysis".asInstanceOf[analysis]
  
  @js.native
  sealed trait angular extends StObject
  inline def angular: angular = "angular".asInstanceOf[angular]
  
  @js.native
  sealed trait change
    extends StObject
       with AllFileWatchEvents
       with FileWatchEvent
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait css extends StObject
  inline def css: css = "css".asInstanceOf[css]
  
  @js.native
  sealed trait decorators extends StObject
  inline def decorators: decorators = "decorators".asInstanceOf[decorators]
  
  @js.native
  sealed trait dirty
    extends StObject
       with NodeState
  inline def dirty: dirty = "dirty".asInstanceOf[dirty]
  
  @js.native
  sealed trait done
    extends StObject
       with NodeState
  inline def done: done = "done".asInstanceOf[done]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait full extends StObject
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait `in-progress`
    extends StObject
       with NodeState
  inline def `in-progress`: `in-progress` = "in-progress".asInstanceOf[`in-progress`]
  
  @js.native
  sealed trait `inline` extends StObject
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait less extends StObject
  inline def less: less = "less".asInstanceOf[less]
  
  @js.native
  sealed trait ngtsc extends StObject
  inline def ngtsc: ngtsc = "ngtsc".asInstanceOf[ngtsc]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait partial extends StObject
  inline def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait pending
    extends StObject
       with NodeState
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait sass extends StObject
  inline def sass: sass = "sass".asInstanceOf[sass]
  
  @js.native
  sealed trait scss extends StObject
  inline def scss: scss = "scss".asInstanceOf[scss]
  
  @js.native
  sealed trait `static fields` extends StObject
  inline def `static fields`: `static fields` = ("static fields").asInstanceOf[`static fields`]
  
  @js.native
  sealed trait unlink
    extends StObject
       with AllFileWatchEvents
       with FileWatchEvent
  inline def unlink: unlink = "unlink".asInstanceOf[unlink]
  
  @js.native
  sealed trait unlinkDir
    extends StObject
       with AllFileWatchEvents
  inline def unlinkDir: unlinkDir = "unlinkDir".asInstanceOf[unlinkDir]
  
  @js.native
  sealed trait warning extends StObject
  inline def warning: warning = "warning".asInstanceOf[warning]
}
