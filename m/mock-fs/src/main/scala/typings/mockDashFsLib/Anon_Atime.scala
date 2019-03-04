package typings
package mockDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Atime extends js.Object {
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: stdLib.Date): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: stdLib.Date): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: stdLib.Date): js.Promise[scala.Unit] = js.native
}

