package typings.openpgp.mod.`type`

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementation of type key id
  * {@link https://tools.ietf.org/html/rfc4880#section-3.3|RFC4880 3.3}:
  * A Key ID is an eight-octet scalar that identifies a key.
  * Implementations SHOULD NOT assume that Key IDs are unique.  The
  * section "Enhanced Key Formats" below describes how Key IDs are
  * formed.
  */
@JSImport("openpgp", "type.keyid")
@js.native
object keyid extends js.Object {
  
  @js.native
  class Keyid () extends js.Object {
    
    /**
      * Checks equality of Key ID's
      * @param keyid
      * @param matchWildcard Indicates whether to check if either keyid is a wildcard
      */
    def equals(keyid: Keyid, matchWildcard: Boolean): Unit = js.native
    
    /**
      * Parsing method for a key id
      * @param input Input to read the key id from
      */
    def read(input: Uint8Array): Unit = js.native
  }
}
