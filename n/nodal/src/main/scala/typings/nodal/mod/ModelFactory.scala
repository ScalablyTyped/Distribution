package typings.nodal.mod

import typings.nodal.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "ModelFactory")
@js.native
class ModelFactory protected () extends StObject {
  /**
    * Create the ModelFactory with a provided Model to use as a reference.
    * @param {Nodal.Model} modelConstructor Must pass the constructor for the type of ModelFactory you wish to create.
    */
  def this(modelConstructor: TypeofModel) = this()
  
  /* private */ var Model: js.Any = js.native
  
  /**
    * Creates models from an array of Objects containing the model data
    * @param {Array} arrModelData Array of objects to create model data from
    */
  def create(arrModelData: js.Array[IModelData], callback: js.Function): Unit = js.native
}
/* static members */
object ModelFactory {
  
  @JSImport("nodal", "ModelFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new factories from a supplied array of Models, loading in data keyed by Model name
    * @param {Array} Models Array of model constructors you wish to reference
    * @param {Object} objModelData Keys are model names, values are arrays of model data you wish to create
    * @param {Function} callback What to execute upon completion
    */
  inline def createFromModels(Models: js.Array[TypeofModel], objModelData: IModelData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromModels")(Models.asInstanceOf[js.Any], objModelData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Loads all model constructors in your ./app/models directory into an array
    * @return {Array} Array of model Constructors
    */
  inline def loadModels(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadModels")().asInstanceOf[js.Array[js.Any]]
  
  /**
    * Populates a large amount of model data from an Object.
    * @param {Array} Models Array of Model constructors
    */
  inline def populate(objModelData: IModelData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(objModelData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
