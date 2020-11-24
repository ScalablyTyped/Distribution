package typings.nodePersist.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-persist", "LocalStorage")
@js.native
class LocalStorage () extends js.Object {
  def this(options: InitOptions) = this()
  
  def calcTTL(): js.UndefOr[Double] = js.native
  def calcTTL(ttl: Double): js.UndefOr[Double] = js.native
  
  def clear(): js.Promise[Unit] = js.native
  
  def copy(value: js.Any): js.Any = js.native
  
  def data(): js.Promise[js.Array[Datum]] = js.native
  
  def del(key: String): js.Promise[DeleteFileResult] = js.native
  
  def ensureDirectory(dir: String): js.Promise[EnsureDirectoryResult] = js.native
  
  def forEach(callback: js.Function1[/* data */ Datum, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
  
  def get(key: String): js.Promise[_] = js.native
  
  def getDatum(key: String): Datum | Unit = js.native
  
  def getDatumPath(key: String): String = js.native
  
  def getDatumValue(key: String): Datum | Unit = js.native
  
  def getItem(key: String): js.Promise[_] = js.native
  
  def getRawDatum(key: String): String | Unit = js.native
  
  def init(): js.Promise[InitOptions] = js.native
  def init(options: InitOptions): js.Promise[InitOptions] = js.native
  
  def keys(): js.Promise[js.Array[String]] = js.native
  def keys(filter: FilterFunction[Datum]): js.Promise[js.Array[String]] = js.native
  
  def length(): js.Promise[Double] = js.native
  def length(filter: FilterFunction[Datum]): js.Promise[Double] = js.native
  
  def log(args: js.Any*): Unit = js.native
  
  def parse(): js.Any = js.native
  def parse(str: String): js.Any = js.native
  
  def readDirectory(dir: String): js.Promise[js.Array[Datum]] = js.native
  
  def readFile(file: String): js.Promise[Datum | String] = js.native
  def readFile(file: String, options: DatumOptions): js.Promise[Datum | String] = js.native
  
  def removeExpiredItems(): js.Promise[Unit] = js.native
  
  def removeItem(key: String): js.Promise[DeleteFileResult] = js.native
  
  def rm(key: String): js.Promise[DeleteFileResult] = js.native
  
  def set(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  def set(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  def setItem(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  def setItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: InitOptions): Unit = js.native
  
  def startExpiredKeysInterval(): Unit = js.native
  
  def stopExpiredKeysInterval(): Unit = js.native
  
  def stringify(obj: js.Any): String = js.native
  
  def update(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  def update(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  def updateItem(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  def updateItem(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
  
  def values(): js.Promise[js.Array[_]] = js.native
  def values(filter: FilterFunction[Datum]): js.Promise[js.Array[_]] = js.native
  
  def valuesWithKeyMatch(): js.Promise[js.Array[_]] = js.native
  def valuesWithKeyMatch(`match`: String): js.Promise[js.Array[_]] = js.native
  def valuesWithKeyMatch(`match`: RegExp): js.Promise[js.Array[_]] = js.native
  
  def writeFile(file: String, content: Datum): js.Promise[WriteFileResult] = js.native
}
