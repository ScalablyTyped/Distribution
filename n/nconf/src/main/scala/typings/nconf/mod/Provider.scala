package typings.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nconf", "Provider")
@js.native
class Provider () extends js.Object {
  def this(options: IOptions) = this()
  
  def add(name: String): Provider = js.native
  def add(name: String, options: IOptions): Provider = js.native
  
  def any(keys: js.Array[String]): js.Any = js.native
  def any(keys: js.Array[String], callback: ICallbackFunction): js.Any = js.native
  
  def argv(): Provider = js.native
  def argv(options: IOptions): Provider = js.native
  
  def clear(key: String): js.Any = js.native
  def clear(key: String, callback: ICallbackFunction): js.Any = js.native
  
  def create(name: String, options: IOptions): IStore = js.native
  
  def defaults(): Provider = js.native
  def defaults(options: IOptions): Provider = js.native
  
  def env(): Provider = js.native
  def env(options: IOptions): Provider = js.native
  def env(separator: String): Provider = js.native
  
  def file(name: String): Provider = js.native
  def file(name: String, filename: String): Provider = js.native
  def file(name: String, options: IFileOptions): Provider = js.native
  def file(options: IFileOptions): Provider = js.native
  
  def get(): js.Any = js.native
  def get(key: js.UndefOr[scala.Nothing], callback: ICallbackFunction): js.Any = js.native
  def get(key: String): js.Any = js.native
  def get(key: String, callback: ICallbackFunction): js.Any = js.native
  
  def init(): Unit = js.native
  def init(options: IOptions): Unit = js.native
  
  def load(): js.Any = js.native
  def load(callback: ICallbackFunction): js.Any = js.native
  
  def loadSources(): js.Any = js.native
  
  def merge(key: String, value: js.Any): js.Any = js.native
  def merge(key: String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
  
  def mergeSources(data: js.Any): Unit = js.native
  
  def overrides(): Provider = js.native
  def overrides(options: IOptions): Provider = js.native
  
  def remove(name: String): Unit = js.native
  
  def required(keys: js.Array[String]): Provider = js.native
  
  def reset(): js.Any = js.native
  def reset(callback: ICallbackFunction): js.Any = js.native
  
  def save(value: js.Any): js.Any = js.native
  def save(value: js.Any, callback: ICallbackFunction): js.Any = js.native
  
  def set(key: String, value: js.Any): js.Any = js.native
  def set(key: String, value: js.Any, callback: ICallbackFunction): js.Any = js.native
  
  var sources: js.Array[_] = js.native
  
  var stores: js.Any = js.native
  
  def use(name: String): Provider = js.native
  def use(name: String, options: IOptions): Provider = js.native
}
