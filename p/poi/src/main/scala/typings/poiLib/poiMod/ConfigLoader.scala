package typings
package poiLib.poiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigLoader extends js.Object {
  def load(): js.Any = js.native
  def load(files: js.Array[java.lang.String]): js.Any = js.native
  def load(files: js.Array[java.lang.String], cwd: java.lang.String): js.Any = js.native
  def load(files: js.Array[java.lang.String], cwd: java.lang.String, stopDir: java.lang.String): js.Any = js.native
  def load(options: poiLib.poiMod.ConfigLoaderNs.Options): js.Any = js.native
  def resolve(): java.lang.String | scala.Null = js.native
  def resolve(files: js.Array[java.lang.String]): java.lang.String | scala.Null = js.native
  def resolve(files: js.Array[java.lang.String], cwd: java.lang.String): java.lang.String | scala.Null = js.native
  def resolve(files: js.Array[java.lang.String], cwd: java.lang.String, stopDir: java.lang.String): java.lang.String | scala.Null = js.native
  def resolve(options: poiLib.poiMod.ConfigLoaderNs.Options): java.lang.String | scala.Null = js.native
}

