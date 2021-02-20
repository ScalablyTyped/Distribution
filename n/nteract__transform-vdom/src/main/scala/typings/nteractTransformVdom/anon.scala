package typings.nteractTransformVdom

import typings.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typings.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typings.nteractTransformVdom.objectToReactMod.VDOMEl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MediaType extends StObject {
    
    var mediaType: String = js.native
    
    def onVDOMEvent(): Unit = js.native
  }
  object MediaType {
    
    @scala.inline
    def apply(mediaType: String, onVDOMEvent: () => Unit): MediaType = {
      val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction0(onVDOMEvent))
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit class MediaTypeMutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVDOMEvent(value: () => Unit): Self = StObject.set(x, "onVDOMEvent", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<@nteract/transform-vdom.@nteract/transform-vdom.Props> */
  @js.native
  trait PartialProps extends StObject {
    
    var data: js.UndefOr[VDOMEl] = js.native
    
    var mediaType: js.UndefOr[applicationSlashvdomDotv1Plussignjson] = js.native
    
    var onVDOMEvent: js.UndefOr[js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]] = js.native
  }
  object PartialProps {
    
    @scala.inline
    def apply(): PartialProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialProps]
    }
    
    @scala.inline
    implicit class PartialPropsMutableBuilder[Self <: PartialProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: VDOMEl): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      @scala.inline
      def setOnVDOMEvent(value: (/* targetName */ String, /* event */ SerializedEvent[_]) => Unit): Self = StObject.set(x, "onVDOMEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnVDOMEventUndefined: Self = StObject.set(x, "onVDOMEvent", js.undefined)
    }
  }
}
