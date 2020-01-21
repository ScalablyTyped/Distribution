package typings.openpgp.mod.`type`

import typings.openpgp.mod.Integer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementation of type MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2})
  * Multiprecision integers (also called MPIs) are unsigned integers used
  * to hold large integers such as the ones used in cryptographic
  * calculations.
  * An MPI consists of two pieces: a two-octet scalar that is the length
  * of the MPI in bits followed by a string of octets that contain the
  * actual integer.
  */
@JSImport("openpgp", "type.mpi")
@js.native
object mpi extends js.Object {
  @js.native
  class MPI () extends js.Object {
    /**
      * Parsing function for a MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC 4880 3.2}).
      * @param input Payload of MPI data
      * @param endian Endianness of the data; 'be' for big-endian or 'le' for little-endian
      * @returns Length of data read
      */
    def read(input: Uint8Array, endian: String): Integer = js.native
    /**
      * Converts the mpi object to a bytes as specified in
      * {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2}
      * @param endian Endianness of the payload; 'be' for big-endian or 'le' for little-endian
      * @param length Length of the data part of the MPI
      * @returns mpi Byte representation
      */
    def write(endian: String, length: Integer): Uint8Array = js.native
  }
  
}

