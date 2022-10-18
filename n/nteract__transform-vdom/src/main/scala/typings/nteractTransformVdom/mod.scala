package typings.nteractTransformVdom

import typings.nteractTransformVdom.anon.MediaType
import typings.nteractTransformVdom.anon.PartialProps
import typings.nteractTransformVdom.libEventToObjectMod.SerializedEvent
import typings.nteractTransformVdom.libObjectToReactMod.VDOMEl
import typings.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nteract/transform-vdom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nteract/transform-vdom", JSImport.Default)
  @js.native
  open class default () extends VDOM
  /* static members */
  object default {
    
    @JSImport("@nteract/transform-vdom", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nteract/transform-vdom", "default.MIMETYPE")
    @js.native
    def MIMETYPE: String = js.native
    inline def MIMETYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIMETYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@nteract/transform-vdom", "default.defaultProps")
    @js.native
    def defaultProps: MediaType = js.native
    inline def defaultProps_=(x: MediaType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def objectToReactElement(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[Any], Unit]
  ): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToReactElement")(obj.asInstanceOf[js.Any], onVDOMEvent.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  trait Props extends StObject {
    
    var data: VDOMEl
    
    var mediaType: applicationSlashvdomDotv1Plussignjson
    
    def onVDOMEvent(targetName: String, event: SerializedEvent[Any]): Unit
  }
  object Props {
    
    inline def apply(data: VDOMEl, onVDOMEvent: (String, SerializedEvent[Any]) => Unit): Props = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mediaType = "application/vdom.v1+json", onVDOMEvent = js.Any.fromFunction2(onVDOMEvent))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setData(value: VDOMEl): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setOnVDOMEvent(value: (String, SerializedEvent[Any]) => Unit): Self = StObject.set(x, "onVDOMEvent", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait VDOM
    extends PureComponent[PartialProps, js.Object, Any]
}
