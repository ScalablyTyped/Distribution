package typings.plottable

import typings.plottable.buildSrcScalesMod.IIncludedValuesProvider
import typings.plottable.buildSrcScalesMod.ITransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcScalesScaleMod {
  
  @JSImport("plottable/build/src/scales/scale", "Scale")
  @js.native
  /**
    * A Scale is a function (in the mathematical sense) that maps values from a domain to a range.
    *
    * @constructor
    */
  open class Scale[D, R] () extends StObject {
    
    /* private */ var _autoDomainAutomatically: Any = js.native
    
    /* protected */ def _backingScaleDomain(): js.Array[D] = js.native
    /* protected */ def _backingScaleDomain(values: js.Array[D]): this.type = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* protected */ def _dispatchUpdate(): Unit = js.native
    
    /* private */ var _domainModificationInProgress: Any = js.native
    
    /* protected */ def _getAllIncludedValues(): js.Array[D] = js.native
    /* protected */ def _getAllIncludedValues(ignoreAttachState: Boolean): js.Array[D] = js.native
    
    /* protected */ def _getDomain(): js.Array[D] = js.native
    
    /* protected */ def _getExtent(): js.Array[D] = js.native
    
    /* protected */ def _getRange(): js.Array[R] = js.native
    
    /* private */ var _includedValuesProviders: Any = js.native
    
    /* protected */ def _setDomain(values: js.Array[D]): Unit = js.native
    
    /* protected */ def _setRange(values: js.Array[R]): Unit = js.native
    
    /* private */ var _updateId: Any = js.native
    
    /**
      * Adds an IncludedValuesProvider to the Scale.
      *
      * @param {Scales.IncludedValuesProvider} provider
      * @returns {Scale} The calling Scale.
      */
    def addIncludedValuesProvider(provider: IIncludedValuesProvider[D]): this.type = js.native
    
    /**
      * Sets the Scale's domain so that it spans the Extents of all its ExtentsProviders.
      *
      * @returns {Scale} The calling Scale.
      */
    def autoDomain(): this.type = js.native
    
    /**
      * Triggers `.autoDomain()` if the domain is not explicitly set.
      */
    def autoDomainIfAutomaticMode(): Unit = js.native
    
    /**
      * Gets the domain.
      *
      * @returns {D[]} The current domain.
      */
    def domain(): js.Array[D] = js.native
    /**
      * Sets the domain.
      *
      * @param {D[]} values
      * @returns {Scale} The calling Scale.
      */
    def domain(values: js.Array[D]): this.type = js.native
    
    /**
      * Given an array of potential domain values, computes the extent of those values.
      *
      * @param {D[]} values
      * @returns {D[]} The extent of the input values.
      */
    def extentOfValues(values: js.Array[D]): js.Array[D] = js.native
    
    /**
      * Removes a callback that would be called when the Scale updates.
      *
      * @param {ScaleCallback} callback.
      * @returns {Scale} The calling Scale.
      */
    def offUpdate(callback: IScaleCallback[this.type]): this.type = js.native
    
    /**
      * Adds a callback to be called when the Scale updates.
      *
      * @param {ScaleCallback} callback.
      * @returns {Scale} The calling Scale.
      */
    def onUpdate(callback: IScaleCallback[this.type]): this.type = js.native
    
    /**
      * Gets the range.
      *
      * @returns {R[]} The current range.
      */
    def range(): js.Array[R] = js.native
    /**
      * Sets the range.
      *
      * @param {R[]} values
      * @returns {Scale} The calling Scale.
      */
    def range(values: js.Array[R]): this.type = js.native
    
    /**
      * Removes the IncludedValuesProvider from the Scale.
      *
      * @param {Scales.IncludedValuesProvider} provider
      * @returns {Scale} The calling Scale.
      */
    def removeIncludedValuesProvider(provider: IIncludedValuesProvider[D]): this.type = js.native
    
    /**
      * Computes the range value corresponding to a given domain value.
      *
      * @param {D} value
      * @returns {R} The range value corresponding to the supplied domain value.
      */
    def scale(value: D): R = js.native
    
    /**
      * Gets an array of tick values spanning the domain.
      *
      * @returns {D[]}
      */
    def ticks(): js.Array[D] = js.native
    
    def updateId(): Double = js.native
  }
  
  type IScaleCallback[S /* <: Scale[Any, Any] */] = js.Function1[/* scale */ S, Any]
  
  @js.native
  trait TransformableScale[D, R]
    extends Scale[D, R]
       with ITransformableScale
}
