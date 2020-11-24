package typings.phaser.phaserMod.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("phaser", "Math.RandomDataGenerator")
@js.native
/**
  * 
  * @param seeds The seeds to use for the random number generator.
  */
class RandomDataGenerator ()
  extends typings.phaser.Phaser.Math.RandomDataGenerator {
  def this(seeds: String) = this()
  def this(seeds: js.Array[String]) = this()
}
