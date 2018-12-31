package typings
package mongodbDashUriLib.mongodbDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-uri", "MongodbUriParser")
@js.native
class MongodbUriParser () extends js.Object {
  def this(options: parserOptions) = this()
  /**
    * Takes a URI object and returns a URI string of the form:
    *
    *   mongodb://[username[:password]@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database]][?options]
    *
    */
  def format(): java.lang.String = js.native
  def format(uriObject: UriObject): java.lang.String = js.native
  def formatMongoose(uri: java.lang.String): java.lang.String = js.native
  /**
    * Takes either a URI object or string and returns a Mongoose connection string. Specifically, instead of listing all
    * hosts and ports in a single URI, a Mongoose connection string contains a list of URIs each with a single host and
    * port pair.
    *
    * Useful in environments where a MongoDB URI environment variable is provided, but needs to be programmatically
    * transformed into a string digestible by mongoose.connect()--for example, when deploying to a PaaS like Heroku
    * using a MongoDB add-on like MongoLab.
    *
    */
  def formatMongoose(uri: UriObject): java.lang.String = js.native
  /**
    * Takes a URI of the form:
    *
    *   mongodb://[username[:password]@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database]][?options]
    *
    * scheme and hosts will always be present. Other fields will only be present in the result if they were
    * present in the input.
    */
  def parse(uri: java.lang.String): UriObject = js.native
}

