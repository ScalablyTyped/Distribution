package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebServerResponse extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var statusCode: scala.Double = js.native
  def close(): scala.Unit = js.native
  def closeGracefully(): scala.Unit = js.native
  def header(name: java.lang.String): java.lang.String = js.native
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String): scala.Unit = js.native
  def writeHead(statusCode: scala.Double): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
}

