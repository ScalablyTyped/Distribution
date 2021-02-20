package typings.ol

import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSourceMod {
  
  @JSImport("ol/source/Source", JSImport.Default)
  @js.native
  abstract class default protected () extends Source {
    def this(options: Options) = this()
  }
  
  type Attribution = js.Function1[/* p0 */ FrameState, String | js.Array[String]]
  
  type AttributionLike = String | js.Array[String] | Attribution
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
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
}
