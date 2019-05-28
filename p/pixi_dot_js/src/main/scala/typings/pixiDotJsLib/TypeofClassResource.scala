package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassResource
  extends org.scalablytyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      (/* url */ js.Array[java.lang.String]) | (/* url */ java.lang.String), 
      pixiDotJsLib.PIXINs.loadersNs.Resource
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* name */ java.lang.String, 
      (/* url */ js.Array[java.lang.String]) | (/* url */ java.lang.String), 
      /* options */ pixiDotJsLib.PIXINs.loadersNs.LoaderOptions, 
      pixiDotJsLib.PIXINs.loadersNs.Resource
    ] {
  var EMPTY_GIF: java.lang.String = js.native
  def setExtensionLoadType(extname: java.lang.String, loadType: pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE): scala.Unit = js.native
  def setExtensionXhrType(extname: java.lang.String, xhrType: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE): scala.Unit = js.native
}

