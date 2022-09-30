package typings.mongodb.mod

import org.scalablytyped.runtime.Instantiable2
import typings.bson.mod.Document
import typings.mongodb.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoEncrypter
  extends StObject
     with Instantiable2[/* client */ MongoClient, /* options */ AutoEncryptionOptions, AutoEncrypter] {
  
  /** @experimental */
  val cryptSharedLibVersionInfo: Version | Null = js.native
  
  def decrypt(cmd: Document, options: Any, callback: Callback[Document]): Unit = js.native
  
  def encrypt(ns: String, cmd: Document, options: Any, callback: Callback[Document]): Unit = js.native
  
  def init(cb: Callback[Any]): Unit = js.native
  
  def teardown(force: Boolean, callback: Callback[Any]): Unit = js.native
}
