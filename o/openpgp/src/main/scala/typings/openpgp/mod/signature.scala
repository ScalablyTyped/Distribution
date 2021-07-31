package typings.openpgp.mod

import typings.openpgp.mod.packet.List
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signature {
  
  @JSImport("openpgp", "signature")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class that represents an OpenPGP signature.
    */
  @JSImport("openpgp", "signature.Signature")
  @js.native
  class Signature protected () extends StObject {
    /**
      * @param packetlist The signature packets
      */
    def this(packetlist: List) = this()
    
    /**
      * Returns ASCII armored text of signature
      * @returns ASCII armor
      */
    def armor(): ReadableStream[String] = js.native
    
    var packets: List = js.native
  }
  
  @scala.inline
  def read(input: ReadableStream[Uint8Array]): js.Promise[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Signature]]
  /**
    * reads an OpenPGP signature as byte array and returns a signature object
    * @param input binary signature
    * @returns new signature object
    */
  @scala.inline
  def read(input: Uint8Array): js.Promise[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Signature]]
  
  /**
    * reads an OpenPGP armored signature and returns a signature object
    * @param armoredText text to be parsed
    * @returns new signature object
    */
  @scala.inline
  def readArmored(armoredText: String): js.Promise[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("readArmored")(armoredText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Signature]]
  @scala.inline
  def readArmored(armoredText: ReadableStream[String]): js.Promise[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("readArmored")(armoredText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Signature]]
}
