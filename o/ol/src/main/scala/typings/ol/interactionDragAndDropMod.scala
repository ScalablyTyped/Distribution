package typings.ol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.FeatureLike
import typings.ol.featureMod.ObjectWithGeometry
import typings.ol.geomGeometryMod.Type
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.addfeatures
import typings.ol.olStrings.changeColonactive
import typings.ol.projMod.ProjectionLike
import typings.std.DragEvent
import typings.std.File
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragAndDropMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'addfeatures', DragAndDropEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'addfeatures', Return>} DragAndDropOnSignature
    */
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @api
    *
    * @fires DragAndDropEvent
    */
  @JSImport("ol/interaction/DragAndDrop", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends DragAndDrop {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
  @js.native
  open class DragAndDropEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {DragAndDropEventType} type Type.
      * @param {File} file File.
      * @param {Array<import("../Feature.js").default>} [features] Features.
      * @param {import("../proj/Projection.js").default} [projection] Projection.
      */
    def this(`type`: DragAndDropEventType, file: File) = this()
    def this(`type`: DragAndDropEventType, file: File, features: js.Array[typings.ol.renderFeatureMod.default]) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      features: js.Array[typings.ol.renderFeatureMod.default],
      projection: typings.ol.projProjectionMod.default
    ) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      features: Unit,
      projection: typings.ol.projProjectionMod.default
    ) = this()
    
    /**
      * The features parsed from dropped data.
      * @type {Array<import("../Feature.js").FeatureLike>|undefined}
      * @api
      */
    var features: js.UndefOr[js.Array[FeatureLike]] = js.native
    
    /**
      * The dropped file.
      * @type {File}
      * @api
      */
    var file: File = js.native
    
    /**
      * The feature projection.
      * @type {import("../proj/Projection.js").default|undefined}
      * @api
      */
    var projection: js.UndefOr[typings.ol.projProjectionMod.default] = js.native
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'addfeatures', DragAndDropEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'addfeatures', Return>} DragAndDropOnSignature
    */
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @api
    *
    * @fires DragAndDropEvent
    */
  @js.native
  trait DragAndDrop
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * @private
      * @type {?Array<import("../events.js").EventsKey>}
      */
    /* private */ var dropListenKeys_ : Any = js.native
    
    /**
      * @private
      * @type {Array<import("../format/Feature.js").default>}
      */
    /* private */ var formats_ : Any = js.native
    
    /**
      * @param {DragEvent} event Event.
      */
    def handleDrop(event: DragEvent): Unit = js.native
    
    /**
      * @param {File} file File.
      * @param {Event} event Load event.
      * @private
      */
    /* private */ var handleResult_ : Any = js.native
    
    /**
      * @param {DragEvent} event Event.
      */
    def handleStop(event: DragEvent): Unit = js.native
    
    /***
      * @type {DragAndDropOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_DragAndDrop: DragAndDropOnSignature[EventsKey] = js.native
    
    /***
      * @type {DragAndDropOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_DragAndDrop: DragAndDropOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {import("../proj/Projection.js").default}
      */
    /* private */ var projection_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var readAsBuffer_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var registerListeners_ : Any = js.native
    
    /**
      * @private
      * @type {import("../source/Vector.js").default}
      */
    /* private */ var source_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement|null}
      */
    /* private */ var target: Any = js.native
    
    /**
      * @param {import("../format/Feature.js").default} format Format.
      * @param {string} text Text.
      * @param {import("../format/Feature.js").ReadOptions} options Read options.
      * @private
      * @return {Array<import("../Feature.js").default>} Features.
      */
    /* private */ var tryReadFeatures_ : Any = js.native
    
    /***
      * @type {DragAndDropOnSignature<void>}
      */
    @JSName("un")
    var un_DragAndDrop: DragAndDropOnSignature[Unit] = js.native
    
    /**
      * @private
      */
    /* private */ var unregisterListeners_ : Any = js.native
  }
  
  type DragAndDropEventType = String
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait DragAndDropOnSignature[Return]
    extends OnSignature[
          changeColonactive | addfeatures | EventTypes | Types, 
          DragAndDropEvent | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * Format constructors
      * (and/or formats pre-constructed with options).
      */
    var formatConstructors: js.UndefOr[
        js.Array[
          typings.ol.renderFeatureMod.default | ((Instantiable5[
            /* type */ Type, 
            /* flatCoordinates */ js.Array[Double], 
            /* ends */ js.Array[js.Array[Double] | Double], 
            /* properties */ StringDictionary[Any], 
            /* id */ js.UndefOr[Double | String], 
            typings.ol.renderFeatureMod.default
          ]) & (Instantiable1[
            /* geometryOrProperties */ js.UndefOr[
              (/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any) | (ObjectWithGeometry[/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any])
            ], 
            typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
          ]) & Instantiable0[typings.ol.formatFeatureMod.default])
        ]
      ] = js.undefined
    
    /**
      * Target projection. By default, the map's view's projection is used.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Optional vector source where features will be added.  If a source is provided
      * all existing features will be removed and new features will be added when
      * they are dropped on the target.  If you want to add features to a vector
      * source without removing the existing features (append only), instead of
      * providing the source option listen for the "addfeatures" event.
      */
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
    
    /**
      * The element that is used as the drop target, default is the viewport element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFormatConstructors(
        value: js.Array[
              typings.ol.renderFeatureMod.default | ((Instantiable5[
                /* type */ Type, 
                /* flatCoordinates */ js.Array[Double], 
                /* ends */ js.Array[js.Array[Double] | Double], 
                /* properties */ StringDictionary[Any], 
                /* id */ js.UndefOr[Double | String], 
                typings.ol.renderFeatureMod.default
              ]) & (Instantiable1[
                /* geometryOrProperties */ js.UndefOr[
                  (/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any) | (ObjectWithGeometry[/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any])
                ], 
                typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
              ]) & Instantiable0[typings.ol.formatFeatureMod.default])
            ]
      ): Self = StObject.set(x, "formatConstructors", value.asInstanceOf[js.Any])
      
      inline def setFormatConstructorsUndefined: Self = StObject.set(x, "formatConstructors", js.undefined)
      
      inline def setFormatConstructorsVarargs(
        value: (typings.ol.renderFeatureMod.default | ((Instantiable5[
              /* type */ Type, 
              /* flatCoordinates */ js.Array[Double], 
              /* ends */ js.Array[js.Array[Double] | Double], 
              /* properties */ StringDictionary[Any], 
              /* id */ js.UndefOr[Double | String], 
              typings.ol.renderFeatureMod.default
            ]) & (Instantiable1[
              /* geometryOrProperties */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any) | (ObjectWithGeometry[/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any])
              ], 
              typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
            ]) & Instantiable0[typings.ol.formatFeatureMod.default]))*
      ): Self = StObject.set(x, "formatConstructors", js.Array(value*))
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
