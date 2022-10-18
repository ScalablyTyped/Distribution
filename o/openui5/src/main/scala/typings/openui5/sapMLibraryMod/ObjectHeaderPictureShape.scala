package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectHeaderPictureShape extends StObject
@JSImport("sap/m/library", "ObjectHeaderPictureShape")
@js.native
object ObjectHeaderPictureShape extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ObjectHeaderPictureShape & String] = js.native
  
  /**
    * Circle shape for the images in the `ObjectHeader`.
    */
  @js.native
  sealed trait Circle
    extends StObject
       with ObjectHeaderPictureShape
  /* "Circle" */ val Circle: typings.openui5.sapMLibraryMod.ObjectHeaderPictureShape.Circle & String = js.native
  
  /**
    * Square shape for the images in the `ObjectHeader`.
    */
  @js.native
  sealed trait Square
    extends StObject
       with ObjectHeaderPictureShape
  /* "Square" */ val Square: typings.openui5.sapMLibraryMod.ObjectHeaderPictureShape.Square & String = js.native
}
