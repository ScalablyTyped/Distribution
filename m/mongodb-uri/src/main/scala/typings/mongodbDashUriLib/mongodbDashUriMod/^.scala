package typings
package mongodbDashUriLib.mongodbDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-uri", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(): java.lang.String = js.native
  def format(uriObject: UriObject): java.lang.String = js.native
  def formatMongoose(uri: java.lang.String): java.lang.String = js.native
  def formatMongoose(uri: UriObject): java.lang.String = js.native
  def parse(uri: java.lang.String): UriObject = js.native
}

