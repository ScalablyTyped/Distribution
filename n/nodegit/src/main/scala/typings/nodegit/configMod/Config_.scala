package typings.nodegit.configMod

import typings.nodegit.bufMod.Buf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/config", "Config")
@js.native
class Config_ () extends js.Object {
  
  def deleteEntry(name: String): Double = js.native
  
  def deleteMultivar(name: String, regexp: String): Double = js.native
  
  def getBool(name: String): js.Promise[Double] = js.native
  
  def getEntry(name: String): js.Promise[ConfigEntry] = js.native
  
  def getInt32(name: String): js.Promise[Double] = js.native
  
  def getInt64(name: String): js.Promise[Double] = js.native
  
  def getPath(name: String): js.Promise[String] = js.native
  
   // the docs says Buf but it's actually a string
  def getStringBuf(name: String): js.Promise[Buf] = js.native
  
  def lock(transaction: js.Any): Double = js.native
  
  def setBool(name: String, value: Double): js.Promise[Double] = js.native
  
  def setInt32(name: String, value: Double): js.Promise[Double] = js.native
  
  def setInt64(name: String, value: Double): Double = js.native
  
  def setMultivar(name: String, regexp: String, value: String): js.Promise[Double] = js.native
  
  def setString(name: String, value: String): js.Promise[Double] = js.native
  
  def snapshot(): js.Promise[Config] = js.native
}
