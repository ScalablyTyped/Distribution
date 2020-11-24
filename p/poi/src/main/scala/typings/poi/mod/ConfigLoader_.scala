package typings.poi.mod

import typings.poi.mod.ConfigLoader.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigLoader_ extends js.Object {
  
  def load(): js.Any = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Any = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: String): js.Any = js.native
  def load(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): js.Any = js.native
  def load(files: js.Array[String]): js.Any = js.native
  def load(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): js.Any = js.native
  def load(files: js.Array[String], cwd: String): js.Any = js.native
  def load(files: js.Array[String], cwd: String, stopDir: String): js.Any = js.native
  def load(options: Options): js.Any = js.native
  
  def resolve(): String | Null = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: String): String | Null = js.native
  def resolve(files: js.UndefOr[scala.Nothing], cwd: String, stopDir: String): String | Null = js.native
  def resolve(files: js.Array[String]): String | Null = js.native
  def resolve(files: js.Array[String], cwd: js.UndefOr[scala.Nothing], stopDir: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
  def resolve(options: Options): String | Null = js.native
}
