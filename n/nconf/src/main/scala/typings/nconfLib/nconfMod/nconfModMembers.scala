package typings
package nconfLib.nconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nconf", JSImport.Namespace)
@js.native
object nconfModMembers extends js.Object {
  var formats: IFormats = js.native
  var sources: js.Array[js.Any] = js.native
  var stores: js.Any = js.native
  var version: scala.Double = js.native
  def add(name: java.lang.String): Provider = js.native
  def add(name: java.lang.String, options: IOptions): Provider = js.native
  def any(keys: js.Array[java.lang.String]): js.Any = js.native
  def any(keys: js.Array[java.lang.String], callback: ICallbackFunction): js.Any = js.native
  def argv(): Provider = js.native
  def argv(options: IOptions): Provider = js.native
  def clear(key: java.lang.String): js.Any = js.native
  def clear(key: java.lang.String, callback: ICallbackFunction): js.Any = js.native
  def create(name: java.lang.String, options: IOptions): IStore = js.native
  def defaults(): Provider = js.native
  def defaults(options: IOptions): Provider = js.native
  def env(): Provider = js.native
  def env(options: IOptions): Provider = js.native
  def env(separator: java.lang.String): Provider = js.native
  def file(name: java.lang.String): Provider = js.native
  def file(name: java.lang.String, filename: java.lang.String): Provider = js.native
  def file(name: java.lang.String, options: IFileOptions): Provider = js.native
  def file(options: IFileOptions): Provider = js.native
  def get(): js.Any = js.native
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, callback: ICallbackFunction): js.Any = js.native
  def init(): scala.Unit = js.native
  def init(options: IOptions): scala.Unit = js.native
  def key(values: js.Any*): java.lang.String = js.native
  def load(): js.Any = js.native
  def load(callback: ICallbackFunction): js.Any = js.native
  def loadFiles(files: js.Any): scala.Unit = js.native
  def loadFiles(files: js.Any, callback: ICallbackFunction): scala.Unit = js.native
  def loadFilesSync(files: js.Any): scala.Unit = js.native
  def loadFilesSync(files: js.Any, callback: ICallbackFunction): scala.Unit = js.native
  def loadSources(): js.Any = js.native
  def merge(key: java.lang.String, value: js.Any): js.Any = js.native
  def merge(key: java.lang.String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
  def mergeSources(data: js.Any): scala.Unit = js.native
  def overrides(): Provider = js.native
  def overrides(options: IOptions): Provider = js.native
  def path(key: js.Any): js.Array[_] = js.native
  def remove(name: java.lang.String): scala.Unit = js.native
  def required(keys: js.Array[java.lang.String]): Provider = js.native
  def reset(): js.Any = js.native
  def reset(callback: ICallbackFunction): js.Any = js.native
  def save(value: js.Any): js.Any = js.native
  def save(value: js.Any, callback: ICallbackFunction): js.Any = js.native
  def set(key: java.lang.String, value: js.Any): js.Any = js.native
  def set(key: java.lang.String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
  def use(name: java.lang.String): Provider = js.native
  def use(name: java.lang.String, options: IOptions): Provider = js.native
}

