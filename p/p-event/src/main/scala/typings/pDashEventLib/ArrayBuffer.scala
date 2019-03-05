package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a raw buffer of binary data, which is used to store data for the
  * different typed arrays. ArrayBuffers cannot be read from or written to directly,
  * but can be passed to a typed array or DataView Object to interpret the raw
  * buffer as needed.
  */
@js.native
trait ArrayBuffer extends ArrayBufferLike {
  /**
    * Read-only. The length of the ArrayBuffer (in bytes).
    */
  val byteLength: scala.Double = js.native
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  /**
    * Returns a section of an ArrayBuffer.
    */
  def slice(begin: scala.Double): ArrayBuffer = js.native
  def slice(begin: scala.Double, end: scala.Double): ArrayBuffer = js.native
}

