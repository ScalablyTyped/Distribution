package typings
package phaserLib.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A seeded Random Data Generator.
  * 
  * Access via `Phaser.Math.RND` which is an instance of this class pre-defined
  * by Phaser. Or, create your own instance to use as you require.
  * 
  * The `Math.RND` generator is seeded by the Game Config property value `seed`.
  * If no such config property exists, a random number is used.
  * 
  * If you create your own instance of this class you should provide a seed for it.
  * If no seed is given it will use a 'random' one based on Date.now.
  */
@JSGlobal("Phaser.Math.RandomDataGenerator")
@js.native
/**
  * 
  * @param seeds The seeds to use for the random number generator.
  */
class RandomDataGenerator () extends js.Object {
  def this(seeds: java.lang.String) = this()
  def this(seeds: js.Array[java.lang.String]) = this()
  /**
    * Signs to choose from.
    */
  var signs: js.Array[scala.Double] = js.native
  /**
    * Returns a random angle between -180 and 180.
    */
  def angle(): scala.Double = js.native
  /**
    * Returns a random integer between and including min and max.
    * This method is an alias for RandomDataGenerator.integerInRange.
    * @param min The minimum value in the range.
    * @param max The maximum value in the range.
    */
  def between(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Returns a random real number between 0 and 1.
    */
  def frac(): scala.Double = js.native
  /**
    * Initialize the state of the random data generator.
    * @param seeds The seeds to initialize the random data generator with.
    */
  def init(seeds: java.lang.String): scala.Unit = js.native
  def init(seeds: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Returns a random integer between 0 and 2^32.
    */
  def integer(): scala.Double = js.native
  /**
    * Returns a random integer between and including min and max.
    * @param min The minimum value in the range.
    * @param max The maximum value in the range.
    */
  def integerInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Returns a random real number between -1 and 1.
    */
  def normal(): scala.Double = js.native
  /**
    * Returns a random element from within the given array.
    * @param array The array to pick a random element from.
    */
  def pick(array: js.Array[_]): js.Any = js.native
  /**
    * Returns a random real number between 0 and 2^32.
    */
  def real(): scala.Double = js.native
  /**
    * Returns a random real number between min and max.
    * @param min The minimum value in the range.
    * @param max The maximum value in the range.
    */
  def realInRange(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Returns a random rotation in radians, between -3.141 and 3.141
    */
  def rotation(): scala.Double = js.native
  /**
    * Shuffles the given array, using the current seed.
    * @param array The array to be shuffled.
    */
  def shuffle(): js.Array[_] = js.native
  def shuffle(array: js.Array[_]): js.Array[_] = js.native
  /**
    * Returns a sign to be used with multiplication operator.
    */
  def sign(): scala.Double = js.native
  /**
    * Reset the seed of the random data generator.
    * 
    * _Note_: the seed array is only processed up to the first `undefined` (or `null`) value, should such be present.
    * @param seeds The array of seeds: the `toString()` of each value is used.
    */
  def sow(seeds: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Gets or Sets the state of the generator. This allows you to retain the values
    * that the generator is using between games, i.e. in a game save file.
    * 
    * To seed this generator with a previously saved state you can pass it as the
    * `seed` value in your game config, or call this method directly after Phaser has booted.
    * 
    * Call this method with no parameters to return the current state.
    * 
    * If providing a state it should match the same format that this method
    * returns, which is a string with a header `!rnd` followed by the `c`,
    * `s0`, `s1` and `s2` values respectively, each comma-delimited.
    * @param state Generator state to be set.
    */
  def state(): java.lang.String = js.native
  def state(state: java.lang.String): java.lang.String = js.native
  /**
    * Returns a random timestamp between min and max, or between the beginning of 2000 and the end of 2020 if min and max aren't specified.
    * @param min The minimum value in the range.
    * @param max The maximum value in the range.
    */
  def timestamp(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Returns a valid RFC4122 version4 ID hex string from https://gist.github.com/1308368
    */
  def uuid(): java.lang.String = js.native
  /**
    * Returns a random element from within the given array, favoring the earlier entries.
    * @param array The array to pick a random element from.
    */
  def weightedPick(array: js.Array[_]): js.Any = js.native
}

