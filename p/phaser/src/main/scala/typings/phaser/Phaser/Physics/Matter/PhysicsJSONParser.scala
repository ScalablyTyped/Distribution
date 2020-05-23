package typings.phaser.Phaser.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a body using the supplied physics data, as provided by a JSON file.
  * 
  * The data file should be loaded as JSON:
  * 
  * ```javascript
  * preload ()
  * {
  *   this.load.json('ninjas', 'assets/ninjas.json);
  * }
  * 
  * create ()
  * {
  *   const ninjaShapes = this.cache.json.get('ninjas');
  * 
  *   this.matter.add.fromJSON(400, 300, ninjaShapes.shinobi);
  * }
  * ```
  * 
  * Do not pass the entire JSON file to this method, but instead pass one of the shapes contained within it.
  * 
  * If you pas in an `options` object, any settings in there will override those in the config object.
  * 
  * The structure of the JSON file is as follows:
  * 
  * ```text
  * {
  *   'generator_info': // The name of the application that created the JSON data
  *   'shapeName': {
  *     'type': // The type of body
  *     'label': // Optional body label
  *     'vertices': // An array, or an array of arrays, containing the vertex data in x/y object pairs
  *   }
  * }
  * ```
  * 
  * At the time of writing, only the Phaser Physics Tracer App exports in this format.
  */
@JSGlobal("Phaser.Physics.Matter.PhysicsJSONParser")
@js.native
object PhysicsJSONParser extends js.Object

