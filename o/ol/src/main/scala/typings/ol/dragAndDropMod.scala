package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olStrings.addfeatures
import typings.ol.projMod.ProjectionLike
import typings.std.DragEvent
import typings.std.File
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropMod {
  
  @JSImport("ol/interaction/DragAndDrop", JSImport.Default)
  @js.native
  class default () extends DragAndDrop {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait DragAndDropEventType extends StObject
  @JSImport("ol/interaction/DragAndDrop", "DragAndDropEventType")
  @js.native
  object DragAndDropEventType extends StObject {
    
    @js.native
    sealed trait ADD_FEATURES extends DragAndDropEventType
  }
  
  @js.native
  trait DragAndDrop
    extends typings.ol.interactionInteractionMod.default {
    
    def handleDrop(event: DragEvent): Unit = js.native
    
    def handleStop(event: DragEvent): Unit = js.native
    
    @JSName("on")
    def on_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait DragAndDropEvent
    extends typings.ol.eventMod.default {
    
    /**
      * The features parsed from dropped data.
      */
    var features: js.Array[FeatureLike] = js.native
    
    /**
      * The dropped file.
      */
    var file: File = js.native
    
    /**
      * The feature projection.
      */
    var projection: typings.ol.projectionMod.default = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var formatConstructors: js.UndefOr[js.Array[typings.ol.featureMod.default]] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.native
    
    var target: js.UndefOr[HTMLElement] = js.native
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
      def setFormatConstructors(value: js.Array[typings.ol.featureMod.default]): Self = StObject.set(x, "formatConstructors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatConstructorsUndefined: Self = StObject.set(x, "formatConstructors", js.undefined)
      
      @scala.inline
      def setFormatConstructorsVarargs(value: typings.ol.featureMod.default*): Self = StObject.set(x, "formatConstructors", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
