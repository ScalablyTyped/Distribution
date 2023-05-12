package typings.mongodbClientEncryption.mod

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb-client-encryption", "MongoCryptCreateDataKeyError")
@js.native
open class MongoCryptCreateDataKeyError () extends MongoCryptError {
  
  /** The first error encountered when attempting to `createDataKey` */
  @JSName("cause")
  var cause_MongoCryptCreateDataKeyError: js.Error = js.native
  
  /**
    * The partial `encryptedFields` that was completed while attempting createEncryptedCollection
    */
  var encryptedFields: Document = js.native
}
