package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the EncryptedContentInfo structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  */
@js.native
trait EncryptedContentInfo
  extends StObject
     with PkiObject
     with IEncryptedContentInfo {
  
  /**
    * Returns concatenated buffer from `encryptedContent` field.
    * @returns Array buffer
    * @since 3.0.0
    * @throws Throws Error if `encryptedContent` is undefined
    */
  def getEncryptedContent(): js.typedarray.ArrayBuffer = js.native
}
