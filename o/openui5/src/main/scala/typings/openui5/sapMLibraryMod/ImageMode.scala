package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageMode extends StObject
@JSImport("sap/m/library", "ImageMode")
@js.native
object ImageMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageMode & String] = js.native
  
  /**
    * The image is rendered with 'span' tag and the 'src' property is set to the 'background-image' CSS style
    * on the output DOM element
    */
  @js.native
  sealed trait Background
    extends StObject
       with ImageMode
  /* "Background" */ val Background: typings.openui5.sapMLibraryMod.ImageMode.Background & String = js.native
  
  /**
    * The image is rendered with 'img' tag and the 'src' property is set to the src attribute on the output
    * DOM element.
    */
  @js.native
  sealed trait Image
    extends StObject
       with ImageMode
  /* "Image" */ val Image: typings.openui5.sapMLibraryMod.ImageMode.Image & String = js.native
  
  /**
    * @experimental (since 1.106)
    *
    * The image is rendered with 'div' tag, containing the inline 'svg' **Note:** Please, be aware that this
    * feature works under the Browser's Cross-Origin Resource Sharing (CORS) policy. This means that a web
    * application using those APIs can only request resources from the same origin the application was loaded
    * from unless the response from other origins includes the right CORS headers.
    */
  @js.native
  sealed trait InlineSvg
    extends StObject
       with ImageMode
  /* "InlineSvg" */ val InlineSvg: typings.openui5.sapMLibraryMod.ImageMode.InlineSvg & String = js.native
}
