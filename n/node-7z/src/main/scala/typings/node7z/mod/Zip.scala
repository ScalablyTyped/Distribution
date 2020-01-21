package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zip extends js.Object {
  def add(archive: String, files: String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def add(archive: String, files: js.Array[String], options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def delete(archive: String, files: String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def delete(archive: String, files: js.Array[String], options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def extract(archive: String, dest: String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def extractFull(archive: String, dest: String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def list(archive: String, options: CommandLineSwitches): PromiseWithProgress[FileSpec] = js.native
  def test(archive: String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def update(archive: String, files: String, options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
  def update(archive: String, files: js.Array[String], options: CommandLineSwitches): PromiseWithProgress[js.Object] = js.native
}

