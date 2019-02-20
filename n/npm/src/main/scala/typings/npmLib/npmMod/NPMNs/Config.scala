package typings
package npmLib.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  @JSName("Conf")
  var Conf_Original: ConfigStatic = js.native
  var defs: ConfigDefs = js.native
  var loaded: scala.Boolean = js.native
  var root: js.UndefOr[Config] = js.native
  var rootConf: Config = js.native
  var sources: Dictionary[ConfigSource] = js.native
  var usingBuiltin: scala.Boolean = js.native
  def Conf(base: Config): Config = js.native
  def add(data: js.Object, marker: js.Object): js.Any = js.native
  def addEnv(env: Dictionary[java.lang.String]): js.Any = js.native
  def addFile(file: java.lang.String, name: java.lang.String): Config = js.native
  def findPrefix(prefix: java.lang.String, cb: SimpleCallback[java.lang.String]): scala.Unit = js.native
  def get(setting: java.lang.String): js.Any = js.native
  def getCredentialsByURI(uri: java.lang.String): Credentials = js.native
  def loadCAFile(caFilePath: java.lang.String, cb: ErrorCallback): scala.Unit = js.native
  def loadExtras(cb: ErrorCallback): scala.Unit = js.native
  def loadPrefix(cb: ErrorCallback): scala.Unit = js.native
  def loadUid(cb: SimpleCallback[java.lang.String]): scala.Unit = js.native
  def parse(content: java.lang.String, file: java.lang.String): js.Any = js.native
  def save(where: java.lang.String, cb: ErrorCallback): Config = js.native
  def set(setting: java.lang.String, value: js.Any): scala.Unit = js.native
  def setCredentialsByURI(uri: java.lang.String, cred: Credentials): scala.Unit = js.native
  def setUser(cb: ErrorCallback): scala.Unit = js.native
}

