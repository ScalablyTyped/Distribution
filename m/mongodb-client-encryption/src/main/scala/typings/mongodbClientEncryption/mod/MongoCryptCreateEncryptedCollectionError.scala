package typings.mongodbClientEncryption.mod

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb-client-encryption", "MongoCryptCreateEncryptedCollectionError")
@js.native
open class MongoCryptCreateEncryptedCollectionError () extends MongoCryptError {
  
  /** The error rejected from db.createCollection() */
  @JSName("cause")
  var cause_MongoCryptCreateEncryptedCollectionError: js.Error = js.native
  
  /**
    * The entire `encryptedFields` that was completed while attempting createEncryptedCollection
    */
  var encryptedFields: Document = js.native
}
