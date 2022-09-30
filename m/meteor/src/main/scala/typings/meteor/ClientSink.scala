package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSink
  extends StObject
     with Sink {
  
  def appendToBody(html: Content): Unit = js.native
  
  def appendToElementById(id: String, html: Content): Unit = js.native
  
  // Client and server. Only client
  def appendToHead(html: Content): Unit = js.native
  
  def getCookies(): StringDictionary[String] = js.native
  
  def getHeaders(): StringDictionary[String | js.Array[String]] = js.native
  
  def redirect(location: String): Unit = js.native
  def redirect(location: String, code: Double): Unit = js.native
  
  def renderIntoElementById(id: String, html: Content): Unit = js.native
  
  def setHeader(key: String, value: String): Unit = js.native
  def setHeader(key: String, value: js.Array[String]): Unit = js.native
  def setHeader(key: String, value: Double): Unit = js.native
  
  // Server-only, but error-raising stubs provided to client:
  def setStatusCode(code: Double): Unit = js.native
}
