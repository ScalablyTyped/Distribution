package typings.parcelWatcher

import typings.parcelWatcher.mod.ParcelWatcherBackend
import typings.parcelWatcher.mod.ParcelWatcherEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parcelWatcherStrings {
  
  @js.native
  sealed trait `brute-force`
    extends StObject
       with ParcelWatcherBackend
  inline def `brute-force`: `brute-force` = "brute-force".asInstanceOf[`brute-force`]
  
  @js.native
  sealed trait create
    extends StObject
       with ParcelWatcherEventType
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait delete
    extends StObject
       with ParcelWatcherEventType
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait `fs-events`
    extends StObject
       with ParcelWatcherBackend
  inline def `fs-events`: `fs-events` = "fs-events".asInstanceOf[`fs-events`]
  
  @js.native
  sealed trait inotify
    extends StObject
       with ParcelWatcherBackend
  inline def inotify: inotify = "inotify".asInstanceOf[inotify]
  
  @js.native
  sealed trait update
    extends StObject
       with ParcelWatcherEventType
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait watchman
    extends StObject
       with ParcelWatcherBackend
  inline def watchman: watchman = "watchman".asInstanceOf[watchman]
  
  @js.native
  sealed trait windows
    extends StObject
       with ParcelWatcherBackend
  inline def windows: windows = "windows".asInstanceOf[windows]
}
