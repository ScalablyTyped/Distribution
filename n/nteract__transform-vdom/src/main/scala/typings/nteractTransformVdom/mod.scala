package typings.nteractTransformVdom

import typings.nteractTransformVdom.anon.MediaType
import typings.nteractTransformVdom.anon.PartialProps
import typings.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typings.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typings.nteractTransformVdom.objectToReactMod.VDOMEl
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nteract/transform-vdom", JSImport.Default)
  @js.native
  class default () extends VDOM
  /* static members */
  object default {
    
    @JSImport("@nteract/transform-vdom", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nteract/transform-vdom", "default.MIMETYPE")
    @js.native
    def MIMETYPE: String = js.native
    @scala.inline
    def MIMETYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIMETYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@nteract/transform-vdom", "default.defaultProps")
    @js.native
    def defaultProps: MediaType = js.native
    @scala.inline
    def defaultProps_=(x: MediaType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@nteract/transform-vdom", "objectToReactElement")
  @js.native
  def objectToReactElement(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    var data: VDOMEl = js.native
    
    var mediaType: applicationSlashvdomDotv1Plussignjson = js.native
    
    def onVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      data: VDOMEl,
      mediaType: applicationSlashvdomDotv1Plussignjson,
      onVDOMEvent: (String, SerializedEvent[_]) => Unit
    ): Props = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction2(onVDOMEvent))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: VDOMEl): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVDOMEvent(value: (String, SerializedEvent[_]) => Unit): Self = StObject.set(x, "onVDOMEvent", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait VDOM
    extends PureComponent[PartialProps, js.Object, js.Any]
}
