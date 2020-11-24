package typings.npm.mod.NPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  def Conf(base: Config): Config = js.native
  @JSName("Conf")
  var Conf_Original: ConfigStatic = js.native
  
  def add(data: js.Object, marker: js.Object): js.Any = js.native
  
  def addEnv(env: Dictionary[String]): js.Any = js.native
  
  def addFile(file: String, name: String): Config = js.native
  
  var defs: ConfigDefs = js.native
  
  def findPrefix(prefix: String, cb: SimpleCallback[String]): Unit = js.native
  
  def get(setting: String): js.Any = js.native
  
  def getCredentialsByURI(uri: String): Credentials = js.native
  
  def loadCAFile(caFilePath: String, cb: ErrorCallback): Unit = js.native
  
  def loadExtras(cb: ErrorCallback): Unit = js.native
  
  def loadPrefix(cb: ErrorCallback): Unit = js.native
  
  def loadUid(cb: SimpleCallback[String]): Unit = js.native
  
  var loaded: Boolean = js.native
  
  def parse(content: String, file: String): js.Any = js.native
  
  var root: js.UndefOr[Config] = js.native
  
  var rootConf: Config = js.native
  
  def save(where: String, cb: ErrorCallback): Config = js.native
  
  def set(setting: String, value: js.Any): Unit = js.native
  
  def setCredentialsByURI(uri: String, cred: Credentials): Unit = js.native
  
  def setUser(cb: ErrorCallback): Unit = js.native
  
  var sources: Dictionary[ConfigSource] = js.native
  
  var usingBuiltin: Boolean = js.native
}
