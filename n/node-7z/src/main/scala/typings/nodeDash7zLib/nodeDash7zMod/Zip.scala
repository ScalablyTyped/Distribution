package typings
package nodeDash7zLib.nodeDash7zMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zip extends js.Object {
  def add(archive: java.lang.String, files: java.lang.String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def add(archive: java.lang.String, files: js.Array[java.lang.String], options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def delete(archive: java.lang.String, files: java.lang.String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def delete(archive: java.lang.String, files: js.Array[java.lang.String], options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def extract(archive: java.lang.String, dest: java.lang.String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def extractFull(archive: java.lang.String, dest: java.lang.String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def list(archive: java.lang.String, options: CommandLineSwitches): PromiseWithProgress[FileSpec] = js.native
  def test(archive: java.lang.String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def update(archive: java.lang.String, files: java.lang.String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def update(archive: java.lang.String, files: js.Array[java.lang.String], options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
}

