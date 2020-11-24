package typings.ol.sourceSourceMod

import typings.ol.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source
  extends typings.ol.objectMod.default {
  
  /**
    * Get the attribution function for the source.
    */
  def getAttributions(): Attribution = js.native
  
  def getAttributionsCollapsible(): Boolean = js.native
  
  def getContextOptions(): js.UndefOr[js.Object] = js.native
  
  /**
    * Get the projection of the source.
    */
  def getProjection(): typings.ol.projectionMod.default = js.native
  
  def getResolutions(): js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Get the state of the source, see {@link module:ol/source/State~State} for possible states.
    */
  def getState(): State = js.native
  
  def getWrapX(): js.UndefOr[Boolean] = js.native
  
  /**
    * Refreshes the source. The source will be cleared, and data from the server will be reloaded.
    */
  def refresh(): Unit = js.native
  
  /**
    * Set the attributions of the source.
    */
  def setAttributions(): Unit = js.native
  def setAttributions(attributions: AttributionLike): Unit = js.native
  
  /**
    * Set the state of the source.
    */
  def setState(state: State): Unit = js.native
}
