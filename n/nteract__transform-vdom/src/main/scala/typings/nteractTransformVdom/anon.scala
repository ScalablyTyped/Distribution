package typings.nteractTransformVdom

import typings.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typings.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typings.nteractTransformVdom.objectToReactMod.VDOMEl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MediaType extends StObject {
    
    var mediaType: String
    
    def onVDOMEvent(): Unit
  }
  object MediaType {
    
    inline def apply(mediaType: String, onVDOMEvent: () => Unit): MediaType = {
      val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction0(onVDOMEvent))
      __obj.asInstanceOf[MediaType]
    }
    
    extension [Self <: MediaType](x: Self) {
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setOnVDOMEvent(value: () => Unit): Self = StObject.set(x, "onVDOMEvent", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<@nteract/transform-vdom.@nteract/transform-vdom.Props> */
  trait PartialProps extends StObject {
    
    var data: js.UndefOr[VDOMEl] = js.undefined
    
    var mediaType: js.UndefOr[applicationSlashvdomDotv1Plussignjson] = js.undefined
    
    var onVDOMEvent: js.UndefOr[js.Function2[/* targetName */ String, /* event */ SerializedEvent[Any], Unit]] = js.undefined
  }
  object PartialProps {
    
    inline def apply(): PartialProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialProps]
    }
    
    extension [Self <: PartialProps](x: Self) {
      
      inline def setData(value: VDOMEl): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setOnVDOMEvent(value: (/* targetName */ String, /* event */ SerializedEvent[Any]) => Unit): Self = StObject.set(x, "onVDOMEvent", js.Any.fromFunction2(value))
      
      inline def setOnVDOMEventUndefined: Self = StObject.set(x, "onVDOMEvent", js.undefined)
    }
  }
}
