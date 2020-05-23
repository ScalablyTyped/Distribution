package typings.parcelWatcher

import typings.parcelWatcher.mod.ParcelWatcherBackend
import typings.parcelWatcher.mod.ParcelWatcherEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object parcelWatcherStrings {
  @js.native
  sealed trait `brute-force` extends ParcelWatcherBackend
  
  @js.native
  sealed trait create extends ParcelWatcherEventType
  
  @js.native
  sealed trait delete extends ParcelWatcherEventType
  
  @js.native
  sealed trait `fs-events` extends ParcelWatcherBackend
  
  @js.native
  sealed trait inotify extends ParcelWatcherBackend
  
  @js.native
  sealed trait update extends ParcelWatcherEventType
  
  @js.native
  sealed trait watchman extends ParcelWatcherBackend
  
  @js.native
  sealed trait windows extends ParcelWatcherBackend
  
  @scala.inline
  def `brute-force`: `brute-force` = "brute-force".asInstanceOf[`brute-force`]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def `fs-events`: `fs-events` = "fs-events".asInstanceOf[`fs-events`]
  @scala.inline
  def inotify: inotify = "inotify".asInstanceOf[inotify]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def watchman: watchman = "watchman".asInstanceOf[watchman]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

