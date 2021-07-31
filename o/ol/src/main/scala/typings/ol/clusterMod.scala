package typings.ol

import typings.ol.pluggableMapMod.FrameState
import typings.ol.sourceSourceMod.AttributionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterMod {
  
  @JSImport("ol/source/Cluster", JSImport.Default)
  @js.native
  class default protected () extends Cluster {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Cluster
    extends typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] {
    
    /* protected */ def cluster(): Unit = js.native
    
    /* protected */ def createCluster(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    
    var distance: Double = js.native
    
    var features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    
    /* protected */ def geometryFunction(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): typings.ol.pointMod.default = js.native
    
    /**
      * Get the distance in pixels between clusters.
      */
    def getDistance(): Double = js.native
    
    /**
      * Get a reference to the wrapped source.
      */
    def getSource(): typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] = js.native
    
    var resolution: Double = js.native
    
    /**
      * Set the distance in pixels between clusters.
      */
    def setDistance(distance: Double): Unit = js.native
    
    /**
      * Replace the wrapped source.
      */
    def setSource(source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var geometryFunction: js.UndefOr[
        js.Function1[
          /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], 
          typings.ol.pointMod.default
        ]
      ] = js.undefined
    
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
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
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setGeometryFunction(
        value: /* p0 */ typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] => typings.ol.pointMod.default
      ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
      
      @scala.inline
      def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
