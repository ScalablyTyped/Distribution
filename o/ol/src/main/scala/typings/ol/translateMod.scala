package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olStrings.translateend
import typings.ol.olStrings.translatestart
import typings.ol.olStrings.translating
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translateMod {
  
  @JSImport("ol/interaction/Translate", JSImport.Default)
  @js.native
  class default () extends Translate {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction/Translate", "TranslateEvent")
  @js.native
  class TranslateEvent protected ()
    extends typings.ol.eventMod.default {
    def this(
      `type`: TranslateEventType,
      features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      coordinate: Coordinate,
      startCoordinate: Coordinate,
      mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]
    ) = this()
    
    /**
      * The coordinate of the drag event.
      */
    var coordinate: Coordinate = js.native
    
    /**
      * The features being translated.
      */
    var features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent}.
      */
    var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent] = js.native
    
    /**
      * The coordinate of the start position before translation started.
      */
    var startCoordinate: Coordinate = js.native
  }
  
  @js.native
  sealed trait TranslateEventType extends StObject
  @JSImport("ol/interaction/Translate", "TranslateEventType")
  @js.native
  object TranslateEventType extends StObject {
    
    @js.native
    sealed trait TRANSLATEEND
      extends StObject
         with TranslateEventType
    
    @js.native
    sealed trait TRANSLATESTART
      extends StObject
         with TranslateEventType
    
    @js.native
    sealed trait TRANSLATING
      extends StObject
         with TranslateEventType
  }
  
  type FilterFunction = js.Function2[
    /* p0 */ FeatureLike, 
    /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
    Boolean
  ]
  
  trait Options extends StObject {
    
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ] = js.undefined
    
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    var hitTolerance: js.UndefOr[Double] = js.undefined
    
    var layers: js.UndefOr[
        js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | (js.Function1[
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          Boolean
        ])
      ] = js.undefined
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
      def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setFilter(
        value: (/* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
      
      @scala.inline
      def setLayers(
        value: js.Array[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] | (js.Function1[
              /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
              Boolean
            ])
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersFunction1(value: /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] => Boolean): Self = StObject.set(x, "layers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]*): Self = StObject.set(x, "layers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Translate
    extends typings.ol.pointerMod.default {
    
    /**
      * Returns the Hit-detection tolerance.
      */
    def getHitTolerance(): Double = js.native
    
    @JSName("on")
    def on_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    
    /**
      * Hit-detection tolerance. Pixels inside the radius around the given position
      * will be checked for features.
      */
    def setHitTolerance(hitTolerance: Double): Unit = js.native
    
    @JSName("un")
    def un_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
  }
}
