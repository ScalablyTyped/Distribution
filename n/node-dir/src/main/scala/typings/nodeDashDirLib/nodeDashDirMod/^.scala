package typings
package nodeDashDirLib.nodeDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-dir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def files(
    dir: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* files */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def paths(
    dir: java.lang.String,
    callback: js.Function2[
      /* error */ js.Any, 
      /* paths */ nodeDashDirLib.nodeDashDirMod.PathsResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def paths(
    dir: java.lang.String,
    combine: scala.Boolean,
    callback: js.Function2[
      /* error */ js.Any, 
      /* paths */ js.Array[java.lang.String] | nodeDashDirLib.nodeDashDirMod.PathsResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFiles(dir: java.lang.String, fileCallback: nodeDashDirLib.nodeDashDirMod.FileCallback): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    fileCallback: nodeDashDirLib.nodeDashDirMod.FileCallback,
    finishedCallback: nodeDashDirLib.nodeDashDirMod.FinishedCallback
  ): scala.Unit = js.native
  def readFiles(dir: java.lang.String, fileCallback: nodeDashDirLib.nodeDashDirMod.FileNamedCallback): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    fileCallback: nodeDashDirLib.nodeDashDirMod.FileNamedCallback,
    finishedCallback: nodeDashDirLib.nodeDashDirMod.FinishedCallback
  ): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    options: nodeDashDirLib.nodeDashDirMod.Options,
    fileCallback: nodeDashDirLib.nodeDashDirMod.FileCallback
  ): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    options: nodeDashDirLib.nodeDashDirMod.Options,
    fileCallback: nodeDashDirLib.nodeDashDirMod.FileCallback,
    finishedCallback: nodeDashDirLib.nodeDashDirMod.FinishedCallback
  ): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    options: nodeDashDirLib.nodeDashDirMod.Options,
    fileCallback: nodeDashDirLib.nodeDashDirMod.FileNamedCallback
  ): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    options: nodeDashDirLib.nodeDashDirMod.Options,
    fileCallback: nodeDashDirLib.nodeDashDirMod.FileNamedCallback,
    finishedCallback: nodeDashDirLib.nodeDashDirMod.FinishedCallback
  ): scala.Unit = js.native
  def readFilesStream(
    dir: java.lang.String,
    options: nodeDashDirLib.nodeDashDirMod.Options,
    streamCallback: nodeDashDirLib.nodeDashDirMod.StreamCallback
  ): scala.Unit = js.native
  def readFilesStream(
    dir: java.lang.String,
    options: nodeDashDirLib.nodeDashDirMod.Options,
    streamCallback: nodeDashDirLib.nodeDashDirMod.StreamCallback,
    finishedCallback: nodeDashDirLib.nodeDashDirMod.FinishedCallback
  ): scala.Unit = js.native
  def readFilesStream(dir: java.lang.String, streamCallback: nodeDashDirLib.nodeDashDirMod.StreamCallback): scala.Unit = js.native
  def readFilesStream(
    dir: java.lang.String,
    streamCallback: nodeDashDirLib.nodeDashDirMod.StreamCallback,
    finishedCallback: nodeDashDirLib.nodeDashDirMod.FinishedCallback
  ): scala.Unit = js.native
  def subdirs(
    dir: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* subdirs */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
}

