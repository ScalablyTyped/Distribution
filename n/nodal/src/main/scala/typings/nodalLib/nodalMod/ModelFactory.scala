package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "ModelFactory")
@js.native
class ModelFactory protected () extends js.Object {
  /**
     * Create the ModelFactory with a provided Model to use as a reference.
     * @param {Nodal.Model} modelConstructor Must pass the constructor for the type of ModelFactory you wish to create.
     */
  def this(modelConstructor: ScalablyTyped.runtime.Instantiable3[
      /* modelData */ js.Object, 
      /* fromStorage */ js.UndefOr[/* fromStorage */ scala.Boolean], 
      /* fromSeed */ js.UndefOr[/* fromSeed */ scala.Boolean], 
      Model
    ]) = this()
  var Model: js.Any = js.native
  /**
     * Creates models from an array of Objects containing the model data
     * @param {Array} arrModelData Array of objects to create model data from
     */
  def create(arrModelData: js.Array[IModelData], callback: js.Function): scala.Unit = js.native
}

@JSImport("nodal", "ModelFactory")
@js.native
object ModelFactory extends js.Object {
  /**
     * Creates new factories from a supplied array of Models, loading in data keyed by Model name
     * @param {Array} Models Array of model constructors you wish to reference
     * @param {Object} objModelData Keys are model names, values are arrays of model data you wish to create
     * @param {Function} callback What to execute upon completion
     */
  def createFromModels(
    Models: js.Array[
      ScalablyTyped.runtime.Instantiable3[
        /* modelData */ js.Object, 
        /* fromStorage */ js.UndefOr[/* fromStorage */ scala.Boolean], 
        /* fromSeed */ js.UndefOr[/* fromSeed */ scala.Boolean], 
        nodalLib.nodalMod.Model
      ]
    ],
    objModelData: nodalLib.nodalMod.IModelData,
    callback: js.Function
  ): scala.Unit = js.native
  /**
     * Loads all model constructors in your ./app/models directory into an array
     * @return {Array} Array of model Constructors
     */
  def loadModels(): js.Array[_] = js.native
  /**
     * Populates a large amount of model data from an Object.
     * @param {Array} Models Array of Model constructors
     */
  def populate(objModelData: nodalLib.nodalMod.IModelData, callback: js.Function): scala.Unit = js.native
}

