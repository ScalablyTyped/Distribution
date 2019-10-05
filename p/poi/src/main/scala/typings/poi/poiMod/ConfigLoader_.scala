package typings.poi.poiMod

import typings.poi.poiMod.ConfigLoader.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ConfigLoader")
@js.native
trait ConfigLoader_ extends js.Object {
  def load(): js.Any = js.native
  def load(files: js.Array[String]): js.Any = js.native
  def load(files: js.Array[String], cwd: String): js.Any = js.native
  def load(files: js.Array[String], cwd: String, stopDir: String): js.Any = js.native
  def load(options: Options): js.Any = js.native
  def resolve(): String | Null = js.native
  def resolve(files: js.Array[String]): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
  def resolve(options: Options): String | Null = js.native
}

