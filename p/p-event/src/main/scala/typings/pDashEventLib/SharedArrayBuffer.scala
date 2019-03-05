package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedArrayBuffer extends ArrayBufferLike {
  /**
    * Read-only. The length of the ArrayBuffer (in bytes).
    */
  val byteLength: scala.Double = js.native
  /*
    * The SharedArrayBuffer constructor's length property whose value is 1.
    */
  var length: scala.Double = js.native
  @JSName(org.scalablytyped.runtime.Symbol.species)
  val species: SharedArrayBuffer = js.native
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: pDashEventLib.pDashEventLibStrings.SharedArrayBuffer = js.native
  /**
    * Returns a section of an SharedArrayBuffer.
    */
  def slice(begin: scala.Double): SharedArrayBuffer = js.native
  def slice(begin: scala.Double, end: scala.Double): SharedArrayBuffer = js.native
}

