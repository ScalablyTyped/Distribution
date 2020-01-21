package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystem extends js.Object {
  // Properties
  var separator: String = js.native
  var workingDirectory: String = js.native
  def absolute(path: String): String = js.native
  // Directory Functions
  def changeWorkingDirectory(path: String): Unit = js.native
  def copy(source: String, destination: String): Unit = js.native
  def copyTree(source: String, destination: String): Unit = js.native
  def exists(path: String): Boolean = js.native
  def isAbsolute(path: String): Boolean = js.native
  def isDirectory(path: String): Boolean = js.native
  def isExecutable(path: String): Boolean = js.native
  def isFile(path: String): Boolean = js.native
  def isLink(path: String): Boolean = js.native
  def isReadable(path: String): Boolean = js.native
  def isWritable(path: String): Boolean = js.native
  // Functions
  // Query Functions
  def list(path: String): js.Array[String] = js.native
  def makeDirectory(path: String): Unit = js.native
  def makeTree(path: String): Unit = js.native
  def move(source: String, destination: String): Unit = js.native
  // File Functions
  def open(path: String, mode: String): Stream = js.native
  def open(path: String, options: AnonCharset): Stream = js.native
  def read(path: String): String = js.native
  def readLink(path: String): String = js.native
  def remove(path: String): Unit = js.native
  def removeDirectory(path: String): Unit = js.native
  def removeTree(path: String): Unit = js.native
  def size(path: String): Double = js.native
  def touch(path: String): Unit = js.native
  def write(path: String, content: String, mode: String): Unit = js.native
}

