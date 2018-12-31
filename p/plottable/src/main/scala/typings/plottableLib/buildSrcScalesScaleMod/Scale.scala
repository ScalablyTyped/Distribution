package typings
package plottableLib.buildSrcScalesScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales/scale", "Scale")
@js.native
/**
  * A Scale is a function (in the mathematical sense) that maps values from a domain to a range.
  *
  * @constructor
  */
class Scale[D, R] () extends js.Object {
  var _autoDomainAutomatically: js.Any = js.native
  var _callbacks: js.Any = js.native
  var _domainModificationInProgress: js.Any = js.native
  var _includedValuesProviders: js.Any = js.native
  var _updateId: js.Any = js.native
  /* protected */ def _backingScaleDomain(): js.Array[D] = js.native
  /* protected */ def _backingScaleDomain(values: js.Array[D]): this.type = js.native
  /* protected */ def _dispatchUpdate(): scala.Unit = js.native
  /* protected */ def _getAllIncludedValues(): js.Array[D] = js.native
  /* protected */ def _getAllIncludedValues(ignoreAttachState: scala.Boolean): js.Array[D] = js.native
  /* protected */ def _getDomain(): js.Array[D] = js.native
  /* protected */ def _getExtent(): js.Array[D] = js.native
  /* protected */ def _getRange(): js.Array[R] = js.native
  /* protected */ def _setDomain(values: js.Array[D]): scala.Unit = js.native
  /* protected */ def _setRange(values: js.Array[R]): scala.Unit = js.native
  /**
    * Adds an IncludedValuesProvider to the Scale.
    *
    * @param {Scales.IncludedValuesProvider} provider
    * @returns {Scale} The calling Scale.
    */
  def addIncludedValuesProvider(provider: plottableLib.buildSrcScalesMod.IIncludedValuesProvider[D]): this.type = js.native
  /**
    * Sets the Scale's domain so that it spans the Extents of all its ExtentsProviders.
    *
    * @returns {Scale} The calling Scale.
    */
  def autoDomain(): this.type = js.native
  /**
    * Triggers `.autoDomain()` if the domain is not explicitly set.
    */
  def autoDomainIfAutomaticMode(): scala.Unit = js.native
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
  def removeIncludedValuesProvider(provider: plottableLib.buildSrcScalesMod.IIncludedValuesProvider[D]): this.type = js.native
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
  def updateId(): scala.Double = js.native
}

