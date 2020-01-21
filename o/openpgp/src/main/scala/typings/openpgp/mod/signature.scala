package typings.openpgp.mod

import typings.openpgp.mod.packet.List
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "signature")
@js.native
object signature extends js.Object {
  /**
    * Class that represents an OpenPGP signature.
    */
  @js.native
  class Signature protected () extends js.Object {
    /**
      * @param packetlist The signature packets
      */
    def this(packetlist: List) = this()
    /**
      * Returns ASCII armored text of signature
      * @returns ASCII armor
      */
    def armor(): ReadableStream[String] = js.native
  }
  
  def read(input: ReadableStream[Uint8Array]): Signature = js.native
  /**
    * reads an OpenPGP signature as byte array and returns a signature object
    * @param input binary signature
    * @returns new signature object
    */
  def read(input: Uint8Array): Signature = js.native
  /**
    * reads an OpenPGP armored signature and returns a signature object
    * @param armoredText text to be parsed
    * @returns new signature object
    */
  def readArmored(armoredText: String): Signature = js.native
  def readArmored(armoredText: ReadableStream[String]): Signature = js.native
}

