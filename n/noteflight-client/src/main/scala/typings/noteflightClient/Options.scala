package typings.noteflightClient

import typings.noteflightClient.anon.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * The height of the embedded score in pixels. Default value: 600.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The hostname of the Noteflight site containing the embedded score.
    * The default hostname is "www.noteflight.com".
    */
  var host: js.UndefOr[String] = js.undefined
  
  var viewParams: js.UndefOr[App] = js.undefined
  
  /**
    * The width of the embedded score in pixels.
    * Default value: 800.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setViewParams(value: App): Self = StObject.set(x, "viewParams", value.asInstanceOf[js.Any])
    
    inline def setViewParamsUndefined: Self = StObject.set(x, "viewParams", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
