package typings.mongodbDashUri.mongodbDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-uri", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(): String = js.native
  def format(uriObject: UriObject): String = js.native
  def formatMongoose(uri: String): String = js.native
  def formatMongoose(uri: UriObject): String = js.native
  def parse(uri: String): UriObject = js.native
}

