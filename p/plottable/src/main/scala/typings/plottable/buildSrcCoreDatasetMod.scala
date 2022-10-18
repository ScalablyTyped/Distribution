package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCoreDatasetMod {
  
  @JSImport("plottable/build/src/core/dataset", "Dataset")
  @js.native
  /**
    * A Dataset contains an array of data and some metadata.
    * Changes to the data or metadata will cause anything subscribed to the Dataset to update.
    *
    * @constructor
    * @param {any[]} [data=[]] The data for this Dataset.
    * @param {any} [metadata={}] An object containing additional information.
    */
  open class Dataset () extends StObject {
    def this(data: js.Array[Any]) = this()
    def this(data: js.Array[Any], metadata: Any) = this()
    def this(data: Unit, metadata: Any) = this()
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _dispatchUpdate: Any = js.native
    
    /* private */ var _metadata: Any = js.native
    
    /**
      * Store an update id for fast detection of changes to the dataset. Also, this
      * uses a global monotonically increasing value so that it may be used as a
      * combination update-aware memoize key.
      */
    /* private */ var _updateId: Any = js.native
    
    /**
      * Gets the data.
      *
      * @returns {any[]}
      */
    def data(): js.Array[Any] = js.native
    /**
      * Sets the data.
      *
      * @param {any[]} data
      * @returns {Dataset} The calling Dataset.
      */
    def data(data: js.Array[Any]): this.type = js.native
    
    /**
      * Gets the metadata.
      *
      * @returns {any}
      */
    def metadata(): Any = js.native
    /**
      * Sets the metadata.
      *
      * @param {any} metadata
      * @returns {Dataset} The calling Dataset.
      */
    def metadata(metadata: Any): this.type = js.native
    
    /**
      * Removes a callback that would be called when the Dataset updates.
      *
      * @param {DatasetCallback} callback
      * @returns {Dataset} The calling Dataset.
      */
    def offUpdate(callback: DatasetCallback): this.type = js.native
    
    /**
      * Adds a callback to be called when the Dataset updates.
      *
      * @param {DatasetCallback} callback.
      * @returns {Dataset} The calling Dataset.
      */
    def onUpdate(callback: DatasetCallback): this.type = js.native
    
    def updateId(): Double = js.native
  }
  
  type DatasetCallback = js.Function1[/* dataset */ Dataset, Unit]
}
