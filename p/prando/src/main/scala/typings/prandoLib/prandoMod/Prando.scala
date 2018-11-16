package typings
package prandoLib.prandoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prando extends js.Object {
  var _seed: js.Any = js.native
  var _value: js.Any = js.native
  var getSafeSeed: js.Any = js.native
  @JSName("hashCode")
  var hashCode_FPrando: js.Any = js.native
  var map: js.Any = js.native
  var recalculate: js.Any = js.native
  var xorshift: js.Any = js.native
  /**
       * Generates a pseudo-random number between a lower (inclusive) and a higher (exclusive) bounds.
       *
       * @param min - The minimum number that can be randomly generated.
       * @param pseudoMax - The maximum number that can be randomly generated (exclusive).
       * @return The generated pseudo-random number.
       */
  def next(): scala.Double = js.native
  /**
       * Generates a pseudo-random number between a lower (inclusive) and a higher (exclusive) bounds.
       *
       * @param min - The minimum number that can be randomly generated.
       * @param pseudoMax - The maximum number that can be randomly generated (exclusive).
       * @return The generated pseudo-random number.
       */
  def next(min: scala.Double): scala.Double = js.native
  /**
       * Generates a pseudo-random number between a lower (inclusive) and a higher (exclusive) bounds.
       *
       * @param min - The minimum number that can be randomly generated.
       * @param pseudoMax - The maximum number that can be randomly generated (exclusive).
       * @return The generated pseudo-random number.
       */
  def next(min: scala.Double, pseudoMax: scala.Double): scala.Double = js.native
  /**
       * Picks a pseudo-random item from an array. The array is left unmodified.
       *
       * Note: keep in mind that while the returned item will be random enough, picking one item from the array at a time
       * does not guarantee nor imply that a sequence of random non-repeating items will be picked. If you want to
       * *pick items in a random order* from an array, instead of *pick one random item from an array*, it's best to
       * apply a *shuffle* transformation to the array instead, then read it linearly.
       *
       * @param array - Array of any type containing one or more candidates for random picking.
       * @return An item from the array.
       */
  def nextArrayItem[T](array: js.Array[T]): T = js.native
  /**
       * Generates a pseudo-random boolean.
       *
       * @return A value of true or false.
       */
  def nextBoolean(): scala.Boolean = js.native
  /**
       * Generates a pseudo-random string of 1 character specific character range.
       *
       * @param chars - Characters that are used when creating the random string. Defaults to all alphanumeric chars (A-Z, a-z, 0-9).
       * @return The generated character.
       */
  def nextChar(): java.lang.String = js.native
  /**
       * Generates a pseudo-random string of 1 character specific character range.
       *
       * @param chars - Characters that are used when creating the random string. Defaults to all alphanumeric chars (A-Z, a-z, 0-9).
       * @return The generated character.
       */
  def nextChar(chars: java.lang.String): java.lang.String = js.native
  /**
       * Generates a pseudo-random integer number in a range (inclusive).
       *
       * @param min - The minimum number that can be randomly generated.
       * @param max - The maximum number that can be randomly generated.
       * @return The generated pseudo-random number.
       */
  def nextInt(): scala.Double = js.native
  /**
       * Generates a pseudo-random integer number in a range (inclusive).
       *
       * @param min - The minimum number that can be randomly generated.
       * @param max - The maximum number that can be randomly generated.
       * @return The generated pseudo-random number.
       */
  def nextInt(min: scala.Double): scala.Double = js.native
  /**
       * Generates a pseudo-random integer number in a range (inclusive).
       *
       * @param min - The minimum number that can be randomly generated.
       * @param max - The maximum number that can be randomly generated.
       * @return The generated pseudo-random number.
       */
  def nextInt(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
       * Generates a pseudo-random string sequence of a particular length from a specific character range.
       *
       * Note: keep in mind that creating a random string sequence does not guarantee uniqueness; there is always a
       * 1 in (char_length^string_length) chance of collision. For real unique string ids, always check for
       * pre-existing ids, or employ a robust GUID/UUID generator.
       *
       * @param length - Length of the strting to be generated.
       * @param chars - Characters that are used when creating the random string. Defaults to all alphanumeric chars (A-Z, a-z, 0-9).
       * @return The generated string sequence.
       */
  def nextString(): java.lang.String = js.native
  /**
       * Generates a pseudo-random string sequence of a particular length from a specific character range.
       *
       * Note: keep in mind that creating a random string sequence does not guarantee uniqueness; there is always a
       * 1 in (char_length^string_length) chance of collision. For real unique string ids, always check for
       * pre-existing ids, or employ a robust GUID/UUID generator.
       *
       * @param length - Length of the strting to be generated.
       * @param chars - Characters that are used when creating the random string. Defaults to all alphanumeric chars (A-Z, a-z, 0-9).
       * @return The generated string sequence.
       */
  def nextString(length: scala.Double): java.lang.String = js.native
  /**
       * Generates a pseudo-random string sequence of a particular length from a specific character range.
       *
       * Note: keep in mind that creating a random string sequence does not guarantee uniqueness; there is always a
       * 1 in (char_length^string_length) chance of collision. For real unique string ids, always check for
       * pre-existing ids, or employ a robust GUID/UUID generator.
       *
       * @param length - Length of the strting to be generated.
       * @param chars - Characters that are used when creating the random string. Defaults to all alphanumeric chars (A-Z, a-z, 0-9).
       * @return The generated string sequence.
       */
  def nextString(length: scala.Double, chars: java.lang.String): java.lang.String = js.native
  /**
       * Reset the pseudo-random number sequence back to its starting seed. Further calls to next()
       * will then produce the same sequence of numbers it had produced before. This is equivalent to
       * creating a new Prando instance with the same seed as another Prando instance.
       *
       * Example:
       * let rng = new Prando(12345678);
       * console.log(rng.next()); // 0.6177754114889017
       * console.log(rng.next()); // 0.5784605181725837
       * rng.reset();
       * console.log(rng.next()); // 0.6177754114889017 again
       * console.log(rng.next()); // 0.5784605181725837 again
       */
  def reset(): scala.Unit = js.native
  /**
       * Skips ahead in the sequence of numbers that are being generated. This is equivalent to
       * calling next() a specified number of times, but faster since it doesn't need to map the
       * new random numbers to a range and return it.
       *
       * @param iterations - The number of items to skip ahead.
       */
  def skip(): scala.Unit = js.native
  /**
       * Skips ahead in the sequence of numbers that are being generated. This is equivalent to
       * calling next() a specified number of times, but faster since it doesn't need to map the
       * new random numbers to a range and return it.
       *
       * @param iterations - The number of items to skip ahead.
       */
  def skip(iterations: scala.Double): scala.Unit = js.native
}

