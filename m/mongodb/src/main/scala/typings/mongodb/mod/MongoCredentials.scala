package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.PartialMongoCredentialsOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoCredentials")
@js.native
open class MongoCredentials protected () extends StObject {
  def this(options: MongoCredentialsOptions) = this()
  
  /** Determines if two MongoCredentials objects are equivalent */
  def equals(other: MongoCredentials): Boolean = js.native
  
  /** The method used to authenticate */
  val mechanism: AuthMechanism = js.native
  
  /** Special properties used by some types of auth mechanisms */
  val mechanismProperties: AuthMechanismProperties = js.native
  
  /** The password used for authentication */
  val password: String = js.native
  
  /**
    * If the authentication mechanism is set to "default", resolves the authMechanism
    * based on the server version and server supported sasl mechanisms.
    *
    * @param hello - A hello response from the server
    */
  def resolveAuthMechanism(): MongoCredentials = js.native
  def resolveAuthMechanism(hello: Document): MongoCredentials = js.native
  
  /** The database that the user should authenticate against */
  val source: String = js.native
  
  /** The username used for authentication */
  val username: String = js.native
  
  def validate(): Unit = js.native
}
/* static members */
object MongoCredentials {
  
  @JSImport("mongodb", "MongoCredentials")
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(creds: Unit, options: PartialMongoCredentialsOp): MongoCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(creds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MongoCredentials]
  inline def merge(creds: MongoCredentials, options: PartialMongoCredentialsOp): MongoCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(creds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MongoCredentials]
}
