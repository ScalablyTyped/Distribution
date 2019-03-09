package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoder extends js.Object {
  /**
    * Returns encoding's name, lowercased.
    */
  val encoding: java.lang.String = js.native
  /**
    * Returns true if error mode is "fatal", and false
    * otherwise.
    */
  val fatal: scala.Boolean = js.native
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  val ignoreBOM: scala.Boolean = js.native
  /**
    * Returns the result of running encoding's decoder. The
    * method can be invoked zero or more times with options's stream set to
    * true, and then once without options's stream (or set to false), to process
    * a fragmented stream. If the invocation without options's stream (or set to
    * false) has no input, it's clearest to omit both arguments.
    * var string = "", decoder = new TextDecoder(encoding), buffer;
    * while(buffer = next_chunk()) {
    * string += decoder.decode(buffer, {stream:true});
    * }
    * string += decoder.decode(); // end-of-stream
    * If the error mode is "fatal" and encoding's decoder returns error, throws a TypeError.
    */
  def decode(): java.lang.String = js.native
  def decode(input: BufferSource): java.lang.String = js.native
  def decode(input: BufferSource, options: TextDecodeOptions): java.lang.String = js.native
}

@JSGlobal("TextDecoder")
@js.native
object TextDecoder
  extends org.scalablytyped.runtime.Instantiable0[TextDecoder]
     with org.scalablytyped.runtime.Instantiable1[/* label */ java.lang.String, TextDecoder]
     with org.scalablytyped.runtime.Instantiable2[/* label */ java.lang.String, /* options */ TextDecoderOptions, TextDecoder]

